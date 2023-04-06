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
import th.co.cbank.project.model.CbExpTransactionBean;

/**
 *
 * @author Acer
 */
public class CbExpTransactionControlTest {
    
    public CbExpTransactionControlTest() {
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
     * Test of mappingBean method, of class CbExpTransactionControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbExpTransactionControl instance = new CbExpTransactionControl();
        List<CbExpTransactionBean> expResult = null;
        List<CbExpTransactionBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbExpTransaction method, of class CbExpTransactionControl.
     */
    @Test
    public void testListCbExpTransaction_0args() {
        System.out.println("listCbExpTransaction");
        CbExpTransactionControl instance = new CbExpTransactionControl();
        List<CbExpTransactionBean> expResult = null;
        List<CbExpTransactionBean> result = instance.listCbExpTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbExpTransaction method, of class CbExpTransactionControl.
     */
    @Test
    public void testListCbExpTransaction_String() {
        System.out.println("listCbExpTransaction");
        String EXP_DOC = "";
        CbExpTransactionControl instance = new CbExpTransactionControl();
        List<CbExpTransactionBean> expResult = null;
        List<CbExpTransactionBean> result = instance.listCbExpTransaction(EXP_DOC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByExpDoc method, of class CbExpTransactionControl.
     */
    @Test
    public void testFindOneByExpDoc() {
        System.out.println("findOneByExpDoc");
        String expDoc = "";
        CbExpTransactionControl instance = new CbExpTransactionControl();
        CbExpTransactionBean expResult = null;
        CbExpTransactionBean result = instance.findOneByExpDoc(expDoc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbExpTransaction method, of class CbExpTransactionControl.
     */
    @Test
    public void testSaveCbExpTransaction() {
        System.out.println("saveCbExpTransaction");
        CbExpTransactionBean bean = null;
        CbExpTransactionControl instance = new CbExpTransactionControl();
        instance.saveCbExpTransaction(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCbExpTransaction method, of class CbExpTransactionControl.
     */
    @Test
    public void testUpdateCbExpTransaction() {
        System.out.println("updateCbExpTransaction");
        CbExpTransactionBean bean = null;
        CbExpTransactionControl instance = new CbExpTransactionControl();
        instance.updateCbExpTransaction(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
