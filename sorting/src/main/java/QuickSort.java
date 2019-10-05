import java.util.Arrays;

public class QuickSort implements Sort {

	@Override
	public void sort(int[] a) {
		quicksort(a, 0, a.length - 1);
	}

	protected void quicksort(int[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quicksort(a, p, q - 1);
			quicksort(a, q + 1, r);
		}
	}

	protected int partition(int[] a, int p, int r) {
		int key = a[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {
			if (a[j] <= key) {
				i++;
				swapA(a, i, j);
			}

		}
		swapA(a, i + 1, r);

		return i + 1;
	}

	public static void main(String[] args) {
		Sort o = new QuickSort();
		int[] a = { 10, 22, 3, 4, 1, 2 };
		o.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
