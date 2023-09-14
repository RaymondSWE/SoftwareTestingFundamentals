package cal;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //create suite for tests
@Suite.SuiteClasses({
    CalTest.EdgeCoverageTests.class, //class used for the tests
})
public class CalTest {

    public static class EdgeCoverageTests {
        @Test
        public void sameMonthLeapYear() { //month1 and month2 is the same and it's leap year (february has 29 days)
            int m1 = 5;
            int m2 = 5;
            int d1 = 1;
            int d2 = 10;
            int y = 2008;
            //need to add print to the rest tests too
            int result = Cal.cal(m1, d1, m2, d2, y);
            System.out.println("Test Case: sameMonthLeapYear"); 
            System.out.println("Expected Result: 9"); //9 days difference
            System.out.println("Actual Result: " + result);
            assertEquals("month1 and month2 is the same, leap year", 9, result);
        }

        @Test
        public void sameMonthNonLeapYear() { //month1 and month2 is the same and it's not leap year (february has 28 days)
            int m1 = 2;
            int m2 = 2;
            int d1 = 1;
            int d2 = 15;
            int y = 2023;
            assertEquals("month1 and month2 is the same, not leap year", 14, Cal.cal(m1, d1, m2, d2, y));
        }

        @Test
        public void differentMonthsSameYear() {
            int m1 = 3;
            int m2 = 4;
            int d1 = 10;
            int d2 = 10;
            int y = 2023;
            int result = Cal.cal(m1, d1, m2, d2, y);
            System.out.println("Test Case: differentMonthsSameYear"); 
            System.out.println("Expected Result: 31");
            System.out.println("Actual Result: " + result);
            assertEquals("Different months and same year", 31, result);
        }

        @Test
        public void differentMonthsLeapYear() { //month1 and month2 is not the same and it's leap year
            int m1 = 1;
            int m2 = 5;
            int d1 = 15;
            int d2 = 2;
            int y = 2024; //2024 is a leap year
            assertEquals("Different months and leap year", 108, Cal.cal(m1, d1, m2, d2, y));
        }

        @Test
        public void maxYear() { //maximum value of the year, valculate first day of january and last day of december
            int m1 = 1;
            int m2 = 12;
            int d1 = 1;
            int d2 = 31;
            int y = 10000; 
            int result = Cal.cal(m1, d1, m2, d2, y);
            System.out.println("Test Case: maxYear"); 
            System.out.println("Expected Result: 365");
            System.out.println("Actual Result: " + result);
            assertEquals("max year", 365, Cal.cal(m1, d1, m2, d2, y));
        }

        @Test
        public void invalidInput() { //Testing invalid inputs, it's meant to be failure
            int m1 = 0; // Invalid month
            int m2 = 13; // Invalid month
            int d1 = 40; // Invalid day
            int d2 = 0; // Invalid day
            int y = -100; // Invalid year
            assertEquals("Invalid input, return 0", 0, Cal.cal(m1, d1, m2, d2, y));
        }
    }
}