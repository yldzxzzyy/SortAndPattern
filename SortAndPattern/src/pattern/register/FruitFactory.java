package pattern.register;
/**
* @author huangkz E-mail:
* @version create time：2016年8月31日 上午9:59:43
* describe :
*/
public class FruitFactory {
	
	//获取
	public static Fruit getFruit(String key){
		Fruit value = Register.get(key);
		if (value == null) {
			value = createFruit(key);
			Register.set(key, value);
		}
		return value;
	}
	//注册
	public static Fruit createFruit(String key){
		Fruit fruit = null;
		if ("Apple".equalsIgnoreCase(key)) {
			fruit = new Apple();
		} else if ("Banana".equalsIgnoreCase(key)) {
			fruit = new Banana();
		}
		return fruit;
	}
	
}
