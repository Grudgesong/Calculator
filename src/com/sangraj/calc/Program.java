/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.calc;

import com.sangraj.calc.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author Song Grudge Ranjit
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator c = new Calculator();
        while (true) {
            System.out.println("1.Addition");
            System.out.println("2.Substract");
            System.out.println("3.Divide");
            System.out.println("4.Multiplication");
            System.out.println("5.Power");
            System.out.println("6.Multiplication Table");
            System.out.println("7.Multiplication Table[1-10]");
            System.out.println("8.Greater than");
            System.out.println("9.Less than");
            System.out.println("10.Exit");
            System.out.println("Enter your choice[1-10]:");
            int ch = input.nextInt();

            if (ch == 1) {
                System.out.println("Enter the value of x:");
                //int.x=input.nextInt();
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                //int.y=input.nextInt();
                c.setY(input.nextInt());
                System.out.println(c.add());
            } else if (ch == 2) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.sub());
            } else if (ch == 3) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.div());
            } else if (ch == 4) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.mul());
            } else if (ch == 5) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.pow());
            } else if (ch == 6) {
                System.out.println("Enter the multiplication table number:");
                c.setZ(input.nextInt());
                c.table2();
            } else if (ch == 7) {
                c.table();
            } else if (ch == 8) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.grt());
            } else if (ch == 9) {
                System.out.println("Enter the value of x:");
                c.setX(input.nextInt());
                System.out.println("Enter the value of y:");
                c.setY(input.nextInt());
                System.out.println(c.les());

            } else if (ch == 10) {
                System.exit(0);
            }

            System.out.println("Do you want to continue[Y/N]?");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
