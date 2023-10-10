package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {
// All tests should pass for original code version
	@Test
	public void febToMarMillenium() {
		int m1 = 2;
		int m2 = 3;
		int d1 = 15;
		int d2 = 25;
		int y = 2000;
		assertEquals("Feb to Mar, millenium", 39, Cal.cal(m1, d1, m2, d2, y));
	}

	@Test
	public void febToAprCenturyNoMillenium() {
		int m1 = 2;
		int m2 = 4;
		int d1 = 25;
		int d2 = 10;
		int y = 1900;
		assertEquals("Feb to Apr, century but not millenium", 44, Cal.cal(m1, d1, m2, d2, y));
	}

	@Test
	public void febToMayOddYear() {
		int m1 = 2;
		int m2 = 5;
		int d1 = 12;
		int d2 = 31;
		int y = 1801;
		assertEquals("Feb to May, odd year", 108, Cal.cal(m1, d1, m2, d2, y));
	}

	@Test
	public void AprToDecOddYear() {
		int m1 = 4;
		int m2 = 12;
		int d1 = 30;
		int d2 = 31;
		int y = 2007;
		assertEquals("Apr to Dec, odd year", 245, Cal.cal(m1, d1, m2, d2, y));
	}

	@Test
	public void SameMonthOneDay() {
		int m1 = 1;
		int m2 = 1;
		int d1 = 1;
		int d2 = 2;
		int y = 1995;
		assertEquals("Same month", 1, Cal.cal(m1, d1, m2, d2, y));
	}

}
