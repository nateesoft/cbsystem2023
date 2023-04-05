package th.co.cbank.project.model;

import lombok.Data;

@Data
public class ReportOrangeBean {

    private String date;
    private String type;
    private String start;
    private String payStart;
    private String payInt;
    private String balance;
    private double fee;
    private String line;
    private String cashier;

}
