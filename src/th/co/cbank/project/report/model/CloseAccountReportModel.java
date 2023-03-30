package th.co.cbank.project.report.model;

import java.util.Date;

public class CloseAccountReportModel {

    private Date t_date;
    private String t_time;
    private String cust_name;
    private String t_acccode;
    private double t_amount;
    private double t_balance;
    private String t_empcode;
    private String branch_code;

    public Date getT_date() {
        return t_date;
    }

    public void setT_date(Date t_date) {
        this.t_date = t_date;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getT_acccode() {
        return t_acccode;
    }

    public void setT_acccode(String t_acccode) {
        this.t_acccode = t_acccode;
    }

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
    }

    public double getT_balance() {
        return t_balance;
    }

    public void setT_balance(double t_balance) {
        this.t_balance = t_balance;
    }

    public String getT_empcode() {
        return t_empcode;
    }

    public void setT_empcode(String t_empcode) {
        this.t_empcode = t_empcode;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

}
