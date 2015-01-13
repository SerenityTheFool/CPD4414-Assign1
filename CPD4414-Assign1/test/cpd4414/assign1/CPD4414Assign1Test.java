/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assign1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0628439
 */
public class CPD4414Assign1Test {
    
    public CPD4414Assign1Test() {
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
     * Test of main method, of class CPD4414Assign1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CPD4414Assign1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
       @Test
   public void testGetCustomerId () {
       Order instance = new Order();
       String expResult = "";
       String result = instance.getCustomerId();
       assertEquals(expResult, result);
   }
}
}
