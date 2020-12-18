package com.company;

public class Main {

    public static void main(String[] args) {
        // a simple method
        System.out.println("Before method call");
        doSomething();
        System.out.println("After method call");

        // parameters
        showSum(7.5, 1.4, 3);

        // parameter passing
        int val1 = 10;
        int val2 = 20;
        swap(val1, val2);
        System.out.println(val1);
        System.out.println(val2);

        // existing a method
        showSum(7.5, 1.4, 0);

        // returning a value
        System.out.println(produceInterestHistory(100d, 0.05d, 10));
    }

    static void doSomething() {
        System.out.println("Inside method");
        System.out.println("Still inside");
    }

    static void showSum(double x, double y, int count) {
        if (count < 1)
            return;
        double sum = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
        return;
    }

    static void swap(int i, int j) {
        int k = i;
        i = j;
        j = i;
    }

    static double calculateInterest(double amt, double rate, int years) {
        double interest = amt * rate * years;
        return interest;
    }

    static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumulatedInterest = new double[years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }
}
