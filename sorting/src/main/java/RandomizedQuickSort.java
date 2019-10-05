import java.util.Arrays;


public class RandomizedQuickSort extends QuickSort {

	@Override
	protected int partition(int[] a, int p, int r) {
		int i=p + ((int)Math.random()*(a.length))/(r-p+1);
		swapA(a,i,r);

		return super.partition(a, p, r);
	}

	public static void main(String[] args) {

		Sort o=new RandomizedQuickSort();
		int[] a = { 10, 22, 3, 4, 1, 2 };
		o.sort(a);
		System.out.println(Arrays.toString(a));
	
	}

}
