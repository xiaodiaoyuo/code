package com.nxz;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNG {



    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine1", str);
    }




    public static class RandomEmailGenerator {

        public static String generate() {
            System.out.println("sdf");
            return "feedback@yiibai.com";
        }

    }

}

