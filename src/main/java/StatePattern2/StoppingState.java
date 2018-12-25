package StatePattern2;

public class StoppingState extends LiftState {

	// 停止状态关门？电梯门本来就是关着的！
	@Override
	public void close() {
		// do nothing;
	}

	// 停止状态，开门，那是要的！
	@Override
	public void open() {
		super.context2.setLiftState(Context2.openningState);
		super.context2.getLiftState().open();
	}

	// 停止状态再跑起来，正常的很
	@Override
	public void run() {
		super.context2.setLiftState(Context2.runningState);
		super.context2.getLiftState().run();
	}

	// 停止状态是怎么发生的呢？当然是停止方法执行了
	@Override
	public void stop() {
		System.out.println("电梯停止了...");
	}

}
