/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.CbTransactionSaveBean;

/**
 *
 * @author Acer
 */
public class CbTransactionSaveControlTest {
    
    public CbTransactionSaveControlTest() {
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
     * Test of mappingListBean method, of class CbTransactionSaveControl.
     */
    @Test
    public void testMappingListBean() throws Exception {
        System.out.println("mappingListBean");
        ResultSet rs = null;
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.mappingListBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mappingBean method, of class CbTransactionSaveControl.
     */
    @Test
    public void testMappingBean() throws Exception {
        System.out.println("mappingBean");
        ResultSet rs = null;
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        CbTransactionSaveBean expResult = null;
        CbTransactionSaveBean result = instance.mappingBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionSave method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListCbTransactionSave_0args() {
        System.out.println("listCbTransactionSave");
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listCbTransactionSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTransactionSave method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListTransactionSave() {
        System.out.println("listTransactionSave");
        String where = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listTransactionSave(where);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionSave method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListCbTransactionSave_String_String() {
        System.out.println("listCbTransactionSave");
        String date1 = "";
        String date2 = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listCbTransactionSave(date1, date2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionSave method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetTransactionSave() {
        System.out.println("getTransactionSave");
        String t_custcode = "";
        String t_acccode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.getTransactionSave(t_custcode, t_acccode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransaction method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetTransaction() {
        System.out.println("getTransaction");
        String t_custcode = "";
        String t_acccode = "";
        Date t_date = null;
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.getTransaction(t_custcode, t_acccode, t_date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionByBookType method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetTransactionByBookType() {
        System.out.println("getTransactionByBookType");
        String acccode = "";
        String booktype1 = "";
        String booktype2 = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.getTransactionByBookType(acccode, booktype1, booktype2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionSaveAll method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListCbTransactionSaveAll() {
        System.out.println("listCbTransactionSaveAll");
        String accCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listCbTransactionSaveAll(accCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCbTransactionSaveAllAddStatus11 method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListCbTransactionSaveAllAddStatus11() {
        System.out.println("listCbTransactionSaveAllAddStatus11");
        String accCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listCbTransactionSaveAllAddStatus11(accCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByCustCode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testFindOneByCustCode() {
        System.out.println("findOneByCustCode");
        String T_custcode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        CbTransactionSaveBean expResult = null;
        CbTransactionSaveBean result = instance.findOneByCustCode(T_custcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneByDocNo method, of class CbTransactionSaveControl.
     */
    @Test
    public void testFindOneByDocNo() {
        System.out.println("findOneByDocNo");
        String T_DocNO = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        CbTransactionSaveBean expResult = null;
        CbTransactionSaveBean result = instance.findOneByDocNo(T_DocNO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCbTransactionSave method, of class CbTransactionSaveControl.
     */
    @Test
    public void testSaveCbTransactionSave() {
        System.out.println("saveCbTransactionSave");
        CbTransactionSaveBean bean = null;
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        boolean expResult = false;
        boolean result = instance.saveCbTransactionSave(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineByAccount method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetLineByAccount() {
        System.out.println("getLineByAccount");
        String AccCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        int expResult = 0;
        int result = instance.getLineByAccount(AccCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxIndex method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetMaxIndex() {
        System.out.println("getMaxIndex");
        String AccCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        int expResult = 0;
        int result = instance.getMaxIndex(AccCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLinePrint method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateLinePrint() {
        System.out.println("updateLinePrint");
        String t_acccode = "";
        int lineNo = 0;
        String t_date = "";
        int t_index = 0;
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateLinePrint(t_acccode, lineNo, t_date, t_index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLoanLinePrint method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateLoanLinePrint() {
        System.out.println("updateLoanLinePrint");
        String t_acccode = "";
        int lineNo = 0;
        String t_date = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateLoanLinePrint(t_acccode, lineNo, t_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class CbTransactionSaveControl.
     */
    @Test
    public void testDeleteData() {
        System.out.println("deleteData");
        String custCode = "";
        String accCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.deleteData(custCode, accCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionListWhereCustCode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetTransactionListWhereCustCode() {
        System.out.println("getTransactionListWhereCustCode");
        String custCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List expResult = null;
        List result = instance.getTransactionListWhereCustCode(custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSavingBookTransactionByAcccode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListSavingBookTransactionByAcccode() {
        System.out.println("listSavingBookTransactionByAcccode");
        String accCode = "";
        String custCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listSavingBookTransactionByAcccode(accCode, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStateTable method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateStateTable() {
        System.out.println("updateStateTable");
        CbTransactionSaveBean bean = null;
        int lineNoOld = 0;
        String t_date = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        boolean expResult = false;
        boolean result = instance.updateStateTable(bean, lineNoOld, t_date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStateTable2 method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateStateTable2() {
        System.out.println("updateStateTable2");
        CbTransactionSaveBean bean = null;
        int lineNoOld = 0;
        String t_date = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        boolean expResult = false;
        boolean result = instance.updateStateTable2(bean, lineNoOld, t_date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAllByAccountCode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testListAllByAccountCode() {
        System.out.println("listAllByAccountCode");
        String txtAccCode = "";
        String loanDocPrefix = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.listAllByAccountCode(txtAccCode, loanDocPrefix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWhereBookTypeNotIn method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateWhereBookTypeNotIn() {
        System.out.println("updateWhereBookTypeNotIn");
        String txtAccCode = "";
        String loanDocPrefix = "";
        String paymentDocPrefix = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateWhereBookTypeNotIn(txtAccCode, loanDocPrefix, paymentDocPrefix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWhereBookTypeNotInAndLineNo method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateWhereBookTypeNotInAndLineNo() {
        System.out.println("updateWhereBookTypeNotInAndLineNo");
        String acccode = "";
        String lineNo = "";
        String booktype = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateWhereBookTypeNotInAndLineNo(acccode, lineNo, booktype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWhereCustCodeAccode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateWhereCustCodeAccode() {
        System.out.println("updateWhereCustCodeAccode");
        double balance = 0.0;
        String custCode = "";
        String accCode = "";
        String t_docno = "";
        String t_time = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateWhereCustCodeAccode(balance, custCode, accCode, t_docno, t_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTdateList method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetTdateList() {
        System.out.println("getTdateList");
        String custCode = "";
        String accCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.getTdateList(custCode, accCode, false);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListByAccoundCode method, of class CbTransactionSaveControl.
     */
    @Test
    public void testGetListByAccoundCode() {
        System.out.println("getListByAccoundCode");
        String accCode = "";
        String custCode = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> expResult = null;
        List<CbTransactionSaveBean> result = instance.getListByAccoundCode(accCode, custCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWhereAccountAndStatus method, of class CbTransactionSaveControl.
     */
    @Test
    public void testUpdateWhereAccountAndStatus() {
        System.out.println("updateWhereAccountAndStatus");
        int line_no = 0;
        int t_index = 0;
        String accCode = "";
        String t_date = "";
        String t_time = "";
        CbTransactionSaveControl instance = new CbTransactionSaveControl();
        instance.updateWhereAccountAndStatus(line_no, t_index, accCode, t_date, t_time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
