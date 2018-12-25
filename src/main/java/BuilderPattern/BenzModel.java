package BuilderPattern;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日
 * @method BenzModel 奔驰模型
 */
public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰车启动了....");

	}

	@Override
	protected void stop() {
		System.out.println("奔驰车停了....");

	}

	@Override
	protected void alarm() {
		System.out.println("奔驰中的喇叭声音是这个样子的.....");

	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎是这个声音的....");

	}

}
