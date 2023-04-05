package th.co.cbank.project.model;

import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;

@Data
public class CbHoonBalanceBean {

    private String HoonCode;
    private Timestamp HoonLastUpdate;
    private int HoonVolumn;
    private String Name;
    private String LastName;
    private double Devidend;
    private double ARAmount;
    private int Point;
    private double Deposit1;
    private double Deposit2;
    private double PriceFirst;
    private Date DateFirst;
    private String CardNo;
    private String Year_At;

}
