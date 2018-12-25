package StatePattern2;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

/**
 * 
 * @user ycp 
 * @time 2018年11月20日 
 * @method OpenningState
 * @param 
 * 在电梯门开启的状态下能做什么事情
 */
public class OpenningState extends LiftState{
	//开启当然可以关闭了，我就想测试一下电梯门开关功能
	@Override
	public void open() {
		System.out.println("电梯门开启...");
	}

	@Override
	public void close() {
		//状态修改
		super.context2.setLiftState(Context2.closingState);
		//动作委托为CloseState来执行
		super.context2.getLiftState().close();
	}
	//门开着电梯就想跑，这电梯，吓死你！
	@Override
	public void run() {
	}
	//开门还不停止？
	@Override
	public void stop() {
	}

}
