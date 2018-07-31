package co.astrnt.managersdk.dao;

/**
 * Created by deni rohimat on 31/07/18
 */
public class CompanyApiDao {

    private String name;
    private String logo;
    private String company_identifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCompany_identifier() {
        return company_identifier;
    }

    public void setCompany_identifier(String company_identifier) {
        this.company_identifier = company_identifier;
    }
}
