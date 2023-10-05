package cal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalTestADUPC {

	
	 @Test
	    public void firstADUPCTest() {
	        int m1 = 5;
	        int m2 = 5;
	        int d1 = 1;
	        int d2 = 10;
	        int y = 2008;
	        assertEquals("Test path: [1, 2, 10]", 9, Cal.cal(m1, d1, m2, d2, y));
	    }

	    @Test
	    public void secondADUPCTest() {
	        int m1 = 1;
	        int m2 = 4;
	        int d1 = 1;
	        int d2 = 10;
	        int y = 2007; // non-leap year
	        assertEquals("Test path: [1,3,5,6,7,8,9,8,9,8,10]", 99, Cal.cal(m1, d1, m2, d2, y));
	    }

	    @Test
	    public void thirdADUPCTest() {
	        int m1 = 1;
	        int m2 = 4;
	        int d1 = 1;
	        int d2 = 10;
	        int y = 2008; // leap year
	        assertEquals("Test path: [1,3,4,6,7,8,9,8,9,8,10]", 100, Cal.cal(m1, d1, m2, d2, y));
	    }

	    @Test
	    public void fourthADUPCTest() {
	        int m1 = 2;
	        int m2 = 3;
	        int d1 = 1;
	        int d2 = 10;
	        int y = 2007; // non-leap year
	        assertEquals("Test path: [1,3,5,6,7,8,10]", 37, Cal.cal(m1, d1, m2, d2, y));
	    }

	    @Test
	    public void fifthADUPCTest() {
	        int m1 = 2;
	        int m2 = 3;
	        int d1 = 1;
	        int d2 = 10;
	        int y = 2008; // leap year
	        assertEquals("Test path: [1,3,4,6,7,8,10]", 38, Cal.cal(m1, d1, m2, d2, y));
	    }
	    

}
