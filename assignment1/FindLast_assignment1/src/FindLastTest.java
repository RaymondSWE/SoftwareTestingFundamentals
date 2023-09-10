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
    @Test
    public void findInSingleElementArray() {
        int arr[] = {3};
        int y = 3;
        assertEquals("Find in single element array", 0, FindLast.findLast(arr, y));
    }

    @Test 
    public void emptyArraySearch() {
        int arr[] = {};
        int y = 2;
        assertEquals("Empty array search", -1, FindLast.findLast(arr, y));
    }

    @Test
    public void testLastOccurrenceNotAtFirstPosition() {
        int[] arr = {5, 1, 2, 3, 5};
        int y = 5;
        assertEquals("Last occurrence not in first position", 4, FindLast.findLast(arr, y));
    } 
    
    // Error state question 4:
    @Test 
    public void trueIfFoundInZerothElement() {
        int arr[] = {7, 8, 9};
        int y = 7;

        int result = FindLast.findLast(arr, y);
        assertTrue("Expected to find the element at index 0, but found it at index " + result, result == 0);
    }

    // Test where the only occurrence of the value is at the 0th index.
    @Test
    public void testOnlyOccurrenceAtFirstPosition() {
        int[] arr = {5, 1, 2, 3, 4};
        int y = 5;
        assertEquals("Only occurrence in first position", 0, FindLast.findLast(arr, y));
    }

    // ... other methods or tests

}
