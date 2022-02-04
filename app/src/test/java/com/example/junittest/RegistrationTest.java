package com.example.junittest;


import org.junit.Test;
import com.example.junittest.RegistrationCheck;

import static org.junit.Assert.*;

public class RegistrationTest {
    @Test
    public void isCorrectPasswordTest() {
        assertTrue(RegistrationCheck.isCorrectPassword("123456!Aa"));
    }
    @Test
    public void isCorrectEmailTest() {
        assertTrue(RegistrationCheck.isCorrectEmail("isip_l.yu.ostapenko@mpt.ru"));
    }
}
