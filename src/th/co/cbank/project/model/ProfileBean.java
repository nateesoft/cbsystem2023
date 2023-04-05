package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class ProfileBean {

    private int p_index = 0;
    private String p_custCode;
    private String p_custType = "M";
    private String p_custName;
    private String p_custSurname;
    private Date p_custBirthDay;
    private int p_custAge = 1;
    private String p_custSex;
    private String p_custOccupation;
    private String p_custNation;
    private String p_cust_status;
    private String p_cust_religion;
    private Date p_member_start;
    private Date p_member_end;
    private String p_spouse_name;
    private String p_spouse_surname;
    private String p_spouse_sex;
    private String p_cust_pic_url;
    private double p_fee = 0.00;    
    private String Status;
    private int Hoon_Qty;
    private int Member_Point;
    private double AR_Balance;
    private double Save_Balance;
    private double Loan_Balance;
    private double Loan_Credit_Amt;
    private double Loan_Credit_Balance;
    private String p_prefix;
    private String p_member_type;
    // สำหรับข้อมูลดาวอินคา
    private int DowInCar_Target_Rai;
    private Date DowInCar_Target_Date;
    private int DowInCar_Target_Tree;
    private double p_down_fee = 0.00;
    private Date Card_Expire;
    private int ApproveLimit;

}
