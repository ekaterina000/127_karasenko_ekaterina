import org.junit.Assert;
import org.junit.Test;

public class Task2_Tests extends Assert {
    static class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    ///////////////BubbleSort

    @Test
    public void BubbleSort_sortTheSameNumbers_IsCorrect() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {1, 1, 1};
        sorter.sort(bubbleArray, new TestComparator());
        assertArrayEquals(new Integer[]{1, 1, 1}, bubbleArray);
    }

    @Test
    public void BubbleSort_rightOrder_NumbersInRightOrder() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {2, 4, 6};
        sorter.sort(bubbleArray, new TestComparator());
        assertArrayEquals(new Integer[]{2, 4, 6}, bubbleArray);
    }
    @Test
    public void BubbleSort_SortData_DataIsCorrect() {
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] bubbleArray = {1, 5, 3};
        sorter.sort(bubbleArray, new TestComparator());
        assertArrayEquals(new Integer[]{1, 3, 5}, bubbleArray);
    }

    /////InsertionSort

    @Test
    public void InsertionSort_SortAlreadySortedArray_ArrayIsCorrect() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] insertionArray = {7, 87, 32};
        sorter.sort(insertionArray, new TestComparator());
        assertArrayEquals(new Integer[]{7, 32, 87}, insertionArray);
    }
    @Test
    public void InsertionSort_UnsortedArray_ArrayIsCorrect() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] insertionArray = {784, 12, 36};
        sorter.sort(insertionArray, new TestComparator());
        assertArrayEquals(new Integer[]{12, 36, 784}, insertionArray);
    }

////////////////SelectionSort

    @Test
    public void SelectionSort_InvertedArray_ArrayIsCorrect() {
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] selectionArray = {4, 2, 1};
        sorter.sort(selectionArray, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 4}, selectionArray);
    }

    @Test
    public void SelectionSort_UnsortedArray_ArrayIsCorrect() {
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] selectionArray = {10, 5};
        sorter.sort(selectionArray, new TestComparator());
        assertArrayEquals(new Integer[]{5, 10}, selectionArray);
    }

    @Test
    public void SelectionSort_SortArray_ArrayIsCorrect() {
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] selectionArray = {75,3,94,7};
        sorter.sort(selectionArray, new TestComparator());
        assertArrayEquals(new Integer[]{3, 7, 75, 94}, selectionArray);
    }
}

