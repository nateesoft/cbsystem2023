package test.save;

import th.co.cbank.project.control.CbSaveAccountControl;

public class TestSaveAccountControl {
    
    public static void main(String[] args) {
        CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
        saveAccountControl.updateSummaryBalanceFromTransaction("3610400470721", "");
    }
}
