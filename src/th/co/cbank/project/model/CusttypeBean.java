package th.co.cbank.project.model;

import lombok.Data;

@Data
public class CusttypeBean {

    private String SP_Type;
    private String SP_TypeName;
    private double SP_CrAmount = 0.00;
    private int SP_CreditDays = 0;
    private double SP_Interest = 0.00;

}
