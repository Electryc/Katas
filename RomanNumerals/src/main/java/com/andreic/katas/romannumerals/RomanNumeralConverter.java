package com.andreic.katas.romannumerals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreicatinean on 11/05/2014.
 */
public class RomanNumeralConverter {

    private static List<RomanSymbol> SYMBOLS = new ArrayList<RomanSymbol>() {{
        add(new RomanSymbol(1000, "M"));
        add(new RomanSymbol(900, "CM"));
        add(new RomanSymbol(500, "D"));
        add(new RomanSymbol(100, "C"));
        add(new RomanSymbol(90, "XC"));
        add(new RomanSymbol(50, "L"));
        add(new RomanSymbol(40, "XL"));
        add(new RomanSymbol(10, "X"));
        add(new RomanSymbol(9, "IX"));
        add(new RomanSymbol(5, "V"));
        add(new RomanSymbol(4, "IV"));
        add(new RomanSymbol(1, "I"));
    }};

    public RomanSymbol toRoman(int arabic) {
        if (arabic == 0) {
            return new RomanSymbol(0,"0");
        }
        StringBuilder sb = new StringBuilder();
        int number = arabic;

        for (RomanSymbol symbol : SYMBOLS) {
            while (number >= symbol.getValue()) {
                sb.append(symbol.getSymbol());
                number -= symbol.getValue();
            }
        }

        return new RomanSymbol(arabic, sb.toString());
    }
}
