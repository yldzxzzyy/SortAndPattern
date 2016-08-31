package sort;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午10:19:55
* describe :希尔排序
*/
public class ShellSort {
	private int d[] = {5,3,1};
	
	public void sort(int[] a) {
		//增量dk
		for (int i = 0; i < d.length; i++){ 
			ShellInsert(a, d[i]);
		}
	}
	
	//一趟希尔排序
	private static void ShellInsert(int [] a, int dk){
		int j= 0,key =0;
		for (int i = 0; i < a.length - dk ; i++){
			key = a[i+dk];
			j = i + dk;
			while( j-dk >= 0 && key < a[j - dk]){
				a[j] = a[j - dk];
				j -= dk;
			}
			a[j] = key;
		}
	}
}
