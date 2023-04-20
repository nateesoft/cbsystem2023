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
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.model.ProfileMapping;

/**
 *
 * @author Acer
 */
public class ProfileControlTest {
    
    public ProfileControlTest() {
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
     * Test of getDeptID method, of class ProfileControl.
     */
    @Test
    public void testGetDeptID() {
        System.out.println("getDeptID");
        ProfileControl instance = new ProfileControl();
        int expResult = 0;
        int result = instance.getDeptID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataGroup method, of class ProfileControl.
     */
    @Test
    public void testGetDataGroup() {
        System.out.println("getDataGroup");
        ProfileControl instance = new ProfileControl();
        String[] expResult = null;
        String[] result = instance.getDataGroup();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dataExist method, of class ProfileControl.
     */
    @Test
    public void testDataExist() {
        System.out.println("dataExist");
        String code = "";
        ProfileControl instance = new ProfileControl();
        boolean expResult = false;
        boolean result = instance.dataExist(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingBean method, of class ProfileControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingBean2 method, of class ProfileControl.
     */
    @Test
    public void testMappingBean2() throws Exception {
        System.out.println("mappingBean2");
        ResultSet rs = null;
        ProfileControl instance = new ProfileControl();
        List<ProfileMapping> expResult = null;
        List<ProfileMapping> result = instance.mappingBean2(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbProfile method, of class ProfileControl.
     */
    @Test
    public void testListCbProfile() {
        System.out.println("listCbProfile");
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.listCbProfile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfile method, of class ProfileControl.
     */
    @Test
    public void testSearchProfile() {
        System.out.println("searchProfile");
        String txtDate = "";
        int selectIndex = 0;
        ProfileControl instance = new ProfileControl();
        List<ProfileMapping> expResult = null;
        List<ProfileMapping> result = instance.searchProfile(txtDate, selectIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfile2 method, of class ProfileControl.
     */
    @Test
    public void testSearchProfile2() {
        System.out.println("searchProfile2");
        String txtDate = "";
        int selectIndex = 0;
        ProfileControl instance = new ProfileControl();
        List<ProfileMapping> expResult = null;
        List<ProfileMapping> result = instance.searchProfile2(txtDate, selectIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByCustCode method, of class ProfileControl.
     */
    @Test
    public void testFindOneByCustCode() {
        System.out.println("findOneByCustCode");
        String P_custCode = "";
        ProfileControl instance = new ProfileControl();
        ProfileBean expResult = null;
        ProfileBean result = instance.findOneByCustCode(P_custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfileByApproveLimitMoreThanZero method, of class ProfileControl.
     */
    @Test
    public void testGetProfileByApproveLimitMoreThanZero() {
        System.out.println("getProfileByApproveLimitMoreThanZero");
        String P_custCode = "";
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.getProfileByApproveLimitMoreThanZero(P_custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfileByApproveAndCustName method, of class ProfileControl.
     */
    @Test
    public void testGetProfileByApproveAndCustName() {
        System.out.println("getProfileByApproveAndCustName");
        String P_custCode = "";
        String custName = "";
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.getProfileByApproveAndCustName(P_custCode, custName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByIndex method, of class ProfileControl.
     */
    @Test
    public void testFindOneByIndex() {
        System.out.println("findOneByIndex");
        String pIndex = "";
        ProfileControl instance = new ProfileControl();
        ProfileBean expResult = null;
        ProfileBean result = instance.findOneByIndex(pIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProfile method, of class ProfileControl.
     */
    @Test
    public void testSaveProfile() {
        System.out.println("saveProfile");
        ProfileBean bean = null;
        ProfileControl instance = new ProfileControl();
        boolean expResult = false;
        boolean result = instance.saveProfile(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfile method, of class ProfileControl.
     */
    @Test
    public void testUpdateProfile() {
        System.out.println("updateProfile");
        ProfileBean bean = null;
        ProfileControl instance = new ProfileControl();
        instance.updateProfile(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class ProfileControl.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "";
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.search(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProfile method, of class ProfileControl.
     */
    @Test
    public void testDeleteProfile() {
        System.out.println("deleteProfile");
        String custCode = "";
        ProfileControl instance = new ProfileControl();
        instance.deleteProfile(custCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxIndex method, of class ProfileControl.
     */
    @Test
    public void testGetMaxIndex() {
        System.out.println("getMaxIndex");
        ProfileControl instance = new ProfileControl();
        String expResult = "";
        String result = instance.getMaxIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPMax method, of class ProfileControl.
     */
    @Test
    public void testGetPMax() {
        System.out.println("getPMax");
        ProfileControl instance = new ProfileControl();
        String expResult = "";
        String result = instance.getPMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInitialBean method, of class ProfileControl.
     */
    @Test
    public void testGetInitialBean() {
        System.out.println("getInitialBean");
        ProfileControl instance = new ProfileControl();
        ProfileBean expResult = null;
        ProfileBean result = instance.getInitialBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalHoonQty method, of class ProfileControl.
     */
    @Test
    public void testGetTotalHoonQty() {
        System.out.println("getTotalHoonQty");
        ProfileControl instance = new ProfileControl();
        double expResult = 0.0;
        double result = instance.getTotalHoonQty();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProfileHoon method, of class ProfileControl.
     */
    @Test
    public void testListProfileHoon() {
        System.out.println("listProfileHoon");
        ProfileControl instance = new ProfileControl();
        List<ProfileBean> expResult = null;
        List<ProfileBean> result = instance.listProfileHoon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanBalance method, of class ProfileControl.
     */
    @Test
    public void testUpdateLoanBalance() {
        System.out.println("updateLoanBalance");
        double loan_amount = 0.0;
        double loan_amount0 = 0.0;
        String cust_code = "";
        ProfileControl instance = new ProfileControl();
        boolean expResult = false;
        boolean result = instance.updateLoanBalance(loan_amount, loan_amount0, cust_code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanCreditBalance method, of class ProfileControl.
     */
    @Test
    public void testUpdateLoanCreditBalance() {
        System.out.println("updateLoanCreditBalance");
        String custCode = "";
        double LOAN_CREDIT_AMT = 0.0;
        ProfileControl instance = new ProfileControl();
        int expResult = 0;
        int result = instance.updateLoanCreditBalance(custCode, LOAN_CREDIT_AMT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSaveBalance method, of class ProfileControl.
     */
    @Test
    public void testUpdateSaveBalance() {
        System.out.println("updateSaveBalance");
        double cMoney = 0.0;
        String p_custCode = "";
        ProfileControl instance = new ProfileControl();
        instance.updateSaveBalance(cMoney, p_custCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
