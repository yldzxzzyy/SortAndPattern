package sort;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午10:34:19
* describe :冒泡排序
*/
public class BubbleSort {

	public void sort(int[] a) {
		boolean flag = true;
		int len = a.length;
		int temp;
		for (int i = 0; i < len ; i++){
			flag = false;
			for (int j = 0; j < len - i -1; j++){
				if(a[j] > a[j +1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
		}
	}

}
