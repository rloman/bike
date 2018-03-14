package com.capgemini.bike.rloman.selftest.constructortrainer;


class Bird {

    private int aantal;


}

public class Chicken extends Bird {

    private String name;
    private int eggs;

    private char code = 'a';


    // create a constructor with the mandatory 'name' property

    /*
    public Chicken(String name, int eggs) {
        this.name = name;
        this.eggs = eggs;
    }

    public Chicken(String name) {
        this(name, 0);
    }

    */

    public static void main(String[] args) {
        Chicken c = new Chicken();

        // toString is invoked when:
        // 1. The object is send to an outputstream (e.g. System.out)
        // 2. The object is concatenated to an other String
        // 3 ..
        System.out.println(c);


    }

}
