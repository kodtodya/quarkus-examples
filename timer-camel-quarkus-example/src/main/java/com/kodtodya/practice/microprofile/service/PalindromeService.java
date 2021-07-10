package com.kodtodya.practice.microprofile.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PalindromeService {

    public String isPalindrome(String input) {
        return  (input.equals(new StringBuilder(input).reverse().toString())) ? "" : "not ";
    }
}
