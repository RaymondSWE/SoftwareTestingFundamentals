package cal;


import static org.junit.Assert.*;


import org.junit.Test;


public class CalTestADC {
	

	
	@Test
	public void firstADCTest() {
        int m1 = 1; 
        int m2 = 4; 
        int d1 = 1; 
        int d2 = 1;
        int y = 2008; // leap year
        assertEquals("Test path: [1,3,4,6,7,8,9,8,9,8,10]", 91, Cal.cal(m1, d1, m2, d2, y));
    }
	
	 @Test
	  public void secondADCTest() {
		 
	        int m1 = 1; 
	        int m2 = 1; 
	        int d1 = 1; 
	        int d2 = 10;
	        int y = 2008; //  leap year
	        assertEquals("Test path: [1,2,10]", 9, Cal.cal(m1, d1, m2, d2, y));
	    }
	 
		@Test
		public void thirdADCTest() {
	        int m1 = 1; 
	        int m2 = 4; 
	        int d1 = 1; 
	        int d2 = 1;
	        int y = 2007; // leap year
	        assertEquals("Test path: [1,3,5,6,7,8,9,8,9,8,10]", 90, Cal.cal(m1, d1, m2, d2, y));
	    }
	 

}
