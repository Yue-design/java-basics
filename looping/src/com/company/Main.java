package com.company;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
	    // while loop
        int someValue = 4;
        int factorial = 1;
        while (someValue > 1) {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);

        // do while loop
        int iVal = 80;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 25);

        // for loop
        for (int i = 1; i < 100; i *= 2)
            System.out.println(i);

        // for-each loop
        float[] vals = { 10.0f, 20.0f, 15.0f };
        float total = 0.0f;
        for(float cur: vals)
            total += cur;
        System.out.println(total);

        // arrays
//        float[] theVals = new float[3];
//        theVals[0] = 10.0f;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;
        float[] theVals = { 10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for (int index = 0; index < theVals.length; index++)
            sum += theVals[index];
        System.out.println(sum);

        // calculation in arrays
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = leftVals[i] != 0 ?  leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }

        for(double currentResult : results)
            System.out.println(currentResult);
    }
}
