/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.control.AddressControl;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbBondsmanControl;
import th.co.cbank.project.control.CbCancelAccountControl;
import th.co.cbank.project.control.CbExpTransactionControl;
import th.co.cbank.project.control.CbExpenseControl;
import th.co.cbank.project.control.CbFeeControl;
import th.co.cbank.project.control.CbFeeTransactionControl;
import th.co.cbank.project.control.CbGroupControl;
import th.co.cbank.project.control.CbHoonConfigControl;
import th.co.cbank.project.control.CbHoonSummaryControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbMemberTypeControl;
import th.co.cbank.project.control.CbPrefixControl;
import th.co.cbank.project.control.CbProjectControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.CbStatusControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.CbUserControl;
import th.co.cbank.project.control.CbWithdrawAllowControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.EnableControl;
import th.co.cbank.project.control.LoginControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.SaveSummaryControl;
import th.co.cbank.project.control.SettingControl;

/**
 *
 * @author Acer
 */
public class BaseDialogSwingTest {
    
    public BaseDialogSwingTest() {
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
     * Test of getProfileControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetProfileControl() {
        System.out.println("getProfileControl");
        BaseDialogSwing instance = null;
        ProfileControl expResult = null;
        ProfileControl result = instance.getProfileControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBranchControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetBranchControl() {
        System.out.println("getBranchControl");
        BaseDialogSwing instance = null;
        BranchControl expResult = null;
        BranchControl result = instance.getBranchControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfigControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetConfigControl() {
        System.out.println("getConfigControl");
        BaseDialogSwing instance = null;
        ConfigControl expResult = null;
        ConfigControl result = instance.getConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoonConfigControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetHoonConfigControl() {
        System.out.println("getHoonConfigControl");
        BaseDialogSwing instance = null;
        CbHoonConfigControl expResult = null;
        CbHoonConfigControl result = instance.getHoonConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaveConfigControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetSaveConfigControl() {
        System.out.println("getSaveConfigControl");
        BaseDialogSwing instance = null;
        CbSaveConfigControl expResult = null;
        CbSaveConfigControl result = instance.getSaveConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanConfigControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetLoanConfigControl() {
        System.out.println("getLoanConfigControl");
        BaseDialogSwing instance = null;
        CbLoanConfigControl expResult = null;
        CbLoanConfigControl result = instance.getLoanConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSettingControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetSettingControl() {
        System.out.println("getSettingControl");
        BaseDialogSwing instance = null;
        SettingControl expResult = null;
        SettingControl result = instance.getSettingControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetUserControl() {
        System.out.println("getUserControl");
        BaseDialogSwing instance = null;
        CbUserControl expResult = null;
        CbUserControl result = instance.getUserControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbFeeControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbFeeControl() {
        System.out.println("getCbFeeControl");
        BaseDialogSwing instance = null;
        CbFeeControl expResult = null;
        CbFeeControl result = instance.getCbFeeControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpenseControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetExpenseControl() {
        System.out.println("getExpenseControl");
        BaseDialogSwing instance = null;
        CbExpenseControl expResult = null;
        CbExpenseControl result = instance.getExpenseControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaveAccountControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetSaveAccountControl() {
        System.out.println("getSaveAccountControl");
        BaseDialogSwing instance = null;
        CbSaveAccountControl expResult = null;
        CbSaveAccountControl result = instance.getSaveAccountControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanAccountControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetLoanAccountControl() {
        System.out.println("getLoanAccountControl");
        BaseDialogSwing instance = null;
        CbLoanAccountControl expResult = null;
        CbLoanAccountControl result = instance.getLoanAccountControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbBondsmanControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbBondsmanControl() {
        System.out.println("getCbBondsmanControl");
        BaseDialogSwing instance = null;
        CbBondsmanControl expResult = null;
        CbBondsmanControl result = instance.getCbBondsmanControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbFeeTransactionControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbFeeTransactionControl() {
        System.out.println("getCbFeeTransactionControl");
        BaseDialogSwing instance = null;
        CbFeeTransactionControl expResult = null;
        CbFeeTransactionControl result = instance.getCbFeeTransactionControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbLoanTablePaymentControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbLoanTablePaymentControl() {
        System.out.println("getCbLoanTablePaymentControl");
        BaseDialogSwing instance = null;
        CbLoanTablePaymentControl expResult = null;
        CbLoanTablePaymentControl result = instance.getCbLoanTablePaymentControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbTransactionLoanControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbTransactionLoanControl() {
        System.out.println("getCbTransactionLoanControl");
        BaseDialogSwing instance = null;
        CbTransactionLoanControl expResult = null;
        CbTransactionLoanControl result = instance.getCbTransactionLoanControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbWithdrawAllowControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbWithdrawAllowControl() {
        System.out.println("getCbWithdrawAllowControl");
        BaseDialogSwing instance = null;
        CbWithdrawAllowControl expResult = null;
        CbWithdrawAllowControl result = instance.getCbWithdrawAllowControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaveSummaryControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetSaveSummaryControl() {
        System.out.println("getSaveSummaryControl");
        BaseDialogSwing instance = null;
        SaveSummaryControl expResult = null;
        SaveSummaryControl result = instance.getSaveSummaryControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbTransactionSaveControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbTransactionSaveControl() {
        System.out.println("getCbTransactionSaveControl");
        BaseDialogSwing instance = null;
        CbTransactionSaveControl expResult = null;
        CbTransactionSaveControl result = instance.getCbTransactionSaveControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProjectControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetProjectControl() {
        System.out.println("getProjectControl");
        BaseDialogSwing instance = null;
        CbProjectControl expResult = null;
        CbProjectControl result = instance.getProjectControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrefixControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetPrefixControl() {
        System.out.println("getPrefixControl");
        BaseDialogSwing instance = null;
        CbPrefixControl expResult = null;
        CbPrefixControl result = instance.getPrefixControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetStatusControl() {
        System.out.println("getStatusControl");
        BaseDialogSwing instance = null;
        CbStatusControl expResult = null;
        CbStatusControl result = instance.getStatusControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbExpTransactionControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbExpTransactionControl() {
        System.out.println("getCbExpTransactionControl");
        BaseDialogSwing instance = null;
        CbExpTransactionControl expResult = null;
        CbExpTransactionControl result = instance.getCbExpTransactionControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbCancelAccountControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetCbCancelAccountControl() {
        System.out.println("getCbCancelAccountControl");
        BaseDialogSwing instance = null;
        CbCancelAccountControl expResult = null;
        CbCancelAccountControl result = instance.getCbCancelAccountControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetLoginControl() {
        System.out.println("getLoginControl");
        BaseDialogSwing instance = null;
        LoginControl expResult = null;
        LoginControl result = instance.getLoginControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSummaryControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetSummaryControl() {
        System.out.println("getSummaryControl");
        BaseDialogSwing instance = null;
        CbHoonSummaryControl expResult = null;
        CbHoonSummaryControl result = instance.getSummaryControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetAddressControl() {
        System.out.println("getAddressControl");
        BaseDialogSwing instance = null;
        AddressControl expResult = null;
        AddressControl result = instance.getAddressControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemberTypeControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetMemberTypeControl() {
        System.out.println("getMemberTypeControl");
        BaseDialogSwing instance = null;
        CbMemberTypeControl expResult = null;
        CbMemberTypeControl result = instance.getMemberTypeControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnableControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetEnableControl() {
        System.out.println("getEnableControl");
        BaseDialogSwing instance = null;
        EnableControl expResult = null;
        EnableControl result = instance.getEnableControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupControl method, of class BaseDialogSwing.
     */
    @Test
    public void testGetGroupControl() {
        System.out.println("getGroupControl");
        BaseDialogSwing instance = null;
        CbGroupControl expResult = null;
        CbGroupControl result = instance.getGroupControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
