package cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PredicateSevenRACC {
	
	
    //Testing for when year is 2022, m4 = 2, m100 = 22, m400 = 22 (TFT)
    @Test
    public void TC_17() {
            int d1 = 5;
            int m1 = 1;
            int m2 = 2;
            int d2 = 3;
            int year = 1723;
            int result = Cal.cal(m1, d1, m2, d2, year);
            System.out.println("the result is" + result);
            assertEquals("m1>=1", 29, result);
    }
    
	
    //Testing for when year is 1900, m4 = 0, m100 = 0, m400 = 300 with year 1900 (FTT)
    @Test
    public void TC_18() {
            int d1 = 5;
            int m1 = 1;
            int m2 = 2;
            int d2 = 3;
            int year = 1900;
            int result = Cal.cal(m1, d1, m2, d2, year);
            System.out.println("the result is" + result);
            assertEquals("m1>=1", 29, result);
    }
    
    //Testing for when year is 2024, mod 4 = 0, mod 100 = 24, m400 = 24 (FFT)
    @Test
    public void TC_19() {
            int d1 = 5;
            int m1 = 1;
            int m2 = 2;
            int d2 = 3;
            int year = 2024;
            int result = Cal.cal(m1, d1, m2, d2, year);
            System.out.println("the result is" + result);
            assertEquals("m1>=1", 29, result);
    }
    
    
    
    
    

}
