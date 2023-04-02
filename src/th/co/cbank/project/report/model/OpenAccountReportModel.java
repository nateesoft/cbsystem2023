package th.co.cbank.project.report.model;

import java.util.Date;

public class OpenAccountReportModel {

    private Date b_start;
    private String account_code;
    private String type_name;
    private double b_fee;
    private String typeName;
    private String cust_name;
    private String emp_code;
    private String branch_code;

    public Date getB_start() {
        return b_start;
    }

    public void setB_start(Date b_start) {
        this.b_start = b_start;
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public double getB_fee() {
        return b_fee;
    }

    public void setB_fee(double b_fee) {
        this.b_fee = b_fee;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

}
