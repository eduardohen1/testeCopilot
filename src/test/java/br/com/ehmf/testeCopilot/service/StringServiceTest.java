package br.com.ehmf.testeCopilot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringServiceTest {

    @Test
    void isPalindrome() {
        StringService stringService = new StringService();
        assertTrue(stringService.isPalindrome("ovo"));
        assertFalse(stringService.isPalindrome("teste"));
    }
}