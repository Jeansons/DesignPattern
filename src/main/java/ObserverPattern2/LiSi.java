package ObserverPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method LiSi
 * 李斯 观察者
 */
public class LiSi implements Observer2 {
	//韩非子一旦行动他就只知道，他就要向老板汇报
	public void update(String str) {
		System.out.println("李斯：观察到韩非子活动，开始向老板汇报了");
		this.reportToQiShiHuang(str);
		System.out.println("李斯：汇报完毕，秦老板赏给他两个罗卜吃吃\n");
	}
	//汇报给秦始皇
	private void reportToQiShiHuang(String reportContext) {
		System.out.println("李斯：报告，秦老板！韩非子有活动了-->"+reportContext);
	}
	

}
