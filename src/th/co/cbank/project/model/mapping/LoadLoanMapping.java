package th.co.cbank.project.model.mapping;

import lombok.Data;

@Data
public class LoadLoanMapping {

    private String loan_docno;
    private double loan_credit_balance;
    private double loan_fee;
    private String loan_type;
    private String loanName;
    private String book_no;

}
