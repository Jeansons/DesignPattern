package BuilderPattern;

import org.junit.Test;

public class Client3 {
	Director director = new Director();

	@Test
	public void test() {

		// 1w辆A类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
	}

	@Test
	public void test2() {
		// Director director =new Director();
		// 1000w辆B类型的奔驰车
		for (int i = 0; i < 10000000; i++) {
			director.getBBenzModel().run();
		}
	}

}
