package com.andreic.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreicatinean on 22/06/2014.
 */
public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        if (number == 2) {
            factors.add(2);
        }

        if (number == 3) {
            factors.add(3);
        }

        return factors;
    }
}
