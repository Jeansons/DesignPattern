package StatePattern2;



/**
 * 
 * @user ycp 
 * @time 2018年11月20日 
 * @method LiftState
 * @param 
 * 定义一个电梯的接口
 */



public abstract class LiftState {
	//定义一个环境角色，也就是封装状态的变换引起的功能变化
	protected Context2 context2;
	
	public void setContext2(Context2 context2) {
		this.context2 = context2;
	}
	//首先电梯门开启动作
	public abstract void open();
	//电梯门有开启，那当然也就有关闭了
	public abstract void close();
	//电梯要能上能下，跑起来
	public abstract void run();
	//电梯还要能停下来，停不下来那就扯淡了
	public abstract void stop();
	
}
