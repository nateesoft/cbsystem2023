package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class BillARBean {

    private String Ref_No;
    private Date Ondate;
    private String ArCode;
    private double Stotal = 0.00;
    private double Cash = 0.00;
    private double Cupon = 0.00;
    private double Credit = 0.00;
    private String Terminal;
    private String Cashier;
    private String Fat;
    private String UserVoid;
    private String arName;

}
