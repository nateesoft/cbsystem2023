package th.co.cbank.project.report.model;

import java.util.Date;
import lombok.Data;

@Data
public class SaveReportAllModel {

    private double t_amount;
    private Date t_date;
    private String t_time;
    private String t_acccode;
    private String t_description;
    private double t_balance;
    private String t_custcode;
    private String b_cust_name;
    private String b_cust_lastname;
    private String t_empcode;
    private String branch_code;

}
