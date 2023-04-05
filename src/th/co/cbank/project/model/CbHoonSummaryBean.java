package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbHoonSummaryBean {

    private String year_at;
    private Date action_time;
    private String user_action;
    private double profit_total = 0.00;
    private int reduce_value_second = 0;
    private int reduce_benefit = 0;
    private double reduce_v_baht = 0.00;
    private double reduce_b_baht = 0.00;
    private double balance_total = 0.00;
    private double dividend_buy = 0.00;
    private double dividend_money = 0.00;
    private double dividend_by = 0.00;
    private double dividend_baht = 0.00;
    private double dividend_value_baht = 0.00;

}
