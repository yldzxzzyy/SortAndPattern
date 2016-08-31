package pattern.observer;
/**
* @author huangkz E-mail:
* @version create time：2016年8月31日 上午9:32:38
* describe :
*/
public class ConcreteObserver2 implements Observer{	
	private String name;
	
	public ConcreteObserver2(String name) {
		this.name = name;
	}
	
	@Override
	public void hear(String hearMessage) {
		System.out.println(name+" ConcreteObserver2 receive " + hearMessage);
	}
}
