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
import th.co.cbank.project.control.CbFeeControl;
import th.co.cbank.project.control.CbFeeTransactionControl;
import th.co.cbank.project.control.CbHoonConfigControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.CbWithdrawAllowControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.DocumentGarunteeControl;
import th.co.cbank.project.control.ModelControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.SaveSummaryControl;

/**
 *
 * @author Acer
 */
public class BaseSwingTest {
    
    public BaseSwingTest() {
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
     * Test of getSaveAccountControl method, of class BaseSwing.
     */
    @Test
    public void testGetSaveAccountControl() {
        System.out.println("getSaveAccountControl");
        BaseSwing instance = new BaseSwing();
        CbSaveAccountControl expResult = null;
        CbSaveAccountControl result = instance.getSaveAccountControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanAccountControl method, of class BaseSwing.
     */
    @Test
    public void testGetLoanAccountControl() {
        System.out.println("getLoanAccountControl");
        BaseSwing instance = new BaseSwing();
        CbLoanAccountControl expResult = null;
        CbLoanAccountControl result = instance.getLoanAccountControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBranchControl method, of class BaseSwing.
     */
    @Test
    public void testGetBranchControl() {
        System.out.println("getBranchControl");
        BaseSwing instance = new BaseSwing();
        BranchControl expResult = null;
        BranchControl result = instance.getBranchControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfileControl method, of class BaseSwing.
     */
    @Test
    public void testGetProfileControl() {
        System.out.println("getProfileControl");
        BaseSwing instance = new BaseSwing();
        ProfileControl expResult = null;
        ProfileControl result = instance.getProfileControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanConfigControl method, of class BaseSwing.
     */
    @Test
    public void testGetLoanConfigControl() {
        System.out.println("getLoanConfigControl");
        BaseSwing instance = new BaseSwing();
        CbLoanConfigControl expResult = null;
        CbLoanConfigControl result = instance.getLoanConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaveConfigControl method, of class BaseSwing.
     */
    @Test
    public void testGetSaveConfigControl() {
        System.out.println("getSaveConfigControl");
        BaseSwing instance = new BaseSwing();
        CbSaveConfigControl expResult = null;
        CbSaveConfigControl result = instance.getSaveConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfigControl method, of class BaseSwing.
     */
    @Test
    public void testGetConfigControl() {
        System.out.println("getConfigControl");
        BaseSwing instance = new BaseSwing();
        ConfigControl expResult = null;
        ConfigControl result = instance.getConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressControl method, of class BaseSwing.
     */
    @Test
    public void testGetAddressControl() {
        System.out.println("getAddressControl");
        BaseSwing instance = new BaseSwing();
        AddressControl expResult = null;
        AddressControl result = instance.getAddressControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbBondsmanControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbBondsmanControl() {
        System.out.println("getCbBondsmanControl");
        BaseSwing instance = new BaseSwing();
        CbBondsmanControl expResult = null;
        CbBondsmanControl result = instance.getCbBondsmanControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbFeeControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbFeeControl() {
        System.out.println("getCbFeeControl");
        BaseSwing instance = new BaseSwing();
        CbFeeControl expResult = null;
        CbFeeControl result = instance.getCbFeeControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbFeeTransactionControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbFeeTransactionControl() {
        System.out.println("getCbFeeTransactionControl");
        BaseSwing instance = new BaseSwing();
        CbFeeTransactionControl expResult = null;
        CbFeeTransactionControl result = instance.getCbFeeTransactionControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbLoanTablePaymentControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbLoanTablePaymentControl() {
        System.out.println("getCbLoanTablePaymentControl");
        BaseSwing instance = new BaseSwing();
        CbLoanTablePaymentControl expResult = null;
        CbLoanTablePaymentControl result = instance.getCbLoanTablePaymentControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbTransactionLoanControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbTransactionLoanControl() {
        System.out.println("getCbTransactionLoanControl");
        BaseSwing instance = new BaseSwing();
        CbTransactionLoanControl expResult = null;
        CbTransactionLoanControl result = instance.getCbTransactionLoanControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbWithdrawAllowControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbWithdrawAllowControl() {
        System.out.println("getCbWithdrawAllowControl");
        BaseSwing instance = new BaseSwing();
        CbWithdrawAllowControl expResult = null;
        CbWithdrawAllowControl result = instance.getCbWithdrawAllowControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumentGarunteeControl method, of class BaseSwing.
     */
    @Test
    public void testGetDocumentGarunteeControl() {
        System.out.println("getDocumentGarunteeControl");
        BaseSwing instance = new BaseSwing();
        DocumentGarunteeControl expResult = null;
        DocumentGarunteeControl result = instance.getDocumentGarunteeControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoonConfigControl method, of class BaseSwing.
     */
    @Test
    public void testGetHoonConfigControl() {
        System.out.println("getHoonConfigControl");
        BaseSwing instance = new BaseSwing();
        CbHoonConfigControl expResult = null;
        CbHoonConfigControl result = instance.getHoonConfigControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaveSummaryControl method, of class BaseSwing.
     */
    @Test
    public void testGetSaveSummaryControl() {
        System.out.println("getSaveSummaryControl");
        BaseSwing instance = new BaseSwing();
        SaveSummaryControl expResult = null;
        SaveSummaryControl result = instance.getSaveSummaryControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCbTransactionSaveControl method, of class BaseSwing.
     */
    @Test
    public void testGetCbTransactionSaveControl() {
        System.out.println("getCbTransactionSaveControl");
        BaseSwing instance = new BaseSwing();
        CbTransactionSaveControl expResult = null;
        CbTransactionSaveControl result = instance.getCbTransactionSaveControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelControl method, of class BaseSwing.
     */
    @Test
    public void testGetModelControl() {
        System.out.println("getModelControl");
        BaseSwing instance = new BaseSwing();
        ModelControl expResult = null;
        ModelControl result = instance.getModelControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
