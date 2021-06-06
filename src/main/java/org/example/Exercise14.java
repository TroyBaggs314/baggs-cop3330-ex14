/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

class Tax
{
    double amount;
    String state;
}

public class Exercise14
{
    public static void main(String[] args)
    {
        Tax t = new Tax();
        t = inputs(t);
        DecimalFormat df = new DecimalFormat("#.##");
        double total = t.amount;
        System.out.println("The subtotal is $" + df.format(t.amount) + ".");
        if(t.state.equals("WI"))
        {
            System.out.println("The tax is $" + df.format(t.amount * 0.055) + ".");
            total += (t.amount * 0.055);
        }
        System.out.println("The total is $" + df.format(total) + ".");
    }

    public static Tax inputs(Tax t)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?");
        t.amount = sc.nextDouble();
        System.out.println("What is the state?");
        t.state = sc.next();
        return t;
    }
}
