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
        assertThat(PrimeFactors.generate(2)).containsSequence(2);
    }

    @Test
    public void test3ReturnsListOf3() {
        assertThat(PrimeFactors.generate(3)).containsSequence(3);
    }

    @Test
    public void test4ReturnsListOf2() {
        assertThat(PrimeFactors.generate(4)).containsSequence(2);
    }
}
