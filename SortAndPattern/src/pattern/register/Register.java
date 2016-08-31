package pattern.register;

import java.util.HashMap;
import java.util.Map;

/**
* @author huangkz E-mail:
* @version create time：2016年8月31日 上午9:54:44
* describe :注册树
*/
public class Register {
	private static Map<String,Fruit> fruitTree;
	
	//获取
	public static Fruit get(String key){
		if (fruitTree == null) {
			return null;
		}
		return fruitTree.get(key);
	}
	//注册
	public static void set(String key,Fruit value){
		if (fruitTree == null) {
			fruitTree = new HashMap<>();
		}
		fruitTree.put(key, value);
	}
	//撤销
	public static void unset(String key){
		if(fruitTree.containsKey(key))
			fruitTree.remove(key);
	}
}
