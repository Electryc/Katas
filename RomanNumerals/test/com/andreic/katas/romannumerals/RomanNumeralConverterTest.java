package com.andreic.katas.romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by andreicatinean on 11/05/2014.
 */
public class RomanNumeralConverterTest {

    private RomanNumeralConverter romanNumeralConverter;

    @Before
    public void setUp() throws Exception {
        romanNumeralConverter = new RomanNumeralConverter();
    }

    @Test
    public void testZeroReturnsRomanZero() {
        assertTrue("0".equals(romanNumeralConverter.toRoman(0)));
    }

    @Test
    public void testUnderTenNumberReturnsCorrectRoman() {
        assertTrue("I".equals(romanNumeralConverter.toRoman(1)));
    }
}
