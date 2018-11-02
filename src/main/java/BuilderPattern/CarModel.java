package BuilderPattern;

import java.util.ArrayList;

/**
 * 定义一个车辆模型的抽象类，所有的车辆模型都继承这里类
 * @project DesignPattern
 * @time 2018年11月2日 
 * @method CarModel
 *
 */
public abstract class CarModel {

	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	/*
	 * 模型是启动开始跑了
	 */
	protected abstract void start();
	//停止
	protected abstract void stop();
	//喇叭哗哗叫
	protected abstract void alarm();
	//引擎轰隆隆的响
	protected abstract void engineBoom();
	//跑
	final public void run() {
		//循环一遍，谁在前，就先执行谁
		for(int i = 0;i<this.sequence.size();i++) {
			String actionName =this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")) {//如果是start关键字，
				this.start();//开启汽车
			
			}else if(actionName.equalsIgnoreCase("stop")) {
				this.stop();//停止汽车
			}else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();//喇叭开始叫了
			}else if(actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();//引擎开始轰鸣
			}
		}
	}
	//把传递过来的值传递到类内
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence=sequence;
	}
	
}




















































