package com.kodtodya.practice.services;

import javax.enterprise.context.ApplicationScoped;
import java.util.stream.IntStream;

@ApplicationScoped
public class PallindromeService {

    public boolean isPallindrome(String input) {
        String temp = input.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
