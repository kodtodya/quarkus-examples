package com.kodtodya.practice.resource;

import com.kodtodya.practice.services.PallindromeService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/kodtodya-ops")
public class PallindromeResource {

    @Inject
    private PallindromeService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/check/pallindrome")
    public String checkPallindrome(@QueryParam("input") String input) {
        return (service.isPallindrome(input)) ? "Yes, Pallindrome String" : "No, Not a Pallindrome String";

    }
}