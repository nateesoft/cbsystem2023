/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.util;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class StringUtilTest {
    
    public StringUtilTest() {
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
     * Test of getString method, of class StringUtil.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        String inputData = "";
        String expResult = "";
        String result = StringUtil.getString(inputData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrimString method, of class StringUtil.
     */
    @Test
    public void testGetTrimString() {
        System.out.println("getTrimString");
        String inputData = "";
        String expResult = "";
        String result = StringUtil.getTrimString(inputData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class StringUtil.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Object data = null;
        boolean expResult = false;
        boolean result = StringUtil.isEmpty(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of str2UTF8 method, of class StringUtil.
     */
    @Test
    public void testStr2UTF8() {
        System.out.println("str2UTF8");
        String text = "";
        String expResult = "";
        String result = StringUtil.str2UTF8(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unicode2ASCII method, of class StringUtil.
     */
    @Test
    public void testUnicode2ASCII() {
        System.out.println("unicode2ASCII");
        String unicode = "";
        String expResult = "";
        String result = StringUtil.unicode2ASCII(unicode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ascii2Unicode method, of class StringUtil.
     */
    @Test
    public void testAscii2Unicode() {
        System.out.println("ascii2Unicode");
        String ascii = "";
        String expResult = "";
        String result = StringUtil.ascii2Unicode(ascii);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nulltoString method, of class StringUtil.
     */
    @Test
    public void testNulltoString() {
        System.out.println("nulltoString");
        String str = "";
        String expResult = "";
        String result = StringUtil.nulltoString(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrayForInQueryString method, of class StringUtil.
     */
    @Test
    public void testArrayForInQueryString() {
        System.out.println("arrayForInQueryString");
        String[] a = null;
        String expResult = "";
        String result = StringUtil.arrayForInQueryString(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotNullString method, of class StringUtil.
     */
    @Test
    public void testIsNotNullString() {
        System.out.println("isNotNullString");
        String str = "";
        boolean expResult = false;
        boolean result = StringUtil.isNotNullString(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ifBlank method, of class StringUtil.
     */
    @Test
    public void testIfBlank() {
        System.out.println("ifBlank");
        String inputData = "";
        String outputData = "";
        String expResult = "";
        String result = StringUtil.ifBlank(inputData, outputData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatNumberInterest method, of class StringUtil.
     */
    @Test
    public void testFormatNumberInterest() {
        System.out.println("formatNumberInterest");
        String num = "";
        String pattern = "";
        String expResult = "";
        String result = StringUtil.formatNumberInterest(num, pattern);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatNumber method, of class StringUtil.
     */
    @Test
    public void testFormatNumber() {
        System.out.println("formatNumber");
        BigDecimal num = null;
        String pattern = "";
        String expResult = "";
        String result = StringUtil.formatNumber(num, pattern);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXML method, of class StringUtil.
     */
    @Test
    public void testToXML() throws Exception {
        System.out.println("toXML");
        Object o = null;
        String expResult = "";
        String result = StringUtil.toXML(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trimDoubleQuoteCSV method, of class StringUtil.
     */
    @Test
    public void testTrimDoubleQuoteCSV() throws Exception {
        System.out.println("trimDoubleQuoteCSV");
        String data = "";
        String expResult = "";
        String result = StringUtil.trimDoubleQuoteCSV(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subStringUserId method, of class StringUtil.
     */
    @Test
    public void testSubStringUserId() throws Exception {
        System.out.println("subStringUserId");
        String userId = "";
        int maxlength = 0;
        String expResult = "";
        String result = StringUtil.subStringUserId(userId, maxlength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toBigDecimal method, of class StringUtil.
     */
    @Test
    public void testToBigDecimal() {
        System.out.println("toBigDecimal");
        String str = "";
        BigDecimal defalutValue = null;
        BigDecimal expResult = null;
        BigDecimal result = StringUtil.toBigDecimal(str, defalutValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumber method, of class StringUtil.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        String str = "";
        Boolean expResult = null;
        Boolean result = StringUtil.isNumber(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringNoCharacter method, of class StringUtil.
     */
    @Test
    public void testGetStringNoCharacter() {
        System.out.println("getStringNoCharacter");
        String t = "";
        char argChar = ' ';
        String expResult = "";
        String result = StringUtil.getStringNoCharacter(t, argChar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of padLeftZeroIntToStr method, of class StringUtil.
     */
    @Test
    public void testPadLeftZeroIntToStr() {
        System.out.println("padLeftZeroIntToStr");
        int numberPadLeft = 0;
        int arg = 0;
        String expResult = "";
        String result = StringUtil.padLeftZeroIntToStr(numberPadLeft, arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftPad method, of class StringUtil.
     */
    @Test
    public void testLeftPad_3args_1() {
        System.out.println("leftPad");
        String s = "";
        int width = 0;
        char word = ' ';
        String expResult = "";
        String result = StringUtil.leftPad(s, width, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftPad method, of class StringUtil.
     */
    @Test
    public void testLeftPad_3args_2() {
        System.out.println("leftPad");
        BigDecimal s = null;
        int width = 0;
        char word = ' ';
        String expResult = "";
        String result = StringUtil.leftPad(s, width, word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertNumberToMillionBahtThai method, of class StringUtil.
     */
    @Test
    public void testConvertNumberToMillionBahtThai() {
        System.out.println("convertNumberToMillionBahtThai");
        BigDecimal amount = null;
        String expResult = "";
        String result = StringUtil.convertNumberToMillionBahtThai(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLoader method, of class StringUtil.
     */
    @Test
    public void testGetCurrentLoader() {
        System.out.println("getCurrentLoader");
        Object fallbackClass = null;
        ClassLoader expResult = null;
        ClassLoader result = StringUtil.getCurrentLoader(fallbackClass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
