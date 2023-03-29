package test.save;

import th.co.cbank.project.view.TransactionAdvanceMethod;

public class TestTransactionAdvanceMethod {

    public static void main(String[] args) {
        String custCode = "3610400470721";
        String accCode = "00310000001";
        double netBalance = 500;
        double textInt = 0;
        TransactionAdvanceMethod.updateSaveAccountAndProfile(custCode, accCode, netBalance, textInt);
    }

}
