package BuilderPattern;

import java.util.ArrayList;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日
 * @method BMWBuilder 给定一个顺序，返回一个宝马车
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);

	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
