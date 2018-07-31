package co.astrnt.managersdk.dao;

import java.util.List;

/**
 * Created by deni rohimat on 23/07/18
 */
public class ListCompanyApiDao extends BaseApiDao {

    private List<CompanyApiDao> integration_company_list;

    public List<CompanyApiDao> getIntegration_company_list() {
        return integration_company_list;
    }

    public void setIntegration_company_list(List<CompanyApiDao> integration_company_list) {
        this.integration_company_list = integration_company_list;
    }
}
