
/*
 * Ith Smallest Element
 * 
 * */
public class IthOrderStatistics extends RandomizedQuickSort {

	private int randomizedSelect(int[] a,int p,int r,int i){
		
		if(p==r)
			return a[p];
		int q=partition(a,p,r);
		
		int k=q-p+1;
		
		if(i==k)
			return a[q];
		
		else if(i<k)
			return randomizedSelect(a, p, q-1, i);
		else
			return randomizedSelect(a, q+1, r, i-k);
	}
	
	int getIthOrder(int[] a,int i){
		return randomizedSelect(a, 0, a.length-1, i);
	}
	
	public static void main(String[] args) {
		IthOrderStatistics ith=new IthOrderStatistics();
		System.out.println(ith.getIthOrder(new int[] {3,2,4,5},4));
	}

}
