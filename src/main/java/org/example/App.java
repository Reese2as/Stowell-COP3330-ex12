/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double principal, ROI, final_amount;
        int years;

        System.out.print("Enter the principal: ");
        principal = user_input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        ROI = (user_input.nextDouble()/100);
        System.out.print("Enter the number of years: ");
        years = user_input.nextInt();

        final_amount=(principal*(1+(ROI*years)));
        ROI *= 100;

        System.out.println(String.format("After %d years at %.2f%%, the investment will be worth $%.2f",years,ROI,final_amount));
    }
}
