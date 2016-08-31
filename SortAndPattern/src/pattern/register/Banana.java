package pattern.register;
/**
* @author huangkz E-mail:
* @version create time：2016年8月31日 上午9:59:10
* describe :
*/
public class Banana implements Fruit{
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void desc(){
		System.out.println("banana");
	}
}
