
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   @Test public void lastOccurrenceInFirstElement() 
   {
      int arr[] = { 2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
   }

   // ----------------------------------------------------------------
   // -----------------------------------------------------------------
   // Add your tests below with a comment stating which question it belongs to
   
   @Test
   public void findFirstElement() {
      int arr[] = {2, 3, 5};
      int y = 3;
      assertEquals("Find first element in array", 1, FindLast.findLast(arr, y));
   }
   
   @Test public void emptyArraySearch() 
   {
      int arr[] = {};
      int y = 2;
      assertEquals("Empty array search", -1, FindLast.findLast(arr, y));
   }
   
   
   @Test (expected = NullPointerException.class)
   public void searchForNull() 
   {
      int arr[] = null;
      int y = 2;
      assertEquals("Empty array search", null, FindLast.findLast(arr, y));
   }
   


   
}

