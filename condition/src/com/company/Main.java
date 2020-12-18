package com.company;

public class Main {

    public static void main(String[] args) {
        // logical & conditional
        int students = 150;
        int rooms = 0;

        // logical
//        if (rooms != 0 & students/rooms > 30)
//            System.out.println("Crowded");
//        System.out.println();

        // conditional
        if (rooms != 0 && students/rooms > 30)
            System.out.println("Crowded");
        System.out.println("*** end of program ***");

        // blocks
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd')
            if (value2 != 0)
                result = value1 / value2;
        else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }

        System.out.println(result);


        // switch
        double val1 = 100.0d;
        double val2 = 50.0d;
        double res = 0.0d;
        char option = 'd';

        switch(option) {
            case 'a':
                res = val1 + val2;
                break;
            case 's':
                res = val1 - val2;
                break;
            case 'm':
                res = val1 * val2;
                break;
            case 'd':
                res = val2 != 0 ? val1 / val2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + option);
                res = 0.0d;
                break;
        }
        System.out.println(res);
    }
}
