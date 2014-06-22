package com.andreic.katas.primefactors;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by andreicatinean on 22/06/2014.
 */
public class PrimeFactorsTest {

    @Test
    public void test1ReturnsEmptyList() {
        assertThat(PrimeFactors.generate(1)).isEmpty();
    }

    @Test
    public void test2ReturnsListOf2() {
        assertThat(PrimeFactors.generate(2)).containsExactly(2);
    }

    @Test
    public void test3ReturnsListOf3() {
        assertThat(PrimeFactors.generate(3)).containsExactly(3);
    }

    @Test
    public void test4ReturnsListOf2() {
        assertThat(PrimeFactors.generate(4)).containsExactly(2);
    }

    @Test
    public void test5ReturnsListOf5() {
        assertThat(PrimeFactors.generate(5)).containsExactly(5);
    }

    @Test
    public void test6ReturnsListOf2And3() {
        assertThat(PrimeFactors.generate(6)).containsExactly(2, 3);
    }

    @Test
    public void test7ReturnsListOf7() {
        assertThat(PrimeFactors.generate(7)).containsExactly(7);
    }

    @Test
    public void test8ReturnsListOf2() {
        assertThat(PrimeFactors.generate(8)).containsExactly(2);
    }

    @Test
    public void test9ReturnsListOf3() {
        assertThat(PrimeFactors.generate(9)).containsExactly(3);
    }

    @Test
    public void test15ReturnsListOf3And5() {
        assertThat(PrimeFactors.generate(15)).containsExactly(3, 5);
    }

    @Test
    public void test30ReturnsListOf2And3And5() {
        assertThat(PrimeFactors.generate(30)).containsExactly(2, 3, 5);
    }

    @Test
    public void test210ReturnsListOf2And3And5And7() {
        assertThat(PrimeFactors.generate(210)).containsExactly(2, 3, 5, 7);
    }
}
