package cal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PredicateEightRACC {
	
    //Testing for when month1 + 1 <= month2-1 (True case because 30 + (1 month) days <= 120 - (1 month))
    @Test
    public void TC_20() {
            int d1 = 1;
            int m1 = 1;
            int m2 = 4;
            int d2 = 1;
            int year = 1723;
            int result = Cal.cal(m1, d1, m2, d2, year);
            System.out.println("the result is" + result);
            assertEquals("when month1 + 1 <= month2-1 (True case because 30 + (1 month) days <= 120 - (1 month))", 90, result);
    }
    
    //Testing for when month1 + 1 >= month2-1 (false case because 30 + (1 month) days <= 60 - (1 month))
    @Test
    public void TC_21() {
            int d1 = 1;
            int m1 = 1;
            int m2 = 2;
            int d2 = 1;
            int year = 1723;
            int result = Cal.cal(m1, d1, m2, d2, year);
            System.out.println("the result is" + result);
            assertEquals("when month1 + 1 >= month2-1 (false case because 30 + (1 month) days <= 60 - (1 month))", 31, result);
    }
    

}
