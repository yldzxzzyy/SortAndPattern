package pattern.observer;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:49:58
* describe : 具体观察者
*/
public class ConcreteObserver1 implements Observer{
	private String name;
	
	public ConcreteObserver1(String name) {
		this.name = name;
	}
	
	@Override
	public void hear(String hearMessage){
		System.out.println(name+" ConcreteObserver1 receive " + hearMessage);
	}
	
}
