package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void isPostalCodeValid() {
        String postalCode = "C1N 4X7";
        boolean expResult = true;
        boolean result = Address.isPostalCodeValid(postalCode);
        assertEquals(expResult, result);
    }
    @Test
    void isPostalCodeValid2() {
        String postalCode = "C1N4X7";
        boolean expResult = true;
        boolean result = Address.isPostalCodeValid(postalCode);
        assertEquals(expResult, result);
    }
    @Test
    void isPostalCodeValid3() {
        String postalCode = "21N4X7";
        boolean expResult = false;
        boolean result = Address.isPostalCodeValid(postalCode);
        assertEquals(expResult, result);
    }
    @Test
    void isPostalCodeValid4() {
        String postalCode = "CKN4X7";
        boolean expResult = false;
        boolean result = Address.isPostalCodeValid(postalCode);
        assertEquals(expResult, result);
    }
}
