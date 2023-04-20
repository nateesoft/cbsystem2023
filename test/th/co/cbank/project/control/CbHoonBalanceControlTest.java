/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbHoonBalanceBean;
import th.co.cbank.project.model.CbHoonSummaryBean;

/**
 *
 * @author Acer
 */
public class CbHoonBalanceControlTest {
    
    public CbHoonBalanceControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalHoonVolumn method, of class CbHoonBalanceControl.
     */
    @Test
    public void testGetTotalHoonVolumn() {
        System.out.println("getTotalHoonVolumn");
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        double expResult = 0.0;
        double result = instance.getTotalHoonVolumn();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveToClear method, of class CbHoonBalanceControl.
     */
    @Test
    public void testSaveToClear() {
        System.out.println("saveToClear");
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.saveToClear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveHoonSummary method, of class CbHoonBalanceControl.
     */
    @Test
    public void testSaveHoonSummary() {
        System.out.println("saveHoonSummary");
        CbHoonSummaryBean bean = null;
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.saveHoonSummary(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkExitYearAt method, of class CbHoonBalanceControl.
     */
    @Test
    public void testCheckExitYearAt() {
        System.out.println("checkExitYearAt");
        String year_at = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        boolean expResult = false;
        boolean result = instance.checkExitYearAt(year_at);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoonBalance method, of class CbHoonBalanceControl.
     */
    @Test
    public void testGetHoonBalance() {
        System.out.println("getHoonBalance");
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        List<CbHoonBalanceBean> expResult = null;
        List<CbHoonBalanceBean> result = instance.getHoonBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateHoonSummary method, of class CbHoonBalanceControl.
     */
    @Test
    public void testUpdateHoonSummary() {
        System.out.println("updateHoonSummary");
        CbHoonSummaryBean bean = null;
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.updateHoonSummary(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDevidendPointWhereHoonCode method, of class CbHoonBalanceControl.
     */
    @Test
    public void testUpdateDevidendPointWhereHoonCode() {
        System.out.println("updateDevidendPointWhereHoonCode");
        double dividend = 0.0;
        double mTotalPoint = 0.0;
        double totalARAmount = 0.0;
        String year_at = "";
        String HoonCode = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.updateDevidendPointWhereHoonCode(dividend, mTotalPoint, totalARAmount, year_at, HoonCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteHoonSummaryHistory method, of class CbHoonBalanceControl.
     */
    @Test
    public void testDeleteHoonSummaryHistory() {
        System.out.println("deleteHoonSummaryHistory");
        String HoonCode = "";
        String year_at = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.deleteHoonSummaryHistory(HoonCode, year_at);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of backupHoonSummaryHistory method, of class CbHoonBalanceControl.
     */
    @Test
    public void testBackupHoonSummaryHistory() {
        System.out.println("backupHoonSummaryHistory");
        String HoonCode = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.backupHoonSummaryHistory(HoonCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateYearAtWhereHoonCode method, of class CbHoonBalanceControl.
     */
    @Test
    public void testUpdateYearAtWhereHoonCode() {
        System.out.println("updateYearAtWhereHoonCode");
        String year_at = "";
        String HoonCode = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.updateYearAtWhereHoonCode(year_at, HoonCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateArAmountWhereHoonCode method, of class CbHoonBalanceControl.
     */
    @Test
    public void testUpdateArAmountWhereHoonCode() {
        System.out.println("updateArAmountWhereHoonCode");
        double totalBalanceAmount = 0.0;
        String HoonCode = "";
        CbHoonBalanceControl instance = new CbHoonBalanceControl();
        instance.updateArAmountWhereHoonCode(totalBalanceAmount, HoonCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
