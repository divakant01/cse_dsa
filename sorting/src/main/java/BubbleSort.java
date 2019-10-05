import java.util.Arrays;

public class BubbleSort implements Sort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    public static void main(String args[])
    {
        Sort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.sort(arr);
        System.out.println("Sorted array "+Arrays.toString(arr));
    }

	@Override
	public void sort(int [] arr) {
		bubbleSort(arr);
	}

}