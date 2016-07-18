package com.java.courses.calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void validateTwoNumbersAddition() {
        System.out.println("Test addition");
        int result = calculator.add(3, 5);
        int expected = 8;

        assertEquals("Function of addition of two numbers returned wrong result",
                expected, result);
    }

    @Test
    public void validateTwoNumbersSubtraction() {
        System.out.println("Test subtraction");
        int result = calculator.subtract(8, 5);
        int expected = 3;

        assertEquals("Function of addition of two numbers returned wrong result",
                expected, result);
    }

    @Test(expected = DivisionByZero.class)
    public void shouldThrowDivideByZeroException() throws DivisionByZero {
        int result = calculator.divide(5, 0);
    }

    @Test(timeout = 20)
    public void testTimeout() {
        /*for (int i = 0; i < 10000000; i++) {
            int k = i / 10 + 10;
            System.out.println(k);
        }*/
    }
}
