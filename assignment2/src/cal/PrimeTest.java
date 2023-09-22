package cal;

import static org.junit.Assert.*;


import org.junit.Test;

public class PrimeTest {
	
	@Test
	public void firstPrimePath() {
		int m1 = 1;
		int m2 = 3;
		int d1 = 1;
		int d2 = 1; 
		int y = 2008; // leap year
		assertEquals("Test path: [1,3,4,6,7,8,9,8,10]", 60, Cal.cal(m1, d1, m2, d2, y));
	}
	
	@Test
	public void secondPrimePath() {
        int m1 = 1; 
        int m2 = 1; 
        int d1 = 1; 
        int d2 = 10;
        int y = 2008;  // leap year
        assertEquals("Test path: [1,2,10]", 9, Cal.cal(m1, d1, m2, d2, y));
    }
	
	@Test
	public void thirdPrimePath() {
        int m1 = 1; 
        int m2 = 4; 
        int d1 = 1; 
        int d2 = 10;
        int y = 2007; // non leap year
        assertEquals("Test path: [1,3,5,6,7,8,9,8,9,8,10]", 99, Cal.cal(m1, d1, m2, d2, y));
    }
	
	@Test
	public void fourthPrimePath() {
        int m1 = 1; 
        int m2 = 2; 
        int d1 = 1; 
        int d2 = 10;
        int y = 2008; // leap year
        assertEquals("Test path: [1,3,4,6,7,8,10]", 40, Cal.cal(m1, d1, m2, d2, y));
    }
	
	@Test
	public void fifthPrimePath() {
        int m1 = 1; 
        int m2 = 3; 
        int d1 = 1; 
        int d2 = 10;
        int y = 2007; // non-leap year
        assertEquals("Test path: [1,3,5,6,7,8,9,8,10]", 68, Cal.cal(m1, d1, m2, d2, y));
    }
	
	@Test
	public void sixthPrimePath() {
        int m1 = 1; 
        int m2 = 2; 
        int d1 = 1; 
        int d2 = 10;
        int y = 2007; // non-leap year
        assertEquals("Test path: [1,3,5,6,7,8,10]", 40, Cal.cal(m1, d1, m2, d2, y));
    }





}
