package ObserverPattern3;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {

	public void update(Observable observable, Object obj) {
		System.out.println("李斯：观察到李斯活动，开始向老板汇报了");
		this.reportToShiHuang(obj.toString());
		System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
		
	}

	private void reportToShiHuang(String reportContext) {
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
	}

}
