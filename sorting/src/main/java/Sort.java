public interface Sort {

	void sort(int[] a);
	
	default void swapA(int[] a, int largest, int i) {
		int temp = a[largest];
		a[largest] = a[i];
		a[i] = temp;
	}
}
