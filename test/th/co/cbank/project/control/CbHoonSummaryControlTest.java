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
import th.co.cbank.project.model.CbHoonSummaryBean;

/**
 *
 * @author Acer
 */
public class CbHoonSummaryControlTest {
    
    public CbHoonSummaryControlTest() {
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
     * Test of mappingBean method, of class CbHoonSummaryControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbHoonSummaryControl instance = new CbHoonSummaryControl();
        List<CbHoonSummaryBean> expResult = null;
        List<CbHoonSummaryBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByYear method, of class CbHoonSummaryControl.
     */
    @Test
    public void testFindOneByYear() {
        System.out.println("findOneByYear");
        String year = "";
        CbHoonSummaryControl instance = new CbHoonSummaryControl();
        CbHoonSummaryBean expResult = null;
        CbHoonSummaryBean result = instance.findOneByYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllData method, of class CbHoonSummaryControl.
     */
    @Test
    public void testGetAllData() {
        System.out.println("getAllData");
        CbHoonSummaryControl instance = new CbHoonSummaryControl();
        List<CbHoonSummaryBean> expResult = null;
        List<CbHoonSummaryBean> result = instance.getAllData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
