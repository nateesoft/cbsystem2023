package th.co.cbank.project.report.model;

import lombok.Data;

@Data
public class ShowSaveAccountModel {

    private String account_code;
    private String typeName;
    private double b_balance;

}
