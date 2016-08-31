package pattern.adapter;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:44:40
* describe :实现接口
*/
public class AdapteeI implements Adaptee{

	@Override
	public void MethodB() {
		System.out.println("methodB");
	}

}
