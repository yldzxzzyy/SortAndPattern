package pattern.observer;

import java.util.ArrayList;

/**
* @author huangkz E-mail:
* @version create time：2016年8月30日 下午8:49:39
* describe :具体主题，通过notify方法通知观察者
*/
public class ConcreteSubject implements Subject{
	private String mess;
	private ArrayList<Observer> observerList;	//存放观察者引用的数组列表
	private boolean change;
	
	public ConcreteSubject() {
		mess = "";
		observerList = new ArrayList<>();
		change = false;
	}
	
	@Override
	public void addObserver(Observer o) {
		if(o != null && !observerList.contains(o)){
			observerList.add(o);
		}
	}

	@Override
	public void deleteObserver(Observer o) {
		if( o != null && observerList.contains(o)){
			observerList.remove(o);
		}
	}

	//通知所有观察者
	@Override
	public void notifyObserver() {
		if(change){
			int size = observerList.size();
			for(int i = 0; i < size; i++){
				Observer ob = observerList.get(i);
				ob.hear(mess);		
			}
		}
	}
	
	public void giveNewMess(String str){
		if(str.equals(mess)){
			change = false;
		}else{
			mess = str;
			change = true;
		}
	}

}
