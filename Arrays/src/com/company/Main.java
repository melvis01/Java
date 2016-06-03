package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double r[] = new double[100];
        for (int i =0; i < r.length; i++){
            r[i] = Math.random() * 100;
            System.out.println(r);
        }
    }
}




