package com.pardeep;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("The application");

        Customers customers = new Customers("amrit", 1);
        System.out.println(customers);
    }

    public void printDetails2() {
        System.out.println("Details");
    }
}
