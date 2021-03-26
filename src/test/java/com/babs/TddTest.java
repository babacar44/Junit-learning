package com.babs;

import org.junit.Assert;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TddTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void showTest() {
        String s = fizzBuzz.generateFizzBuzz(1);
        System.out.println(s);
    }

    @Test
    public void equal1() {
        assertThat(fizzBuzz.generateFizzBuzz(1).equals("1"));
    }

    @Test
    public void equal2() {
        Assert.assertEquals("2", fizzBuzz.generateFizzBuzz(2));
    }

    @Test
    public void equal3() {
        Assert.assertEquals("Fizz", fizzBuzz.generateFizzBuzz(3));
    }

    @Test
    public void equal4() {
        Assert.assertEquals("Fizz", fizzBuzz.generateFizzBuzz(6));
    }

    @Test
    public void equal5() {
        Assert.assertEquals("Buzz", fizzBuzz.generateFizzBuzz(5));
    }

    @Test
    public  void equal15() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.generateFizzBuzz(15));
    }

    @Test
    public void equalRandom() {
        Assert.assertEquals("Fizz", fizzBuzz.generateFizzBuzz(21));
    }
}
