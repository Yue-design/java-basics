package com.company;

public class Main {

    public static void main(String[] args) {
        // Operator Precedence
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        // type conversion
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short res1 = (short) longVal;
        short res2 = (short) (byteVal - longVal);
        float res3 = longVal - floatVal;

        System.out.println("Success");
    }
}
