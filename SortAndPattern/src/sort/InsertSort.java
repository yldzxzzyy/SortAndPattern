package sort;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午9:45:10
* describe :插入排序
*/
public class InsertSort {

	public void sort(int[] a) {
		int key = 0;
		int j = 0;
		for (int i = 0; i < a.length -1;i++){
			if(a[i+1] < a[i]){
				key = a[i+1];
				j = i + 1;
				while( j > 0 && key < a[j-1]){
					a[j] = a[j -1];
					j--;
				}
				a[j] = key;
			}
		}
	}
	
}
