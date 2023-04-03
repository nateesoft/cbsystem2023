package th.co.cbank.project.report.model;

import java.util.Date;
import lombok.Data;

@Data
public class HoonReportAllModel {

    private String t_docno;
    private Date t_date;
    private String t_time;
    private String t_description;
    private double t_amount;
    private String t_custcode;
    private String p_custName;
    private String p_custSurname;
    private String t_empcode;
    private String code;

}
