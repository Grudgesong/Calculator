/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.calc.util;

/**
 *
 * @author Song Grudge Ranjit
 */
public class Calculator {

    private int x, y, z;

    /**
     * default constructor
     */
    public Calculator() {

    }

    /**
     * Overloaded Constructor
     *
     * @param x
     * @param y
     */
    public Calculator(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public int div() {
        return x / y;
    }

    public int mul() {
        return x * y;
    }

    public int pow() {
        int total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

    public int grt() {
        if (x > y) {
            return x;
        } else {
            return y;

        }
    }

    public int les() {
        if (x > y) {
            return y;
        } else {
            return x;

        }
    }

    public void table() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println("");
        }
    }

    public void table2() {
        System.out.println("Multiplication table of " + z + " is :-");
        for (int k = 1; k <= 10; k++) {

            System.out.println(z + "*" + k + " = " + (z * k));
        }
    }
    //public int add(int x, int y){
    //  return x+y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
