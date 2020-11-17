package com.pardeep;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("The application is running");

        Customers customers = new Customers("Pardeep", 1);
        System.out.println(customers);
    }
}
