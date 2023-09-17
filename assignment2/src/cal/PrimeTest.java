package cal;

import static org.junit.Assert.*;


import org.junit.Test;

public class PrimeTest {
	
	@Test
	// 1,2,8
	public void firstPrimePath() {
		int m1 = 5;
		int m2 = 5;
		int d1 = 1;
		int d2 = 10;
		int y = 2008;
		assertEquals("node 1 -> node 2 -> 8", 9, Cal.cal(m1, d1, m2, d2, y));
	}
	
	@Test
	// 1,3
	public void secondPrimePath() {
        int m1 = 1; 
        int m2 = 3; 
        int d1 = 31; 
        int d2 = 1;
        int y = 2008; 
        assertEquals("node 1 -> node 3 -> node 4 -> node 6 -> node -> 7 node -> 8", 30, Cal.cal(m1, d1, m2, d2, y));
    }


}
