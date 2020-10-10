package com.company;

public class Client {

    public static void main(String[] args) {
    Terre terre=Terre.getInstance(700000000,300000000);
    Terre terre1=Terre.getInstance(80000000,400000000);
    System.out.println(terre);
    System.out.println(terre1);
    }
}
