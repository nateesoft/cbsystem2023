package th.co.cbank.project.model;

import lombok.Data;

@Data
public class SaveSummaryBean {

    private int accountAll;//บัญชีทั้งหมด
    private int closeAll;//ปิดบัญชีทั้งหมด
    private double saveAll;//จำนวนเงินฝาก
    private double interestAll;//จำนวนดอกเบี้ยสะสม
    private double totalBalanceAll;//จำนวนคงเหลือ
    private int accountToday;//เปิดบัญชีวันนี้
    private int closeToday;//ปิดบัญชีวันนี้
    private double saveToday;//ฝากเงินวันนี้
    private double withdrawToday;//ถอนเงินวันนี้
    private double totalBalanceToday;//ยอดคงเหลือต่อวัน
    private double feeToday;//จำนวนค่าธรรมเนียม
    private int account_hoon_all = 0;//จำนวนผู้ถือหุ้นทั้งหมด
    private int hoon_balance_all = 0;//จำนวนหุ้นทั้งหมดในระบบ
    private double hoon_value_amount_all = 0.00;//มูลค่าหุ้นทั้งหมด
    private int account_hoon_today = 0;//ผู้ถือหุ้นใหม่วันนี้
    private int hoon_buy_today = 0;//จำนวนหุ้นที่ซื้อวันนี้
    private int hoon_sale_today = 0;//จำนวนหุ้นที่ขายวันนี้
    private int hoon_transfer_today = 0;//จำนวนหุ้นที่โอนวันนี้
    private int hoon_qty_today = 0;//จำนวนหุ้นคงเหลือวันนี้
    private double hoon_value_amount_today = 0.00;//มูลค่าหุ้นวันนี้       
    private int account_loan_all = 0;//จำนวนผู้กู้เงินทั้งหมด
    private double loan_balance_all = 0.00;//จำนวนเงินกู้ทั้งหมด
    private double loan_fee_all = 0.00;//จำนวนค่าปรับทั้งหมด
    private int account_loan_today = 0;//จำนวนผู้กู้เงินใหม่วันนี้
    private double loan_balance_today = 0.00;//จำนวนเงินกู้วันนี้
    private int people_payment_today = 0;//จำนวนผู้มาชำระเงิน
    private double payment_loan_amont = 0.00;//รวมยอดชำระวันนี้
    private double loan_fee_today = 0.00;//รับค่าปรับวันนี้

}
