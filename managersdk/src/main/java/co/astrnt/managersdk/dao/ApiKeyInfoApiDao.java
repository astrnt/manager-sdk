package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 26/07/18
 */
public class ApiKeyInfoApiDao extends BaseApiDao {

    private CompanyInfoApiDao company_info;

    public CompanyInfoApiDao getCompany_info() {
        return company_info;
    }

    public void setCompany_info(CompanyInfoApiDao company_info) {
        this.company_info = company_info;
    }
}
