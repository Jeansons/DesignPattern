package ObserverPattern;

import org.junit.Test;

public class Client {
	@Test
	public void test() throws InterruptedException {
		//定义出韩非子和李斯
		LiSi liSi= new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//观察早餐
		Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
		//开始启动线程，监控
		watchBreakfast.start();
		//观察娱乐情况
		Watch WatchFun =new Watch(hanFeiZi, liSi, "fun");
		WatchFun.start();
		//然后我们看看韩非子在干什么
		Thread.sleep(1000);//主线程等待1秒后再往下执行
		hanFeiZi.haveBreakfast();
		//韩非子娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}

}
