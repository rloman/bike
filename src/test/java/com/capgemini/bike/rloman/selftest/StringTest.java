package com.capgemini.bike.rloman.selftest;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void testReplace() {

        String voornaam = "AniMal        ";


        voornaam = voornaam.trim().toLowerCase().replace('a', 'A');

        Assert.assertEquals("AnimAl", voornaam);

        voornaam = "A B C D E ";

        voornaam = voornaam.trim().replace('A', 'a');

        Assert.assertEquals("a B C D E", voornaam);
    }

    @Test
    public void floatTest() {
        // vraag / opmerking van Richard

//        float f = 2.1; ?


        short a = 16;
        short b = 14;

//        short c = a+b; ??
    }
}
