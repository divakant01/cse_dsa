import java.util.Arrays;


public class CountingSort extends MaxHeap implements Sort {
	

	@Override
	public void sort(int[] a) {
		buildHeap(a);
		System.out.println(Arrays.toString(a));
		countingSort(a,a[0]);
	}

	private void countingSort(int[] a, int k) {
		int [] c=new int[k+1];
		int[] b=new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
			c[a[i]]++;
				
		for(int i=1;i<=k;i++)
			c[i]+=c[i-1];
		
		for(int j=a.length-1;j>0;j--)
		{
			b[c[a[j]]]=a[j];
			c[a[j]]--;
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		Sort s=new CountingSort();
		int[] a = { 10, 22, 3, 4, 1, 2 };
		s.sort(a);
	}

}
