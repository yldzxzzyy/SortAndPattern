package pattern;

import pattern.adapter.Adaptee;
import pattern.adapter.AdapteeI;
import pattern.adapter.Adapter;
import pattern.adapter.Target;
import pattern.observer.ConcreteObserver1;
import pattern.observer.ConcreteObserver2;
import pattern.observer.ConcreteSubject;
import pattern.register.Fruit;
import pattern.register.FruitFactory;
import pattern.register.Register;

/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:30:51
* describe :测试
*/
public class TestApp {
	public static void main(String[] args){
		TestApp app = new TestApp();
		System.out.println("-------------适配器模式----------------");
		app.testAdapter();
		System.out.println("-------------观察者模式----------------");
		app.testObserver();
		System.out.println("-------------注册树模式----------------");
		app.testRegister();
	}
	
	//适配器模式
	public void testAdapter(){
		Target target; 
		Adaptee adaptee = new AdapteeI();
		Adapter adapter= new Adapter(adaptee);
		target = adapter;
		target.methodA();
	}
	//观察者模式
	public void testObserver(){
		ConcreteSubject sub = new ConcreteSubject();
		ConcreteObserver1 o1 = new ConcreteObserver1("A");
		ConcreteObserver2 o2 = new ConcreteObserver2("A");
		sub.addObserver(o1);
		sub.addObserver(o2);
		sub.giveNewMess("hello"); //通知信息
		sub.notifyObserver();	// 发送信息
	}
	//注册树模式
	public void testRegister(){
		FruitFactory.getFruit("Apple");				//创建对象
		FruitFactory.getFruit("Banana");
		Fruit apple = Register.get("Apple");		//获取对象
		Fruit banana = Register.get("Banana"); 
		Fruit banana2 = Register.get("Banana");
		apple.desc();
		banana.desc();		
		banana2.desc();
	}
	
}
