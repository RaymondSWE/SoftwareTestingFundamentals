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
//testing when day is inside boundrys
@Test
public void case6()
{
	int month1=1;
	int month2=2;
	int day1=1;
	int day2=5;
	int year=1598;
	int result=Cal.cal(month1, day1, month2, day2, year);
    System.out.println("result for when all days are inside the bountry is "+result);
assertEquals("day1>0", 35, result);
}
//testing for when day1 is >31
@Test
public void case7()
{
	try{
	int month1=1;
	int month2=2;
	int day1=32;
	int day2=5;
	int year=1598;
	int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on day1");
	}
	catch(Exception e)
	{
		assertEquals("day1 must be <32", e.getMessage());
	}
}
//testing for when day1 is <1
@Test
public void case8()
{
	try{
	int month1=1;
	int month2=2;
	int day1=0;
	int day2=5;
	int year=1598;
	int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on day1");
	}
	catch(Exception e)
	{
		assertEquals("day1 must be >0", e.getMessage());

	}
}
//testing for when day2 is <1
@Test
public void case9()
{
	try{
	int month1=1;
	int month2=2;
	int day1=1;
	int day2=0;
	int year=1598;
	int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on day2");
	}
	catch(Exception e)
	{
		assertEquals("day2 must be >0", e.getMessage());

	}
}
//testing for when day2 is >31
@Test
public void case10()
{
	try{
	int month1=1;
	int month2=2;
	int day1=1;
	int day2=32;
	int year=1598;
	int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on day2");
	}
	catch(Exception e)
	{
		assertEquals("day2 must be <32", e.getMessage());

	}
}
//testing for when year is <1
@Test
public void case11()
{
try
{
int year=0;
int month1=1;
int month2=1;
int day1=1;
int day2=2;
int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on year");
}
catch(Exception e)
{
	assertEquals("year must be >0", e.getMessage());

}
}
//testing for when year is >10000. 
@Test
public void case12()
{
try
{
int year=10001;
int month1=1;
int month2=1;
int day1=1;
int day2=2;
int result=Cal.cal(month1, day1, month2, day2, year);
fail("error on year");
}
catch(IllegalArgumentException e)
{
	assertEquals("year must be <10001", e.getMessage());

}
}
//testing when year is inside boundrys
@Test
public void case13()
{
int year=1;
int month1=1;
int month2=1;
int day1=1;
int day2=2;
int result=Cal.cal(month1, day1, month2, day2, year);
System.out.println("the result when testing year is"+result);
assertEquals("testing year=1", 1, result);
}
//testing for when month1 is >month2
@Test
public void case14()
{
	try{
	int month1=3;
	int month2=2;
	int day1=1;
	int day2=2;
	int year=1598;
int result=Cal.cal(month1, day1, month2, day2, year);
fail("testing month1>month2, error on month1");
	}
catch(Exception e)
{
assertEquals("month1 must be less than or equal to month2", e.getMessage());
}
}
//testing for when month1==month2 and also applys for when month1<=month2
@Test
public void case15()
{
	int month1=1;
	int month2=1;
	int day1=1;
	int day2=2;
	int year=1598;
int result=Cal.cal(month1, day1, month2, day2, year);
System.out.println("the result for when month1==month2 is "+result);
assertEquals("testing month1<=month2", 1, result);

}

}

