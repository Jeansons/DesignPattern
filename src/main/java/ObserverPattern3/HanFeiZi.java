package ObserverPattern3;

import java.util.Observable;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class HanFeiZi extends Observable{
	//韩非子要吃饭了
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了..");
		//通知所有有的观察者
		super.setChanged();
		super.notifyObservers("韩非子在吃饭");
	}
	//韩非子要娱乐了
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了...");
		super.setChanged();
		this.notifyObservers("韩非子在娱乐");
		
	}

}
