package com.bookstoread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FailureAndErrorTests {

    @Test
    void stringIsNotEmpty() {
        String str = "";
        assertFalse(str.isEmpty());
    }

    @Test
    void thisMethodThrowsException() {
        String str = null;
        assertTrue(str.isEmpty());
    }
}
