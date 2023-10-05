package predicateRACC;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import cal.Cal;

public class PredicateThreeRACC {
	
 
    //testing when year is inside boundries (TT)
    @Test
    public void TC_11() {
        int year = 1;
        int month1 = 1;
        int month2 = 1;
        int day1 = 1;
        int day2 = 2;
        int result = Cal.cal(month1, day1, month2, day2, year);
        System.out.println("the result when testing year is" + result);
        assertEquals("testing year=1", 1, result);
    }
	
    //testing for when year is > 10000 (FT)
    @Test
    public void TC_12() {
        try {
            int year = 10001;
            int month1 = 1;
            int month2 = 1;
            int day1 = 1;
            int day2 = 2;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on year");
        } catch (IllegalArgumentException e) {
            assertEquals("year must be <10001", e.getMessage());

        }
    }
	
	
    //testing for when year is <1 (TF)
    @Test
    public void TC_13() {
        try {
            int year = 0;
            int month1 = 1;
            int month2 = 1;
            int day1 = 1;
            int day2 = 2;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on year");
        } catch (Exception e) {
            assertEquals("year must be >0", e.getMessage());

        }
    }
	

}
