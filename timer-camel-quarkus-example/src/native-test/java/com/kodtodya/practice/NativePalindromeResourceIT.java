package com.kodtodya.practice;

import com.kodtodya.practice.microprofile.rest.PalindromeResource;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativePalindromeResourceIT extends PalindromeResource {

    // Execute the same tests but in native mode.
}