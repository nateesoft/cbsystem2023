package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.AddressBean;

public class AddressControlTest {
    
    public AddressControlTest() {
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
     * Test of mappingBean method, of class AddressControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        AddressControl instance = new AddressControl();
        List<AddressBean> expResult = null;
        List<AddressBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProfileAddress method, of class AddressControl.
     */
    @Test
    public void testListProfileAddress() {
        System.out.println("listProfileAddress");
        String Cust_Code = "";
        AddressControl instance = new AddressControl();
        List<AddressBean> expResult = null;
        List<AddressBean> result = instance.listProfileAddress(Cust_Code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class AddressControl.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        String Cust_Code = "";
        String addrType = "";
        AddressControl instance = new AddressControl();
        AddressBean expResult = null;
        AddressBean result = instance.getOne(Cust_Code, addrType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProfileAddress method, of class AddressControl.
     */
    @Test
    public void testSaveProfileAddress() {
        System.out.println("saveProfileAddress");
        AddressBean bean = null;
        AddressControl instance = new AddressControl();
        instance.saveProfileAddress(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfileAddress method, of class AddressControl.
     */
    @Test
    public void testUpdateProfileAddress() {
        System.out.println("updateProfileAddress");
        AddressBean bean = null;
        AddressControl instance = new AddressControl();
        instance.updateProfileAddress(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
