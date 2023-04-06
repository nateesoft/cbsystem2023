/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbLoanConfigBean;

/**
 *
 * @author Acer
 */
public class CbLoanConfigControlTest {
    
    public CbLoanConfigControlTest() {
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
     * Test of getMaxInt method, of class CbLoanConfigControl.
     */
    @Test
    public void testGetMaxInt() {
        System.out.println("getMaxInt");
        String LoanCode = "";
        CbLoanConfigControl instance = new CbLoanConfigControl();
        int expResult = 0;
        int result = instance.getMaxInt(LoanCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingBean method, of class CbLoanConfigControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbLoanConfigControl instance = new CbLoanConfigControl();
        List<CbLoanConfigBean> expResult = null;
        List<CbLoanConfigBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listLoanConfig method, of class CbLoanConfigControl.
     */
    @Test
    public void testListLoanConfig() {
        System.out.println("listLoanConfig");
        CbLoanConfigControl instance = new CbLoanConfigControl();
        List<CbLoanConfigBean> expResult = null;
        List<CbLoanConfigBean> result = instance.listLoanConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listLoanConfigHistory method, of class CbLoanConfigControl.
     */
    @Test
    public void testListLoanConfigHistory() {
        System.out.println("listLoanConfigHistory");
        CbLoanConfigControl instance = new CbLoanConfigControl();
        List<CbLoanConfigBean> expResult = null;
        List<CbLoanConfigBean> result = instance.listLoanConfigHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanCode method, of class CbLoanConfigControl.
     */
    @Test
    public void testFindOneByLoanCode() {
        System.out.println("findOneByLoanCode");
        String loanCode = "";
        CbLoanConfigControl instance = new CbLoanConfigControl();
        CbLoanConfigBean expResult = null;
        CbLoanConfigBean result = instance.findOneByLoanCode(loanCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveLoanConfig method, of class CbLoanConfigControl.
     */
    @Test
    public void testSaveLoanConfig() {
        System.out.println("saveLoanConfig");
        CbLoanConfigBean bean = null;
        CbLoanConfigControl instance = new CbLoanConfigControl();
        boolean expResult = false;
        boolean result = instance.saveLoanConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanConfig method, of class CbLoanConfigControl.
     */
    @Test
    public void testUpdateLoanConfig() {
        System.out.println("updateLoanConfig");
        CbLoanConfigBean bean = null;
        CbLoanConfigControl instance = new CbLoanConfigControl();
        boolean expResult = false;
        boolean result = instance.updateLoanConfig(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLoanMaster method, of class CbLoanConfigControl.
     */
    @Test
    public void testDeleteLoanMaster() {
        System.out.println("deleteLoanMaster");
        String LoanCode = "";
        CbLoanConfigControl instance = new CbLoanConfigControl();
        boolean expResult = false;
        boolean result = instance.deleteLoanMaster(LoanCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRunningBookNo method, of class CbLoanConfigControl.
     */
    @Test
    public void testUpdateRunningBookNo() {
        System.out.println("updateRunningBookNo");
        String loan_type = "";
        CbLoanConfigControl instance = new CbLoanConfigControl();
        boolean expResult = false;
        boolean result = instance.updateRunningBookNo(loan_type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
