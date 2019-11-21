package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BonusBinarySearchTest {
    BonusBinarySearch test_Class;
    int[] testArr = {1, 2, 3, 4, 5, 6};
    int[] testArr2 = {3, 7, 29, 46, 53, 59, 63, 71, 85, 99, 104, 108, 112};
    int[] testArr3 = {-36, -32, -15, 0, 3, 9, 12};
    @Before
    public void createTestClass() {
        test_Class = new BonusBinarySearch();
    }
    @Test
    public void returnsCorrectlyWhenSearchNumIsInMiddle() {
        assertEquals(test_Class.binarySearch(testArr, 4), 3);
        assertEquals(test_Class.binarySearch(testArr2, 63), 6);
    }
    @Test
    public void returnsCorrectlyWhenSearchingForNumGreaterThanArray() {
        assertEquals(test_Class.binarySearch(testArr, 150), -1);
        assertEquals(test_Class.binarySearch(testArr2, 150), -1);
    }
    @Test
    public void returnsCorrectlyWhenSearchingForNumLessThanArray() {
        assertEquals(test_Class.binarySearch(testArr, 0), -1);
        assertEquals(test_Class.binarySearch(testArr2, -17), -1);
    }
    @Test
    public void returnsCorrectlyWhenSearchingForNonExistentNumInMiddleOfRange() {
        assertEquals(test_Class.binarySearch(testArr2, 56), -1);
        assertEquals(test_Class.binarySearch(testArr3, -31), -1);
    }
    @Test
    public void returnsCorrectlyWithNegativeNumbers() {
        assertEquals(test_Class.binarySearch(testArr3, -15), 2);
    }
    @Test
    public void returnsCorrectlyWhenSearchNumIsInLastPosition() {
        assertEquals(test_Class.binarySearch(testArr, 6), 5);
        assertEquals(test_Class.binarySearch(testArr2, 112), 12);
    }
    @Test
    public void returnsCorrectlyWhenSearchNumIsInFirstPosition() {
        assertEquals(test_Class.binarySearch(testArr, 1), 0);
        assertEquals(test_Class.binarySearch(testArr2, 3), 0);
    }
}
