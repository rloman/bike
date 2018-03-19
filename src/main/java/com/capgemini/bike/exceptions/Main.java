package com.capgemini.bike.exceptions;


class OrcaException extends Exception {

}

public class Main {

    public boolean validate(String number) {

        try {
            Double.parseDouble(number);

            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {


        String invoer = "123a45";

        int aantal = Integer.parseInt(invoer);

        System.out.println(aantal);

        System.exit(0);

        // positief

        // weten:
        // inheritance tree:

        //

        int a = 0;



        // negatief

        // nooit (niet gauw) een Exception vangen

        // this is bad
        try {
            System.out.println(3/0);
        }
        catch(RuntimeException rte) {
            // ook hier moet je iets doen ...

        }
        catch(Exception e){ // deze regel is slecht
            // hier moet je altijd iets doen ...
            System.err.println("Dit is een exception");
        }


        try {
            divide(12, 0);
        } catch (OrcaException e) {


        }


        System.out.println("Einde programma");


    }


    public static int divide(int a, int b) throws OrcaException {

        try {
            System.out.println(a / b);
        }
        // error handler
        catch (ArithmeticException e) {
            throw new OrcaException();
        }

        return -1;
    }
}