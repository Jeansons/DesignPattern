package BuilderPattern;

import java.util.ArrayList;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日
 * @method Director 导演安排顺序，生产车辆模型
 */
public class Director {
	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bwmBuilder = new BMWBuilder();

	/*
	 * A类型的奔驰车模型，先start，然后stop，其他什么引擎了，喇叭医改没有
	 */
	public BenzModel getABenzModel() {
		// 清理场景，这里一定注意.
		/**
		 * ArrayList和HashMap如果定义成类的成员变量，那你在方法中调用一定做一个clear的动作，防止数据混乱
		 */
		this.sequence.clear();
		// 这只A的执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/*
	 * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
	 */
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/*
	 * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，让后停止
	 */
	public BMWModel getCBMWModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bwmBuilder.setSequence(this.sequence);
		return (BMWModel) bwmBuilder.getCarModel();
	}

	/*
	 * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止，牛叉
	 */
	public BMWModel getDBMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.bwmBuilder.setSequence(this.sequence);
		return (BMWModel) this.bwmBuilder.getCarModel();
	}
}
