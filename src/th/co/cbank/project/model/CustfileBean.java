package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CustfileBean {

    private String SP_Code;
    private String SP_Desc;
    private String Sp_Desc2;
    private String SP_Type;
    private String SP_Addr1;
    private String SP_Addr2;
    private String SP_Zip;
    private String SP_Contact;
    private String SP_Tel;
    private String SP_Fax;
    private String SP_Remark;
    private Date SP_UpdateDate;
    private String SP_Tax;
    private int SP_CreditDays = 0;
    private double SP_CrAmount = 0.00;
    private Date lastdate;
    private double chqpay;
    private Date lastpay;
    private double sumamt;

}
