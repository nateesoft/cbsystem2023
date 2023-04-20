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
import th.co.cbank.project.model.DocumentGarunteeBean;

/**
 *
 * @author Acer
 */
public class DocumentGarunteeControlTest {
    
    public DocumentGarunteeControlTest() {
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
     * Test of mappingBean method, of class DocumentGarunteeControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        List<DocumentGarunteeBean> expResult = null;
        List<DocumentGarunteeBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listDocumentGaruntee method, of class DocumentGarunteeControl.
     */
    @Test
    public void testListDocumentGaruntee_0args() {
        System.out.println("listDocumentGaruntee");
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        List<DocumentGarunteeBean> expResult = null;
        List<DocumentGarunteeBean> result = instance.listDocumentGaruntee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listDocumentGaruntee method, of class DocumentGarunteeControl.
     */
    @Test
    public void testListDocumentGaruntee_String() {
        System.out.println("listDocumentGaruntee");
        String docNo = "";
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        List<DocumentGarunteeBean> expResult = null;
        List<DocumentGarunteeBean> result = instance.listDocumentGaruntee(docNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByDocNo method, of class DocumentGarunteeControl.
     */
    @Test
    public void testFindOneByDocNo() {
        System.out.println("findOneByDocNo");
        String docNo = "";
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        DocumentGarunteeBean expResult = null;
        DocumentGarunteeBean result = instance.findOneByDocNo(docNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveDocumentGaruntee method, of class DocumentGarunteeControl.
     */
    @Test
    public void testSaveDocumentGaruntee() {
        System.out.println("saveDocumentGaruntee");
        DocumentGarunteeBean documentGarunteeBean = null;
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        boolean expResult = false;
        boolean result = instance.saveDocumentGaruntee(documentGarunteeBean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDocumentGaruntee method, of class DocumentGarunteeControl.
     */
    @Test
    public void testUpdateDocumentGaruntee() {
        System.out.println("updateDocumentGaruntee");
        DocumentGarunteeBean documentGarunteeBean = null;
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        boolean expResult = false;
        boolean result = instance.updateDocumentGaruntee(documentGarunteeBean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class DocumentGarunteeControl.
     */
    @Test
    public void testDeleteData() {
        System.out.println("deleteData");
        String loanDocCode = "";
        DocumentGarunteeControl instance = new DocumentGarunteeControl();
        instance.deleteData(loanDocCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
