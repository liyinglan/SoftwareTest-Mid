import static org.junit.Assert.*;

import org.junit.Test;


public class SortingTest {

	private Sorting sorting;
	private Sorting sortingB;
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int[] a = {0, 1, 3, 4, 5, 2};
		
		sorting = new Sorting();
		sortingB = new Sorting();
		
		Sorting[] s = {sorting, sortingB};
		
		
		Sorting.swap(a, 2, 3);
		Sorting.swapReferences(s, 0, 1);
		
		assertEquals(false, sorting.isSorted(a));
		
		sorting.insertionSort(a);

		assertEquals(true, sorting.isSorted(a));
		
		
		int[] b = {1, 3, 5, 7, 100, 0, 6, 10, 2, 11, 13, -1};
		Sorting.quicksort(b);
		
		int[] c = {0, 1, 2, 3, 5, 6, 4};
		Sorting.quicksort(c);
		
		assertEquals(true, sorting.isSorted(b));
	}

}
