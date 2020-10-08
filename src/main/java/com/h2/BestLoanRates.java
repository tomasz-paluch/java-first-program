package com.h2;

import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter the loan term (in years)");
        int loanTermsInYears = scanner.nextInt();
        float bestRate = getRates(loanTermsInYears);

        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermsInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermsInYears) + "%");
        }

        scanner.close();

    }

    public static float getRates(int loanTermsInYears) {
        if (bestRates.containsKey(loanTermsInYears)) {
            return bestRates.get(loanTermsInYears);
        } else {
            return 0.0f;
        }
    }

}
