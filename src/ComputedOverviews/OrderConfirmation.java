package ComputedOverviews;

import mockPIM.ProductInformation;
import Customers.Customer;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderConfirmation {

    ArrayList<ProductInformation> itemList;
    Customer customer;
    List<Integer> productqty = new ArrayList<>();



<<<<<<< HEAD

    // TODO: Delete.
//    String color;
//    BigDecimal price;
//    String str;


=======
>>>>>>> PIM

    BigDecimal amountSpent;
    BigDecimal totalTaxes;


    // TODO: Placeholder String
    String productVisualization =  "Picture of product from DAM";

    LocalDate timeOfArrival;



    // Getters
    public ArrayList<ProductInformation> getItemList() {
        return itemList;
    }

    public BigDecimal getAmountSpent() {
        return amountSpent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getTotalTaxes() {
        return totalTaxes;
    }

    public String getProductVisualization() {
        return productVisualization;
    }

    public LocalDate getTimeOfArrival() {
        return timeOfArrival;
    }


    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItemList(ArrayList<ProductInformation> itemList) {
        this.itemList = itemList;
    }

    public void setAmountSpent(BigDecimal amountSpent) {
        this.amountSpent = amountSpent;
    }

    public void setTotalTaxes(BigDecimal totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public void setProductVisualization(String productVisualization) {
        this.productVisualization = productVisualization;
    }

    public void setTimeOfArrival(LocalDate timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }


<<<<<<< HEAD
=======


    public void displayProductInformation(){
        // TODO: Code to display all the product information

    }

>>>>>>> PIM
    public void convertToPDF(){
        // TODO: Code to convert it to PDF
    }

    public int QuantityBought(String UUID){

        // TODO: Code to take quantity bought from the shop, and return it here (Maybe)

        return 0;
    }
    public LocalDate getDate() {
        return LocalDate.now();
    }



}
