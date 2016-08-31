package sort;
/**
* @author huangkz E-mail:
* @version create time：2016年8月26日 下午4:00:48
* describe :快速排序
*/
public class QuickSort {
	
	public void sort(int a[]){	
		quicksort(a,0,a.length-1);
	}
	
	//一趟排序
	private static int part(int[] a,int low ,int high){
		int key = a[low];
		while(low < high){
			while(low < high && key <= a[high])
				high--;
			a[low] = a[high];
			while(low < high && key >= a[low])
				low++;
			a[high] = a[low];
		}
		a[low] = key;
		return low;
	}
	
	private static void quicksort(int[] a, int low, int high){
		if (low >= high)
			return ;
		int p = part(a,low,high);
		quicksort(a, low, p - 1);
		quicksort(a , p + 1, high);
	}
}
