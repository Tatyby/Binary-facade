package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("01010", "01010")); //20 (10+10)
        System.out.println(bins.mult("01010", "01010")); //100 (10*10)
    }
}