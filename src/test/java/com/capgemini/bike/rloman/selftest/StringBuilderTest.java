package com.capgemini.bike.rloman.selftest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


import java.util.*;


public class StringBuilderTest {

    Date date;


    private StringBuilder stringBuilder; // import niet nodig, want StringBuilder zit in package
    // java.lang


    private Set set;

    private String veter;

    private List letters;

    @Before
    // kjvikxldfj

    /*
    afdlkjfklgjakldfjakldf

    adflkajxdkf

     */

    /*
    dit is gewoon commenaar en wordt niet door javadoc gezien als iets waar hij iets mee moet
     */
    public void setUp() {
        this.stringBuilder = new StringBuilder();
        this.veter = new String("veter");

//        this.letters = new List<>();
        this.letters = new ArrayList<>();

        this.letters = new LinkedList<>();
    }

    // javadoc

    /**
     * @param input: your name
     * @return the name in capitals
     */
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    @Test
    public void testPackageName() {
        String packageName = this.stringBuilder.getClass().getPackage().getName();

        Assert.assertEquals("java.lang", packageName);
    }

    @Test
    public void testLengteOfString() {
        Assert.assertEquals(5, this.veter.length());

        Assert.assertTrue('t' == veter.charAt(2));
    }


    @Test
    public void testLengteStringbuilder() {
        this.stringBuilder.setLength(3);
        this.stringBuilder.append("vlieg");

        Assert.assertEquals("\u0000\u0000\u0000vlieg", this.stringBuilder.toString());
    }


    @Test
    public void testListKnowledge() {

    }

    @Test
    public void testCharAndShort() {

        char lettertje = 127;

        byte age = 127;

        age++;


        System.out.println(age);


        long aantal = 8374834783L;

        System.out.println(aantal);


        int ager = 400;
        int ande = 829;
        int eier = 020;

        int hex = 0xAB;
        // B = 11. nU dus 11 x 16^0 = 11 x 1 = 11
        // A = 10. Nu dus 10 x 16^1 = 10 x 16 = 160;//
        // 11 + 160 = 171;

        Assert.assertEquals(171, hex);

        System.out.println(eier);

        System.out.println(hex);


        long bestEenLangGetal = 87_584_578_475L;

        float f = 3.5F;

        // int -> Integer

        Integer i = 3;


        Byte b = 15;

        byte b1 = b;

        // byte <--> Byte
        // short <--> Short
        // int < --> Integer
        // long <--> Long

        // boolean <--> Boolean  e.g. TRUE, tRUE, TruE, true, False, false, (maar
        // een string als "jansen" is false in Boolean land

        // double <--> Double
        // float <--> Float

        // char <--> Character

        Boolean bJansen = Boolean.valueOf("Trueman");

        System.out.println(bJansen);





    }

}
