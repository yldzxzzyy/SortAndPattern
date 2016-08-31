package sort;

import java.util.Arrays;

/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午9:00:18
* describe :测试
*/
public class TestApp {
	
	public static void main(String[] args){
		
		System.out.println("-------------快速排序----------------");
		int a[] = Util.getRamdonNum(10, 20);
		System.out.println("排序前:" + Arrays.toString(a));
		QuickSort qs = new QuickSort();
		qs.sort(a); 
		System.out.println("排序后:" + Arrays.toString(a));
		System.out.println("----------------------------------");
		
		System.out.println("-------------插入排序----------------");
		a = Util.getRamdonNum(10, 20);
		System.out.println("排序前:" + Arrays.toString(a));
		InsertSort is = new InsertSort();
		is.sort(a);
		System.out.println("排序后:" + Arrays.toString(a));
		System.out.println("----------------------------------");
		
		System.out.println("-------------希尔排序----------------");
		a = Util.getRamdonNum(10, 20);
		System.out.println("排序前:" + Arrays.toString(a));
		ShellSort sis = new ShellSort();
		sis.sort(a);
		System.out.println("排序后:" + Arrays.toString(a));
		System.out.println("----------------------------------");
		
		System.out.println("-------------归并排序----------------");
		a = Util.getRamdonNum(10, 20);
		System.out.println("排序前:" + Arrays.toString(a));
		MergeSort ms = new MergeSort();
		ms.sort(a);
		System.out.println("排序后:" + Arrays.toString(a));
		System.out.println("----------------------------------");
		
		System.out.println("-------------冒泡排序----------------");
		a = Util.getRamdonNum(10, 20);
		System.out.println("排序前:" + Arrays.toString(a));
		BubbleSort bs = new BubbleSort();
		bs.sort(a);
		System.out.println("排序后:" + Arrays.toString(a));
		System.out.println("----------------------------------");
		
	}
}
