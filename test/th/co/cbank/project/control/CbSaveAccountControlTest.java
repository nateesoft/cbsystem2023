/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.Calendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.BalanceBean;
import th.co.cbank.project.model.CalendarBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.mapping.PayInterestAmtMapping;

/**
 *
 * @author Acer
 */
public class CbSaveAccountControlTest {
    
    public CbSaveAccountControlTest() {
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
     * Test of listCbSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testListCbSaveAccount_0args() {
        System.out.println("listCbSaveAccount");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.listCbSaveAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbSaveAccountStatus method, of class CbSaveAccountControl.
     */
    @Test
    public void testListCbSaveAccountStatus() {
        System.out.println("listCbSaveAccountStatus");
        String accountStatus = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.listCbSaveAccountStatus(accountStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByCustNameCustCodeAccSts method, of class CbSaveAccountControl.
     */
    @Test
    public void testSearchByCustNameCustCodeAccSts() {
        System.out.println("searchByCustNameCustCodeAccSts");
        String accountStatus = "";
        String custName = "";
        String custCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.searchByCustNameCustCodeAccSts(accountStatus, custName, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testListSaveAccount() {
        System.out.println("listSaveAccount");
        String orderBy = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.listSaveAccount(orderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testSearchSaveAccount() {
        System.out.println("searchSaveAccount");
        String custName = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.searchSaveAccount(custName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbSaveAccountActive method, of class CbSaveAccountControl.
     */
    @Test
    public void testListCbSaveAccountActive() {
        System.out.println("listCbSaveAccountActive");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.listCbSaveAccountActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testListCbSaveAccount_String() {
        System.out.println("listCbSaveAccount");
        String custCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<CbSaveAccountBean> expResult = null;
        List<CbSaveAccountBean> result = instance.listCbSaveAccount(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByAccountCode method, of class CbSaveAccountControl.
     */
    @Test
    public void testFindOneByAccountCode() {
        System.out.println("findOneByAccountCode");
        String account_code = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        CbSaveAccountBean expResult = null;
        CbSaveAccountBean result = instance.findOneByAccountCode(account_code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByConditionWhere method, of class CbSaveAccountControl.
     */
    @Test
    public void testFindOneByConditionWhere() {
        System.out.println("findOneByConditionWhere");
        String where = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        CbSaveAccountBean expResult = null;
        CbSaveAccountBean result = instance.findOneByConditionWhere(where);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testSaveSaveAccount() {
        System.out.println("saveSaveAccount");
        CbSaveAccountBean bean = null;
        CbSaveAccountControl instance = new CbSaveAccountControl();
        boolean expResult = false;
        boolean result = instance.saveSaveAccount(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSaveAccount method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateSaveAccount() {
        System.out.println("updateSaveAccount");
        CbSaveAccountBean bean = null;
        CbSaveAccountControl instance = new CbSaveAccountControl();
        boolean expResult = false;
        boolean result = instance.updateSaveAccount(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInterestAPI method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateInterestAPI() {
        System.out.println("updateInterestAPI");
        String custCode = "";
        String accoutCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateInterestAPI(custCode, accoutCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTransaction method, of class CbSaveAccountControl.
     */
    @Test
    public void testCheckTransaction() {
        System.out.println("checkTransaction");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.checkTransaction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfile method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateProfile() {
        System.out.println("updateProfile");
        String custCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateProfile(custCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBefore1 method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateBefore1() {
        System.out.println("updateBefore1");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateBefore1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExist method, of class CbSaveAccountControl.
     */
    @Test
    public void testIsExist() {
        System.out.println("isExist");
        String b_cust_code = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        boolean expResult = false;
        boolean result = instance.isExist(b_cust_code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBalance method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateBalance_BalanceBean() {
        System.out.println("updateBalance");
        BalanceBean bean = null;
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateBalance(bean);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBalanceBeanByCustCode method, of class CbSaveAccountControl.
     */
    @Test
    public void testFindBalanceBeanByCustCode() {
        System.out.println("findBalanceBeanByCustCode");
        String Cust_Code = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        BalanceBean expResult = null;
        BalanceBean result = instance.findBalanceBeanByCustCode(Cust_Code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLengDate method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetLengDate() {
        System.out.println("getLengDate");
        String CustCode = "";
        String dateEnd = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        int expResult = 0;
        int result = instance.getLengDate(CustCode, dateEnd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCalendarBeanByDate method, of class CbSaveAccountControl.
     */
    @Test
    public void testFindCalendarBeanByDate() {
        System.out.println("findCalendarBeanByDate");
        String date = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        CalendarBean expResult = null;
        CalendarBean result = instance.findCalendarBeanByDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetCalendar() {
        System.out.println("getCalendar");
        String date = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        Calendar expResult = null;
        Calendar result = instance.getCalendar(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYYYYcountDay method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetYYYYcountDay() {
        System.out.println("getYYYYcountDay");
        int expResult = 0;
        int result = CbSaveAccountControl.getYYYYcountDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearAtDay method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetYearAtDay() {
        System.out.println("getYearAtDay");
        String dateAt = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        int expResult = 0;
        int result = instance.getYearAtDay(dateAt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lengDate method, of class CbSaveAccountControl.
     */
    @Test
    public void testLengDate() {
        System.out.println("lengDate");
        String dIn1 = "";
        String dIn2 = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        int expResult = 0;
        int result = instance.lengDate(dIn1, dIn2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterest method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        double Vat = 0.0;
        double IC = 0.0;
        double balance = 0.0;
        int length = 0;
        CbSaveAccountControl instance = new CbSaveAccountControl();
        double expResult = 0.0;
        double result = instance.getInterest(Vat, IC, balance, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBalance method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateBalance_0args() {
        System.out.println("updateBalance");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateBalance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayInterest method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetPayInterest() {
        System.out.println("getPayInterest");
        String date = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List<PayInterestAmtMapping> expResult = null;
        List<PayInterestAmtMapping> result = instance.getPayInterest(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxBookNo method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetMaxBookNo() {
        System.out.println("getMaxBookNo");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        int expResult = 0;
        int result = instance.getMaxBookNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccountAndBookNo method, of class CbSaveAccountControl.
     */
    @Test
    public void testDeleteAccountAndBookNo() {
        System.out.println("deleteAccountAndBookNo");
        String accountNo = "";
        int bookNo = 0;
        CbSaveAccountControl instance = new CbSaveAccountControl();
        boolean expResult = false;
        boolean result = instance.deleteAccountAndBookNo(accountNo, bookNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountWhereCustCode method, of class CbSaveAccountControl.
     */
    @Test
    public void testGetAccountWhereCustCode() {
        System.out.println("getAccountWhereCustCode");
        String custCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        List expResult = null;
        List result = instance.getAccountWhereCustCode(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSummaryBalanceFromTransaction method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateSummaryBalanceFromTransaction_String_String() {
        System.out.println("updateSummaryBalanceFromTransaction");
        String custCode = "";
        String accCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateSummaryBalanceFromTransaction(custCode, accCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSummaryBalanceFromTransaction method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateSummaryBalanceFromTransaction_0args() {
        System.out.println("updateSummaryBalanceFromTransaction");
        CbSaveAccountControl instance = new CbSaveAccountControl();
        int expResult = 0;
        int result = instance.updateSummaryBalanceFromTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSaveAccountAndProfile method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateSaveAccountAndProfile() {
        System.out.println("updateSaveAccountAndProfile");
        double netBalance = 0.0;
        double textInt = 0.0;
        String custCode = "";
        String accCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateSaveAccountAndProfile(netBalance, textInt, custCode, accCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSaveAccountInProfile method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateSaveAccountInProfile() {
        System.out.println("updateSaveAccountInProfile");
        String accCode = "";
        String custCode = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateSaveAccountInProfile(accCode, custCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccountStatusAndRemark method, of class CbSaveAccountControl.
     */
    @Test
    public void testUpdateAccountStatusAndRemark() {
        System.out.println("updateAccountStatusAndRemark");
        String CB_STATUS_CLOSE_SAVE = "";
        String remark = "";
        String account_code = "";
        CbSaveAccountControl instance = new CbSaveAccountControl();
        instance.updateAccountStatusAndRemark(CB_STATUS_CLOSE_SAVE, remark, account_code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
