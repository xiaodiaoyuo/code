package com.nxz;


public class TestNG {
    public static void main(String[] args) {
        System.out.println("ssssssssssss");
        String generate = RandomEmailGenerator.generate();
        System.out.println(generate);
    }

    public static class RandomEmailGenerator {

        public static String generate() {
            return "feedback@yiibai.com";
        }

    }

}

