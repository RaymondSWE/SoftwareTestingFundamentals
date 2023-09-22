package cal;


import static org.junit.Assert.*;


import org.junit.Test;


public class CalTestADC {
	

	
	@Test
	public void firstADCTest() {
        int m1 = 1; 
        int m2 = 2; 
        int d1 = 1; 
        int d2 = 1;
        int y = 2008; // non leap year
        assertEquals("Test path: [1,3,4,6,7,8,10]", 31, Cal.cal(m1, d1, m2, d2, y));
    }
	





}
