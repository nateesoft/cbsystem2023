package th.co.cbank.project.model;

import lombok.Data;

@Data
public class CbWithdrawAllowBean {

    private String account_no;
    private int allow_person_qty = 0;
    private int index = 0;
    private String cust_code;
    private String cust_name;
    private String cust_surname;

}
