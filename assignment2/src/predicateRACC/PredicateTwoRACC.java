package predicateRACC;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import cal.Cal;

public class PredicateTwoRACC {
	
    //Testing when all variables inside of boundry (TTTT)
    @Test
    public void TC_6() {
        int month1 = 1;
        int month2 = 2;
        int day1 = 1;
        int day2 = 5;
        int year = 1598;
        int result = Cal.cal(month1, day1, month2, day2, year);
        System.out.println("result for when all days are inside the bountry is " + result);
        assertEquals("day1>0", 35, result);
    }
    
    //testing for when day2 is >31 (TTTF)
    @Test
    public void TC_7() {
        try {
            int month1 = 1;
            int month2 = 2;
            int day1 = 1;
            int day2 = 32;
            int year = 1598;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on day2");
        } catch (Exception e) {
            assertEquals("day2 must be <32", e.getMessage());

        }
    }
    

    
    //testing for when day1 is >31 (TTFT)
    @Test
    public void TC_8() {
        try {
            int month1 = 1;
            int month2 = 2;
            int day1 = 32;
            int day2 = 5;
            int year = 1598;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on day1");
        } catch (Exception e) {
            assertEquals("day1 must be <32", e.getMessage());
        }
    }
    
    //testing for when day2 is <1 (TFTT)
    @Test
    public void TC_9() {
        try {
            int month1 = 1;
            int month2 = 2;
            int day1 = 1;
            int day2 = 0;
            int year = 1598;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on day2");
        } catch (Exception e) {
            assertEquals("day2 must be >0", e.getMessage());

        }
    }
    
    //Testing for when day1 is < 1 (FTTT)
    @Test
    public void TC_10() {
        try {
            int month1 = 1;
            int month2 = 2;
            int day1 = 0;
            int day2 = 5;
            int year = 1598;
            int result = Cal.cal(month1, day1, month2, day2, year);
            fail("error on day1");
        } catch (Exception e) {
            assertEquals("day1 must be >0", e.getMessage());

        }
    }
    


	

}
