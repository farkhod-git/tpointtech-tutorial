package com.tpointtech.string;

public class StringComparison {
    public static void main(String[] args) {
        String s2 = new String("Hello");
        System.out.println("Hello".equals(s2));
        System.out.println("Hi" == new String("Hi"));

        System.out.println("Company".compareTo("Computer")); // a - u = -20

        String a = "Process";
        String b = "Program";

        boolean b1 = a.equalsIgnoreCase(b);


    }

}
