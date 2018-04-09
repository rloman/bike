package com.capgemini.bike.rloman.selftest;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void testReplace() {

        String name = "AniMal        ";


        name = name.trim().toLowerCase().replace('a', 'A');

        Assert.assertEquals("AnimAl", name);

        name = "A B C D E ";

        name = name.trim().replace('A', 'a');

        Assert.assertEquals("a B C D E", name);
    }

    @Test
    public void floatTest() {
        // vraag / opmerking van Richard

//        float f = 2.1; // ?


        short a = 32760;
        short b = 100;

        short c = (short) (a + b); // ?

        System.out.println(c);
    }
}
