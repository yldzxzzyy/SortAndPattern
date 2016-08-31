package pattern.register;
/**
* @author huangkz E-mail:
* @version create time：2016年8月31日 上午9:58:32
* describe :
*/
public class Apple implements Fruit{
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void desc(){
		System.out.println("apple");
	}
}
