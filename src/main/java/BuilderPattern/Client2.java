package BuilderPattern;

/**
 * 
 * @project DesignPattern
 * @time 2018年11月2日
 * @method Client2 这里是牛叉公司的天下，他要啥我们给啥
 */
public class Client2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Director director = new Director();
		// 1w辆A类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
		long end = System.currentTimeMillis();
		System.out.println("运行时间：" + (end - start) + "ms");
	}

}
