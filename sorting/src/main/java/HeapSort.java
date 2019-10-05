import java.util.Arrays;


public class HeapSort extends MaxHeap implements Sort {
	
	
	@Override
	public void sort(int[] arr) {
		heapSort(arr);
	}

	private void heapSort(int[] arr) {

		// Build Heap - Constructor calls build Heap internally
		buildHeap(arr);
		int heapSize=arr.length;
		
		for(int i=arr.length-1;i>=1;i--){
			// 1st Element is the Largest - So rearrange and reducing Heapsize
			swap(arr,0,i);			
			heapSize--;
			// Get Next bigger element
			heapify(arr,heapSize ,0);
		}
		
		
	
	}

	public static void main(String[] args) {
		int[] a=new int[]{12,14,15,7,6,2,1};
		Sort o=new HeapSort();
		o.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
