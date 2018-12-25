package StatePattern2;

public class ClosingState extends LiftState {

	//电梯门关了再打开，逗你玩呢，那这个允许呀
	@Override
	public void open() {
		super.context2.setLiftState(Context2.openningState);//置为门敞状态
		super.context2.getLiftState().open();
	}
	//电梯门关闭，这是关闭状态要实现的动作
	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}
	//电梯门关了就跑，这是再正常不过了
	@Override
	public void run() {
		super.context2.setLiftState(Context2.runningState); //设置为运行状态；
		super.context2.getLiftState().run();
	}
	
	//电梯门关着，我就不按楼层
	@Override
	public void stop() {
		super.context2.setLiftState(Context2.stoppingState); //设置为停止状态；
		super.context2.getLiftState().stop();
	}

}
