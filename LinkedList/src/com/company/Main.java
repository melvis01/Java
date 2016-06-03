package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Mel", 23.45);
        // Create anothercustomer
        Customer anotherCustomer;
        // Set anothercustomer to customer
        anotherCustomer = customer;
        anotherCustomer.setBalance(23.90);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }
    }
}
