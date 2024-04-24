package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // Test cases for perdetails method
    @ParameterizedTest
    @CsvFileSource(resources = "/perdetails.csv", numLinesToSkip = 1)
    void testPerdetails(int age, String gender, boolean married, int result) {
        Person person = new Person();
        int calculatePremium = person.perdetails(age, gender, married);

        // Assert: Verify the result
        assertEquals(result, calculatePremium);
    }

}