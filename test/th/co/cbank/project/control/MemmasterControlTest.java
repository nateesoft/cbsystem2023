/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.cbank.project.control;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.co.cbank.project.model.Memmaster;

/**
 *
 * @author Acer
 */
public class MemmasterControlTest {
    
    public MemmasterControlTest() {
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
     * Test of getListMemberTotalScore method, of class MemmasterControl.
     */
    @Test
    public void testGetListMemberTotalScore() {
        System.out.println("getListMemberTotalScore");
        String memberCode = "";
        MemmasterControl instance = new MemmasterControl();
        List<Memmaster> expResult = null;
        List<Memmaster> result = instance.getListMemberTotalScore(memberCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
