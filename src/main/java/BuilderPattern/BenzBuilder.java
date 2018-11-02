package BuilderPattern;

import java.util.ArrayList;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日 
 * @method BenzBuilder
 * 各种设施都给了，我们按照一定的顺序制造一个奔驰车
 */
public class BenzBuilder extends CarBuilder {
	private BenzModel benz =new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
		
	}

	@Override
	public CarModel getCarModel() {
		
		return this.benz;
	}
	

}
