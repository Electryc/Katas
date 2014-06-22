package com.andreic.katas.romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by andreicatinean on 11/05/2014.
 */
public class RomanNumeralConverterTest {

    public static final RomanSymbol ZERO = new RomanSymbol(0, "0");
    public static final RomanSymbol ROMAN_1 = new RomanSymbol(1, "I");
    public static final RomanSymbol ROMAN_2 = new RomanSymbol(2, "II");
    public static final RomanSymbol ROMAN_3 = new RomanSymbol(3, "III");
    public static final RomanSymbol ROMAN_4 = new RomanSymbol(4, "IV");
    public static final RomanSymbol ROMAN_5 = new RomanSymbol(5, "V");
    public static final RomanSymbol ROMAN_6 = new RomanSymbol(6, "VI");
    public static final RomanSymbol ROMAN_7 = new RomanSymbol(7, "VII");
    public static final RomanSymbol ROMAN_8 = new RomanSymbol(8, "VIII");
    public static final RomanSymbol ROMAN_9 = new RomanSymbol(9, "IX");
    public static final RomanSymbol ROMAN_10 = new RomanSymbol(10, "X");
    public static final RomanSymbol ROMAN_11 = new RomanSymbol(11, "XI");
    public static final RomanSymbol ROMAN_12 = new RomanSymbol(12, "XII");
    public static final RomanSymbol ROMAN_13 = new RomanSymbol(13, "XIII");
    public static final RomanSymbol ROMAN_14 = new RomanSymbol(14, "XIV");
    public static final RomanSymbol ROMAN_15 = new RomanSymbol(15, "XV");
    public static final RomanSymbol ROMAN_16 = new RomanSymbol(16, "XVI");
    public static final RomanSymbol ROMAN_17 = new RomanSymbol(17, "XVII");
    public static final RomanSymbol ROMAN_18 = new RomanSymbol(18, "XVIII");
    public static final RomanSymbol ROMAN_19 = new RomanSymbol(19, "XIX");
    public static final RomanSymbol ROMAN_24 = new RomanSymbol(24, "XXIV");
    public static final RomanSymbol ROMAN_44 = new RomanSymbol(44, "XLIV");
    public static final RomanSymbol ROMAN_904 = new RomanSymbol(904, "CMIV");
    public static final RomanSymbol ROMAN_1977 = new RomanSymbol(1977, "MCMLXXVII");
    public static final RomanSymbol ROMAN_1999 = new RomanSymbol(1999, "MCMXCIX");
    public static final RomanSymbol ROMAN_2014 = new RomanSymbol(2014, "MMXIV");

    private RomanNumeralConverter romanNumeralConverter;

    @Before
    public void setUp() throws Exception {
        romanNumeralConverter = new RomanNumeralConverter();
    }

    @Test
    public void testZeroReturnsZero() {
        assertThat(romanNumeralConverter.toRoman(0)).isEqualTo(ZERO);
    }

    @Test
    public void testUnder4ReturnsCorrectRoman() {
        assertThatUnder4ReturnsCorrectRoman();
    }

    private void assertThatUnder4ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(1)).isEqualTo(ROMAN_1);
        assertThat(romanNumeralConverter.toRoman(2)).isEqualTo(ROMAN_2);
        assertThat(romanNumeralConverter.toRoman(3)).isEqualTo(ROMAN_3);
    }

    @Test
    public void test4ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(4)).isEqualTo(ROMAN_4);
    }

    @Test
    public void test5ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(5)).isEqualTo(ROMAN_5);
    }

    @Test
    public void test6To8ReturnsCorrectRoman() {
        assertThatBetween6And8ReturnsCorrectRoman();
    }

    private void assertThatBetween6And8ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(6)).isEqualTo(ROMAN_6);
        assertThat(romanNumeralConverter.toRoman(7)).isEqualTo(ROMAN_7);
        assertThat(romanNumeralConverter.toRoman(8)).isEqualTo(ROMAN_8);
    }

    @Test
    public void test9ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(9)).isEqualTo(ROMAN_9);
    }

    @Test
    public void test10ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(10)).isEqualTo(ROMAN_10);
    }

    @Test
    public void test11To18ReturnsCorrectRoman() {
        assertThatBetween11And18ReturnsCorrectRoman();
    }

    private void assertThatBetween11And18ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(11)).isEqualTo(ROMAN_11);
        assertThat(romanNumeralConverter.toRoman(12)).isEqualTo(ROMAN_12);
        assertThat(romanNumeralConverter.toRoman(13)).isEqualTo(ROMAN_13);
        assertThat(romanNumeralConverter.toRoman(14)).isEqualTo(ROMAN_14);
        assertThat(romanNumeralConverter.toRoman(15)).isEqualTo(ROMAN_15);
        assertThat(romanNumeralConverter.toRoman(16)).isEqualTo(ROMAN_16);
        assertThat(romanNumeralConverter.toRoman(17)).isEqualTo(ROMAN_17);
        assertThat(romanNumeralConverter.toRoman(18)).isEqualTo(ROMAN_18);
    }

    @Test
    public void test19ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(19)).isEqualTo(ROMAN_19);
    }

    @Test
    public void test24ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(24)).isEqualTo(ROMAN_24);
    }

    @Test
    public void test44ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(44)).isEqualTo(ROMAN_44);
    }

    @Test
    public void test904ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(904)).isEqualTo(ROMAN_904);
    }

    @Test
    public void test1977ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(1977)).isEqualTo(ROMAN_1977);
    }

    @Test
    public void test1999ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(1999)).isEqualTo(ROMAN_1999);
    }

    @Test
    public void test2014ReturnsCorrectRoman() {
        assertThat(romanNumeralConverter.toRoman(2014)).isEqualTo(ROMAN_2014);
    }
}
