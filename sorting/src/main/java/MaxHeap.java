import java.util.Arrays;


public class MaxHeap {
	
	public MaxHeap() {
		
	}
	
	public MaxHeap(int[] a) {
		buildHeap(a);
	}
	
	public int getParent(int i) {
		return (int) Math.floor((i - 1) / 2);
	}
		
	public int getLeft(int i) {
		return 2 * i + 1;
	}

	public int getRight(int i) {
		return 2 * i + 2;
	}
	
	protected void buildHeap(int[] a){
		int n=a.length;
		for(int i=a.length/2;i>=0;i--)
			heapify(a,n,i);
	}
	
	protected void heapify(int[] a,int heapSize, int i) {
		int l = getLeft(i);
		int r = getRight(i);
		int largest = i;

		if (l < heapSize && a[l] > a[i])
			largest = l;
		if (r < heapSize && a[r] > a[largest])
			largest = r;
		if (largest != i) {
			swap(a, largest, i);
			heapify(a,heapSize, largest);
		}
	}

	protected void swap(int[] a, int largest, int i) {
		int temp = a[largest];
		a[largest] = a[i];
		a[i] = temp;
	}
	
	public static void main(String[] args) {
		int[] a=new int[]{2,3,4,5,1,7};
		MaxHeap m=new MaxHeap();
		m.buildHeap(a);
		System.out.println(Arrays.toString(a));
	}
}
