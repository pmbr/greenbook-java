package org.greenbook;

import org.junit.Test;

import static org.greenbook.AdjacentDuplicateRemover.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AdjacentDuplicateRemoverTest {

    @Test
    public void testRemoveAdjacentDuplicateCase1() {
        String input = "pqqprq";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "rq";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase2() {
        String input = "abcde";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "abcde";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase3() {
        String input = "pqqqprq";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "rq";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase4() {
        String input = "aabcc";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "b";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase5() {
        String input = "pqqqprqaa";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "rq";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase6() {
        String input = "abba";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase8() {
        String output = removeAdjacentDuplicate(null);
        assertNull(output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase9() {
        String input = "";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase10() {
        String input = "a";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "a";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testRemoveAdjacentDuplicateCase11() {
        String input = "aa";
        String output = removeAdjacentDuplicate(input);
        String expectedOutput = "";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testHead() {
        String head = head("abcdef", 2);
        String expectedHead = "ab";
        assertEquals(expectedHead, head);
    }

    @Test
    public void testHead2() {
        String head = head("abcdef", 0);
        String expectedHead = "";
        assertEquals(expectedHead, head);
    }

    @Test
    public void testTail() {
        String head = tail("abcdef", 3);
        String expectedHead = "def";
        assertEquals(expectedHead, head);
    }

}