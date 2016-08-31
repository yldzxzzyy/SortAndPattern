package sort;

import java.util.Random;

/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午9:00:00
* describe :
*/
public class Util {
	
	//获取随机数组
	public static int[] getRamdonNum(int size, int bound){
		int a[] = new int[size];
		Random rd = new Random();
		for (int i = 0; i < size; i++ ){
			a[i] = rd.nextInt(bound) + 1;
		}
		return a;
	}
	
}
