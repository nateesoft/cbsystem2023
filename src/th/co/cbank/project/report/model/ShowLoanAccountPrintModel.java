package th.co.cbank.project.report.model;

public class ShowLoanAccountPrintModel {

    private String loan_docno;
    private String p_custName;
    private String p_custSurname;

    public String getLoan_docno() {
        return loan_docno;
    }

    public void setLoan_docno(String loan_docno) {
        this.loan_docno = loan_docno;
    }

    public String getP_custName() {
        return p_custName;
    }

    public void setP_custName(String p_custName) {
        this.p_custName = p_custName;
    }

    public String getP_custSurname() {
        return p_custSurname;
    }

    public void setP_custSurname(String p_custSurname) {
        this.p_custSurname = p_custSurname;
    }

}
