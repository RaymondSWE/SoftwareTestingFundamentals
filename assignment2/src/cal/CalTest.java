package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	// This test passes!, this is the test that goes from node 1 to 2.
	public void sameMonthLeapYear() {
		int m1 = 5;
		int m2 = 5;
		int d1 = 1;
		int d2 = 10;
		int y = 2008;
		assertEquals("month1 == month2", 9, Cal.cal(m1, d1, m2, d2, y));
	}
	// src for leap year or not: https://www.learnalberta.ca/content/memg/division02/month/Leap%20Year/index.html
	// Online calculator of days: https://planetcalc.com/274/
	@Test
	public void differentMonthNonLeapYear() {
	    int m1 = 4;
	    int m2 = 5;
	    int d1 = 1;
	    int d2 = 1;
	    int y = 2007; 
	    assertEquals("month1 != month2 && !((m4 != 0) || ((m100 == 0) && (m400 != 0))", 30, Cal.cal(m1, d1, m2, d2, y));
	}
	
	@Test
	public void differentMonthLeapYear() {
	    int m1 = 4;
	    int m2 = 5;
	    int d1 = 1;
	    int d2 = 1;
	    int y = 2008; 
	    assertEquals("month1 != month2 && ((m4 != 0) || ((m100 == 0) && (m400 != 0))", 30, Cal.cal(m1, d1, m2, d2, y));
	}
	
	
	@Test
	// Test to ensure correct calculation for leap years during intervening months
	public void interveningMonthLeapYear() {
        int m1 = 1; 
        int m2 = 3; 
        int d1 = 31; 
        int d2 = 1;
        int y = 2008; 
        assertEquals("month1 < month2, intervening months included, covering edge(5,7) with for-loop (leap year)", 30, Cal.cal(m1, d1, m2, d2, y));
    }

	
	// All of the test will cover edges to  node 8 (return numDays)
	// Results of test coverage with node
	/* Edge(1,2):  sameMonthLeapYear
	 * Edge(1,3):  differentMonthNonLeapYear, interveningMonthLeapYear, interveningMonthNonLeapYear, differentMonthLeapYear
	 * Edge(3,4):  differentMonthLeapYear
	 * Edge(3,5): differentMonthNonLeapYear
	 * Edge(5,7): interveningMonthLeapYear
	 * edge(5,8): differentMonthNonLeapYear, differentMonthLeapYear
	 * edge(7,8): interveningMonthLeapYear
	 */


	
	


}