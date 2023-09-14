import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest {

    @Test 
    public void lastOccurrenceInFirstElement() {
        int arr[] = { 2, 3, 5};
        int y = 2;
        assertEquals("Last occurrence in first element", 0, FindLast.findLast(arr, y));
    }

    // ----------------------------------------------------------------
    // -----------------------------------------------------------------
    // Add your tests below with a comment stating which question it belongs to
    
    // Fråga 2
    @Test (expected = NullPointerException.class)
    public void testWithNullArray() {
        int arr[] = null;
        int y = 3;
        FindLast.findLast(arr, y);
    }
    
    
    // Fråga 3
    @Test public void emptyArraySearch() 
    {
       int arr[] = {};
       int y = 2;
       assertEquals("Empty array search", -1, FindLast.findLast(arr, y));
    }
    
    // Fråga 4
    @Test 
    public void elementNotPresentInArray() {
    	int[] arr =  {3, 1 ,3};
        int y = 6;
        assertEquals("Searching for an element, that is not present in the array", -1, FindLast.findLast(arr, y));
    }
    

}
