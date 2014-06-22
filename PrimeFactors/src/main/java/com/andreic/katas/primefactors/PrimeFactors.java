package com.andreic.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreicatinean on 22/06/2014.
 */
public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<Integer>();

        int factor = 2;
        while (factor <= number) {
            if (isProductWithLastFactorOverflowsFor(number, factors, factor)) {
                break;
            }

            if (isPrimeFactorFor(number, factor)) {
                factors.add(factor);
            }

            factor++;
        }

        return factors;
    }

    private static boolean isProductWithLastFactorOverflowsFor(int number, List<Integer> factors, int factor) {
        return (factors.size() > 0) && (factor * lastItemOf(factors) > number);
    }

    private static Integer lastItemOf(List<Integer> list) {
        return list.get(list.size() - 1);
    }

    private static boolean isPrimeFactorFor(int number, int factor) {
        return isFactorFor(number, factor) && isPrime(factor);
    }

    private static boolean isFactorFor(int number, int factor) {
        return (number % factor == 0);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (isFactorFor(number, i)) {
                return false;
            }
        }
        return true;
    }
}
