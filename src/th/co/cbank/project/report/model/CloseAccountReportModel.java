package th.co.cbank.project.report.model;

import java.util.Date;
import lombok.Data;

@Data
public class CloseAccountReportModel {

    private Date t_date;
    private String t_time;
    private String cust_name;
    private String t_acccode;
    private double t_amount;
    private double t_balance;
    private String t_empcode;
    private String branch_code;

}
