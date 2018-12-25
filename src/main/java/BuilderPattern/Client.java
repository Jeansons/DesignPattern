package BuilderPattern;

import java.util.ArrayList;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日
 * @method Client 最终客户开始使用这个模型
 */
public class Client {
	public static void main(String[] args) {
		/*
		 * 
		 */
		// BenzModel benz = new BenzModel();
		ArrayList<String> sequence = new ArrayList<String>(); // 存放run的顺序
		sequence.add("engine boom");// 客户要求run的时候先发动引擎
		sequence.add("start");
		sequence.add("stop");
		// 要一个奔驰车：
		BenzBuilder benzBuilder = new BenzBuilder();

		// 把顺序给这个builder类，制造出这样的一个车出来；
		benzBuilder.setSequence(sequence);
		// 制造出一个奔驰车
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		benz.run();
		// 按照同样的顺序，我再要一个宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
		bmw.run();

	}

}
