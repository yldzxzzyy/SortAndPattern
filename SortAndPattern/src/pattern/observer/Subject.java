package pattern.observer;
/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:48:49
* describe :主题，规定具体主题需要实现的方法
*/
public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObserver();
}
