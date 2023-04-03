package th.co.cbank.project.report.model;

import java.util.Date;
import lombok.Data;

@Data
public class OpenAccountReportModel {

    private Date b_start;
    private String account_code;
    private String type_name;
    private double b_fee;
    private String typeName;
    private String cust_name;
    private String emp_code;
    private String branch_code;

}
