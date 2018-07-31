package co.astrnt.managersdk.dao;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by deni rohimat on 23/07/18
 */
public class QuestionApiDao implements Parcelable {

    private String title;
    private int takesCount;
    private String prepTime;
    private String maxTime;
    private String question_identifier;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTakesCount() {
        return takesCount;
    }

    public void setTakesCount(int takesCount) {
        this.takesCount = takesCount;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getQuestion_identifier() {
        return question_identifier;
    }

    public void setQuestion_identifier(String question_identifier) {
        this.question_identifier = question_identifier;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeInt(this.takesCount);
        dest.writeString(this.prepTime);
        dest.writeString(this.maxTime);
        dest.writeString(this.question_identifier);
    }

    public QuestionApiDao() {
    }

    protected QuestionApiDao(Parcel in) {
        this.title = in.readString();
        this.takesCount = in.readInt();
        this.prepTime = in.readString();
        this.maxTime = in.readString();
        this.question_identifier = in.readString();
    }

    public static final Creator<QuestionApiDao> CREATOR = new Creator<QuestionApiDao>() {
        @Override
        public QuestionApiDao createFromParcel(Parcel source) {
            return new QuestionApiDao(source);
        }

        @Override
        public QuestionApiDao[] newArray(int size) {
            return new QuestionApiDao[size];
        }
    };
}
