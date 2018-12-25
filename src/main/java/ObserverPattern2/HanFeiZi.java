package ObserverPattern2;

import java.util.ArrayList;
/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method HanFeiZi
 * 韩非子，李斯的弟子，
 */
public  class HanFeiZi implements Observable2 {
	//定义个边长数组，存放所有的观察者
	private ArrayList<Observer2> observersList= new ArrayList<Observer2>();
	
	public void addObserver(Observer2 observer) {
		this.observersList.add(observer);
	}

	public void deleteObserver(Observer2 observer) {
		this.observersList.remove(observer);
	}
	public void notifyObservers(String context) {
		for (Observer2 observer : observersList) {
			observer.update(context);
	
		}
	}
	//韩非子要吃饭了 
	public void haveBreakfast() {
		System.out.println("-----韩非子：开始吃饭了---------------");
		//通知所有的观察者
		this.notifyObservers("韩非子在吃饭");
	}
	//韩非子在娱乐了
	public void haveFun() {
		System.out.println("-------韩非子：开始娱乐了-------------------");
		this.notifyObservers("韩非子在娱乐");
	}

	
}
