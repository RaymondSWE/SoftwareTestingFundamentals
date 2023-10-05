package cal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalTest {
    //testing for when month1 is <1
@Test
public void case1()
{
try{
		int d1=5;
		int m1=0;
		int m2=2;
		int d2=3;
		int year=1598;
int result=Cal.cal(m1, d1, m2, d2, year);
fail("expected error on month 1");
		}
catch(Exception e)
{
	assertEquals("month 1 must be >1", e.getMessage());
}
}
	//testing for when all months are inside the boundry.
	@Test
	public void case2()
	{
		int d1=5;
		int m1=1;
		int m2=2;
		int d2=3;
		int year=1598;
int result=Cal.cal(m1, d1, m2, d2, year);
System.out.println("the result is"+result);
assertEquals("m1>=1", 29,  result);
	}
//testing for when month1 is >12
@Test
public void case3()
{
    try{
    int d1=5;
    int m1=13;
    int m2=2;
    int d2=3;
    int year=1598;
int result=Cal.cal(m1, d1, m2, d2, year);
fail("error on month2");
    }
    catch(Exception e)
    {
assertEquals("month1 must be <=12", e.getMessage());
    }

}
//testing for when month2 is <1
@Test
public void case4()
{
    try{
int m1=2;
int m2=0;
int d1=5;
int d2=3;
int year=1598;
int result=Cal.cal(m1, d1, m2, d2, year);
fail("error on month2");
    }
    catch(Exception e)
    {
        assertEquals("month2 must be >0", e.getMessage());

    }
}
//testing for when month2 is >12
@Test
public void case5()
{
    try{
int m1=2;
int m2=13;
int d1=5;
int d2=3;
int year=1598;
int result=Cal.cal(m1, d1, m2, d2, year);
fail("error on month2");
    }
    catch(Exception e)
    {
        assertEquals("month2 must be <12", e.getMessage());
    }
}


}

