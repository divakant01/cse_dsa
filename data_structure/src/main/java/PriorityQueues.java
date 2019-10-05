import java.util.Arrays;

public class PriorityQueues extends MaxHeap {

	private int[] a;

	public PriorityQueues(int[] a) {
		super(a);
		this.a = a;
		buildHeap(this.a);
	}

	public int getMax() {
		return a[0];
	}

	public int extractMax() {
		if (a.length < 1)
			throw new IllegalArgumentException("Heap is Empty");
		int max = a[0];
		a[0] = a[a.length - 1];
		heapify(a, a.length - 1, 0);
		return max;

	}

	private void shiftUp(int index) {

		int parentIndex = getParent(index);
		while (index >= 0 && a[parentIndex] < a[index]) {
			swap(a, parentIndex, index);
			index = parentIndex;
		}
	}

	
	public void changePriority(int index, int newValue) {
		int oldP = a[index];
		a[index] = newValue;

		if (newValue > oldP)
			shiftUp(index);
		else
			heapify(a, a.length, index);

	}

	public static void main(String[] args) {
		PriorityQueues priorityQ = new PriorityQueues(new int[] { 2, 3, 4, 5,
				1, 7 });
		System.out.println(priorityQ.extractMax());
		System.out.println(Arrays.toString(priorityQ.a));
		priorityQ.changePriority(1, 100);
		System.out.println(Arrays.toString(priorityQ.a));
	}

}
