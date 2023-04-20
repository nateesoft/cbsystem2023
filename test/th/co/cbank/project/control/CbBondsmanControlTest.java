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
import th.co.cbank.project.model.CbBondsmanBean;

/**
 *
 * @author Acer
 */
public class CbBondsmanControlTest {
    
    public CbBondsmanControlTest() {
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
     * Test of mappingBean method, of class CbBondsmanControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbBondsmanControl instance = new CbBondsmanControl();
        List<CbBondsmanBean> expResult = null;
        List<CbBondsmanBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbBondsman method, of class CbBondsmanControl.
     */
    @Test
    public void testListCbBondsman_0args() {
        System.out.println("listCbBondsman");
        CbBondsmanControl instance = new CbBondsmanControl();
        List<CbBondsmanBean> expResult = null;
        List<CbBondsmanBean> result = instance.listCbBondsman();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbBondsman method, of class CbBondsmanControl.
     */
    @Test
    public void testListCbBondsman_String() {
        System.out.println("listCbBondsman");
        String loan_docno = "";
        CbBondsmanControl instance = new CbBondsmanControl();
        List<CbBondsmanBean> expResult = null;
        List<CbBondsmanBean> result = instance.listCbBondsman(loan_docno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByLoanDocNo method, of class CbBondsmanControl.
     */
    @Test
    public void testFindOneByLoanDocNo() {
        System.out.println("findOneByLoanDocNo");
        String loan_docno = "";
        CbBondsmanControl instance = new CbBondsmanControl();
        CbBondsmanBean expResult = null;
        CbBondsmanBean result = instance.findOneByLoanDocNo(loan_docno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCbBondsman method, of class CbBondsmanControl.
     */
    @Test
    public void testDeleteCbBondsman() {
        System.out.println("deleteCbBondsman");
        String loan_docno = "";
        String idcard = "";
        CbBondsmanControl instance = new CbBondsmanControl();
        instance.deleteCbBondsman(loan_docno, idcard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbBondsman method, of class CbBondsmanControl.
     */
    @Test
    public void testSaveCbBondsman() {
        System.out.println("saveCbBondsman");
        CbBondsmanBean bean = null;
        CbBondsmanControl instance = new CbBondsmanControl();
        boolean expResult = false;
        boolean result = instance.saveCbBondsman(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbBondsman method, of class CbBondsmanControl.
     */
    @Test
    public void testUpdateCbBondsman() {
        System.out.println("updateCbBondsman");
        CbBondsmanBean bean = null;
        CbBondsmanControl instance = new CbBondsmanControl();
        boolean expResult = false;
        boolean result = instance.updateCbBondsman(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
