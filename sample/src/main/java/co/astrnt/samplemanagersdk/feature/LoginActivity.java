package co.astrnt.samplemanagersdk.feature;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.astrnt.managersdk.core.MyObserver;
import co.astrnt.managersdk.dao.LoginApiDao;
import co.astrnt.managersdk.repository.CompanyRepository;
import co.astrnt.samplemanagersdk.R;
import co.astrnt.samplemanagersdk.base.BaseActivity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private CompanyRepository mCompanyRepository;
    private AppCompatEditText inpPassword, inpEmail;
    private Button btnSubmit;
    private ProgressDialog progressDialog;

    public static void start(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = this;

        inpEmail = findViewById(R.id.inp_email);
        inpPassword = findViewById(R.id.inp_password);
        btnSubmit = findViewById(R.id.btn_submit);

        mCompanyRepository = new CompanyRepository(getApi());

        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_submit:
                validateInput();
                break;
        }
    }

    private void validateInput() {

        String email = inpEmail.getText().toString();
        String password = inpPassword.getText().toString();

        if (TextUtils.isEmpty(email)) {
            inpEmail.setError("Email still empty");
            inpEmail.setFocusable(true);
            return;
        }

        if (TextUtils.isEmpty(password)) {
            inpPassword.setError("Password still empty");
            inpPassword.setFocusable(true);
            return;
        }
        doLogin(email, password);
    }

    private void doLogin(final String email, final String password) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        mCompanyRepository.getApiKey(email, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MyObserver<LoginApiDao>() {

                    @Override
                    public void onApiResultCompleted() {
                        progressDialog.dismiss();
                    }

                    @Override
                    public void onApiResultError(String message, String code) {
                        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onApiResultOk(LoginApiDao loginApiDao) {
                        if (loginApiDao.getApi_key() != null) {
                            managerSDK.setApiKey(loginApiDao.getApi_key());
                            ListJobActivity.start(context);
                        }
                    }
                });
    }

}
