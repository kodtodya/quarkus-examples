package com.kodtodya.practice.microprofile.rest;

import com.kodtodya.practice.microprofile.service.PalindromeService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/is-palindrome")
public class PalindromeResource {

    @Inject
    private PalindromeService service;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(String input) {
        return input + " is " + service.isPalindrome(input) + "a palindrome String.";
    }
}