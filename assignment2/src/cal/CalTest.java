package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	// This test passes!
	public void sameMonthLeapYear() {
		int m1 = 5;
		int m2 = 5;
		int d1 = 1;
		int d2 = 10;
		int y = 2008;
		assertEquals("m1 == m2", 9, Cal.cal(m1, d1, m2, d2, y));
	}
	
	// Insert your tests for current assignment below
	// Note: We will use Cal for many assignments and there are several techniques 
	// covered in each assignment so a mapping between test cases and test requirements
	// is necessary. Hence, you need to make sure that the report clarifies which tests 
	// that are included in which test suite(s) and which test requirement(s) that are
	// covered by which test(s).
}
