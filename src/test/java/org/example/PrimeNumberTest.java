package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SuppressWarnings("ALL")
public class PrimeNumberTest {

    /**
     * Store the standard output stream before each test.
     * This ensures that we can restore the standard output stream after each test.
     */
    private final PrintStream standardOut = System.out;

    /**
     * Create a byte array output stream to capture the console output.
     * This allows us to capture and test the output printed to the console.
     */
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * Test the PrimeNumber class with various inputs.
     * This test method verifies that the prime method of the PrimeNumber class produces the expected output for each input.
     * It captures the console output, checks for null, and asserts the output against the expected result.
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/number.csv", numLinesToSkip = 1)
    public void testPrimeWithIsPrimeTrue(int n, String expectedResult) {
        PrimeNumber number = new PrimeNumber();

        // Capture the console output
        System.setOut(new PrintStream(outputStreamCaptor));
        number.prime(n);
        System.out.flush();

        // Get the captured console output
        String actualOutput = outputStreamCaptor.toString().trim();

        // Check for null
        assertNotNull(actualOutput, "Console output should not be null");

        // Assert the output
        assertEquals(expectedResult, actualOutput);
    }
}
