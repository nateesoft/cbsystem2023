package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class BalanceBean {

    private String B_CUST_CODE;
    private String B_CUST_NAME;
    private String B_CUST_LASTNAME;
    private double B_BALANCE = 0.00;
    private double B_INTEREST = 0.000;
    private Date B_START;
    private String B_TYPE;

}
