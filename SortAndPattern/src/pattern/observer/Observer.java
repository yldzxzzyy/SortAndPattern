package pattern.observer;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:49:14
* describe :观察者，规定了具体观察者用来更新的方法
*/
public interface Observer {
	public void hear(String hearMessage);
}
