package com.capgemini.bike.util.gc;


class Person {
    public String name;


    public int age;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("The person is being garbage collected");
    }
}

public class GarbageCollectorDemo {

    public static void main(String[] args) throws InterruptedException {


       StringBuilder builder = new StringBuilder("Suzanne");


        for (int i = 0; i < 10000; i++) {

            builder.append(Math.random() * 3000);

        }

        String suzanne = builder.toString();

        System.out.println(suzanne);



    }
}
