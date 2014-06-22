package com.andreic.katas.romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by andreicatinean on 11/05/2014.
 */
public class RomanNumeralConverterTest {

    public static final String ZERO = "0";
    public static final String ROMAN_1 = "I";
    public static final String ROMAN_2 = "II";
    public static final String ROMAN_3 = "III";
    public static final String ROMAN_4 = "IV";
    public static final String ROMAN_5 = "V";
    public static final String ROMAN_6 = "VI";
    public static final String ROMAN_7 = "VII";
    public static final String ROMAN_8 = "VIII";
    public static final String ROMAN_9 = "IX";
    public static final String ROMAN_10 = "X";
    public static final String ROMAN_11 = "XI";
    public static final String ROMAN_12 = "XII";
    public static final String ROMAN_13 = "XIII";
    public static final String ROMAN_14 = "XIV";
    public static final String ROMAN_15 = "XV";
    public static final String ROMAN_16 = "XVI";
    public static final String ROMAN_17 = "XVII";
    public static final String ROMAN_18 = "XVIII";
    public static final String ROMAN_19 = "XIX";
    public static final String ROMAN_24 = "XXIV";
    public static final String ROMAN_44 = "XLIV";
    public static final String ROMAN_904 = "CMIV";
    public static final String ROMAN_1977 = "MCMLXXVII";
    public static final String ROMAN_1999 = "MCMXCIX";
    public static final String ROMAN_2014 = "MMXIV";

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
