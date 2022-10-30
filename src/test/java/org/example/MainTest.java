package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void invertStringTest() {
        assertTrue(Main.invertString("ab").equals("ba"));
    }

    @org.junit.jupiter.api.Test
    void sortArrayTest() {
        int[] arr = {4,2,6};
        int[] result = {2,4,6};
        assertArrayEquals(Main.sortArray(arr),result);
    }

    @org.junit.jupiter.api.Test
    void splitStringTest() {
        String str = "a, b";
        String[] result = {"a" , "b"};
        //assertTrue(Main.splitString(str).equals(result));
        assertArrayEquals(Main.splitString(str),result);
    }

    @org.junit.jupiter.api.Test
    void checksumTest() {
        int number = 3456;
        int result = 3 + 4 + 5 + 6;
        assertEquals(Main.checksum(number),result);
    }

    @org.junit.jupiter.api.Test
    void invertNumberToRomanNumeralsTest(){
        int num = 56;
        assertEquals(Main.invertNumberToRomanNumerals(num), "LVI");
    }





}