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
import th.co.cbank.project.model.CbMemberTypeBean;

/**
 *
 * @author Acer
 */
public class CbMemberTypeControlTest {
    
    public CbMemberTypeControlTest() {
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
     * Test of mappingBean method, of class CbMemberTypeControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbMemberTypeControl instance = new CbMemberTypeControl();
        List<CbMemberTypeBean> expResult = null;
        List<CbMemberTypeBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listMemberType method, of class CbMemberTypeControl.
     */
    @Test
    public void testListMemberType() {
        System.out.println("listMemberType");
        CbMemberTypeControl instance = new CbMemberTypeControl();
        List<CbMemberTypeBean> expResult = null;
        List<CbMemberTypeBean> result = instance.listMemberType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByTypeCode method, of class CbMemberTypeControl.
     */
    @Test
    public void testFindOneByTypeCode() {
        System.out.println("findOneByTypeCode");
        String typeCode = "";
        CbMemberTypeControl instance = new CbMemberTypeControl();
        CbMemberTypeBean expResult = null;
        CbMemberTypeBean result = instance.findOneByTypeCode(typeCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMemberType method, of class CbMemberTypeControl.
     */
    @Test
    public void testSaveMemberType() {
        System.out.println("saveMemberType");
        CbMemberTypeBean bean = null;
        CbMemberTypeControl instance = new CbMemberTypeControl();
        boolean expResult = false;
        boolean result = instance.saveMemberType(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMemberType method, of class CbMemberTypeControl.
     */
    @Test
    public void testUpdateMemberType() {
        System.out.println("updateMemberType");
        CbMemberTypeBean bean = null;
        CbMemberTypeControl instance = new CbMemberTypeControl();
        boolean expResult = false;
        boolean result = instance.updateMemberType(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
