package th.co.cbank.project.model;

import java.sql.Timestamp;
import java.util.Date;

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

    public String getHoonCode() {
        return HoonCode;
    }

    public void setHoonCode(String HoonCode) {
        this.HoonCode = HoonCode;
    }

    public Timestamp getHoonLastUpdate() {
        return HoonLastUpdate;
    }

    public void setHoonLastUpdate(Timestamp HoonLastUpdate) {
        this.HoonLastUpdate = HoonLastUpdate;
    }

    public int getHoonVolumn() {
        return HoonVolumn;
    }

    public void setHoonVolumn(int HoonVolumn) {
        this.HoonVolumn = HoonVolumn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getDevidend() {
        return Devidend;
    }

    public void setDevidend(double Devidend) {
        this.Devidend = Devidend;
    }

    public double getARAmount() {
        return ARAmount;
    }

    public void setARAmount(double ARAmount) {
        this.ARAmount = ARAmount;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int Point) {
        this.Point = Point;
    }

    public double getDeposit1() {
        return Deposit1;
    }

    public void setDeposit1(double Deposit1) {
        this.Deposit1 = Deposit1;
    }

    public double getDeposit2() {
        return Deposit2;
    }

    public void setDeposit2(double Deposit2) {
        this.Deposit2 = Deposit2;
    }

    public double getPriceFirst() {
        return PriceFirst;
    }

    public void setPriceFirst(double PriceFirst) {
        this.PriceFirst = PriceFirst;
    }

    public Date getDateFirst() {
        return DateFirst;
    }

    public void setDateFirst(Date DateFirst) {
        this.DateFirst = DateFirst;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getYear_At() {
        return Year_At;
    }

    public void setYear_At(String Year_At) {
        this.Year_At = Year_At;
    }

}
