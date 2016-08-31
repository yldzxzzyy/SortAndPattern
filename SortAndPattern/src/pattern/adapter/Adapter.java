package pattern.adapter;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:22:21
* describe ：适配器
*/
public class Adapter implements Target{
	
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	@Override
	public void methodA() {
		System.out.println("adapter");
		System.out.println("methodA");
		adaptee.MethodB();
	}
	
}
