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
            if ((number % factor == 0) && isPrime(factor)) {
                factors.add(factor);
            }
            factor++;
        }

        return factors;
    }

    private static boolean isPrime(int factor) {
        for (int i = 2; i <= Math.sqrt(factor); i++){
            if (factor % i == 0){
                return false;
            }
        }
        return true;
    }
}
