package sort;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 上午10:23:51
* describe :归并排序
*/
public class MergeSort {

	public void sort(int[] a) {
		int b [] = new int[10];
		Msort(a,b,0,0,a.length - 1);
	}
	
	//2路归并
	//将相邻的有序区间a[i,...,m]，a[m+1,....,n] 归并为有序的TR[i,n]
	private static void Merge(int a[],int tr[],int i,int m,int n){
		int k,j;
		for(k = i,j = m + 1; i <= m && j <= n; k++){
			if(a[i] <= a[j])
				tr[k] = a[i++];
			else
				tr[k] = a[j++];			
		}
		while(i <= m){
			tr[k++] = a[i++];
		}
		while(j <= n){
			tr[k++] = a[j++];
		}
	}
	//对r1[s,t]进行归并排序，如果i%2 == 1 则排序的队列存入r2,否则存入r1,
	private static void Msort(int r1[], int r2[], int i, int s, int t){
		int m ;
		if(s == t){
			if(1 == i%2)
				r2[s] = r1[s];
		}else{	
			m = (s + t)/2;
			Msort(r1,r2,i+1,s,m);
			Msort(r1,r2,i+1,m+1,t);
			if(1 == i%2){
				Merge (r1,r2,s,m,t);
			}else{
				Merge (r2,r1,s,m,t);
			}
			
		}	
	}
	
}
