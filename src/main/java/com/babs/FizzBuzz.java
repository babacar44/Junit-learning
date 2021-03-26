package com.babs;

public class FizzBuzz {
    public String generateFizzBuzz(int nbr) {
        if (nbr % 15 == 0) return "FizzBuzz";
        if (nbr % 3 == 0) return "Fizz";
        if (nbr % 5 == 0) return "Buzz";
        return String.valueOf(nbr);
    }
}
