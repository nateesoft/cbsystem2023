package th.co.cbank.project.report.model;

import lombok.Data;

@Data
public class ShowLoanAccountModel {

    private String loan_docno;
    private String loanName;
    private double loan_amount;

}
