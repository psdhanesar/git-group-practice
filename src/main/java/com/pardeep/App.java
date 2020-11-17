package com.pardeep;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("The application is running");

        Customers customers = new Customers("amrit", 1);
        System.out.println(customers);
    }
    public void printDetails(){
        System.out.println("Hello this is the test code");
    }
}
