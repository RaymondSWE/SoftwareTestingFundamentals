package predicateRACC;

import static org.junit.Assert.*;


import org.junit.Test;

import cal.Cal;

public class PredicateFourAndSixRACC {
	
	
	
    //testing for when month1==month2 and also applies for when month1 <= month2 (True)
    @Test
    public void TC_14() {
        int month1 = 1;
        int month2 = 1;
        int day1 = 1;
        int day2 = 2;
        int year = 1598;
        int result = Cal.cal(month1, day1, month2, day2, year);
        System.out.println("the result for when month1==month2 is " + result);
        assertEquals("testing month1<=month2", 1, result);

    }
	
    //testing for when month1 is > month2 (False)
    @Test
    public void TC_15() {
        try {
            int month1 = 3;
            int month2 = 2;
            int day1 = 1;
            int day2 = 2;
            int year = 1598;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("testing month1>month2, error on month1");
        } catch (Exception e) {
            assertEquals("month1 must be less than or equal to month2", e.getMessage());
        }
    }

}
