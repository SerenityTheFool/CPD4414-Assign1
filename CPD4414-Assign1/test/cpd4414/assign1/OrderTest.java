/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assign1;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0625903
 */
public class OrderTest {

    public OrderTest() {
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
     * Test of getCustomerId method, of class Order.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");

        String customerId = "0001";
        String customerName = "Bob";
        Date timeRecieved = new Date();
        Date timeProcessed = new Date();
        Date timeFulfilled = new Date();
        int[] purchaseList = new int[99];
        String notes = "...";
        
        Order instance = new Order();

        assertNotNull("Customer Name Should Exist", instance.getCustomerName());

    }

}
