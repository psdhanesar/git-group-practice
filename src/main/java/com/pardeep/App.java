package com.pardeep;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("The application");

        Customers customers = new Customers("mohit", 1);
        System.out.println(customers);
    }
    public void printDetails(){
        System.out.println("Hello this is the test code");
        System.out.println("this is the new change");
    }
    public void newAddedFeature(){
        System.out.println("This is the new added feature");
    }
}
