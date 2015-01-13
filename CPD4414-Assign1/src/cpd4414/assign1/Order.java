
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assign1;

import java.util.Date;

/**
 *
 * @author Scott Melanson
 */
public class Order {
    
    private String customerId;
    private String customerName;
    private Date timeRecieved;
    private Date timeProcessed;
    private Date timeFulfilled;
    private int[] purchaseList;
    private String notes;
    
    public Order(){
        customerId = "";
        customerName = "";
        timeRecieved = new Date();
        timeProcessed = new Date();
        timeFulfilled = new Date();
        purchaseList = new int[99];
        notes = "";
        
    }
    
    public Order(String customerId, String customerName, Date timeRecieved, Date timeProcessed, Date timeFulfilled, int[] purchaseList, String notes) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.timeRecieved = timeRecieved;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.purchaseList = purchaseList;
        this.notes = notes;
    }
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeRecieved() {
        return timeRecieved;
    }

    public void setTimeRecieved(Date timeRecieved) {
        this.timeRecieved = timeRecieved;
    }

    public Date getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(Date timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public Date getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(Date timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public int[] getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(int[] purchaseList) {
        this.purchaseList = purchaseList;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public void setProductQuanitity(int productId, int quantity){
        purchaseList[productId - 1] = quantity;
    }
    
    public int getProductQuantity(int productId){
        return purchaseList[productId];
    }
    
}
