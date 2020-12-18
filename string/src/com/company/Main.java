package com.company;

public class Main {

    public static void main(String[] args) {
        // string equality
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        if (s1 == s2) System.out.println("Two strings have same reference.");
        if (s1.equals(s2)) System.out.println("Two strings have same value.");
        String s3 = s1.intern();
        String s4 = s2.intern();
        if (s3 == s4) System.out.println("You can use == operator now.");

        // string conversion
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println(output);

        // string builder
        String location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);
        String message = sb.toString();
        System.out.println(message);
    }
}
