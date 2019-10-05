import java.util.Arrays;


public class TailRecursionQSort extends QuickSort {

	@Override
	protected void quicksort(int[] a, int p, int r) {

		if (p < r) {
			int q = partition(a, p, r);
			quicksort(a, p, q - 1);
			p=q+1;
		}
	
	}
	
	public static void main(String[] args) {
		Sort o=new TailRecursionQSort();
		int[] a = { 10, 22, 3, 4, 1, 2 };
		o.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
