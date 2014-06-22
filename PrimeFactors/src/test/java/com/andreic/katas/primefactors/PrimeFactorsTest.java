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
}
