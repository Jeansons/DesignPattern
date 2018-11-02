package TemplateMethodPattern;

/**
 * 车模型 抽象类
 * 
 * @project DesignPattern
 * @time 2018年11月1日
 * @method HummerModel
 *
 */
public abstract class HummerModel {
	private boolean alarmFlag = true; //是否要响喇叭  
	
	// 发动起来

	protected abstract void start();

	// 停下来
	protected abstract void stop();

	// 喇叭
	protected abstract void alarm();

	// 响
	protected abstract void engineBoom();

	// 跑
	// 那模型应该会跑吧，别管是人退的，还是电力驱动，总之要会跑
	final public void run() {
		// 先发动汽车
		this.start();
		// 引擎开始轰鸣
		this.engineBoom();
		// 然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
		if(this.isAlarm()) {
		this.alarm();
		}
		// 到达目的地就停车
		this.stop();
	}

//	protected boolean isAlarm() {
//		
//		return true;
//	}
	// 默认没有喇叭的
		protected boolean isAlarm() {
			return this.alarmFlag;
		}
		//要不要响喇叭，是有客户的来决定的
		public void setAlarm(boolean isAlarm) {
			this.alarmFlag=isAlarm;
		}

}
