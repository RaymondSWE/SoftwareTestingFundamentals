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
	    assertEquals("month1 != month2 && !leapyear)", 30, Cal.cal(m1, d1, m2, d2, y));
	}
	
	@Test
	public void differentMonthLeapYear() {
	    int m1 = 1;
	    int m2 = 3;
	    int d1 = 1;
	    int d2 = 1;
	    int y = 2008; 
	    assertEquals("month1 != month2 && leapyear)", 60, Cal.cal(m1, d1, m2, d2, y));
	}
	
	



}