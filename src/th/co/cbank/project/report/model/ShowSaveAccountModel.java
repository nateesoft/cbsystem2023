package th.co.cbank.project.report.model;

public class ShowSaveAccountModel {

    private String account_code;
    private String typeName;
    private double b_balance;

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getB_balance() {
        return b_balance;
    }

    public void setB_balance(double b_balance) {
        this.b_balance = b_balance;
    }

}
