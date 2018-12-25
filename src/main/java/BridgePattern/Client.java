package BridgePattern;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		System.out.println("----房地产公司是这个样子运行的-----");
		// //先找到我的公司
		// //HouseCorp houseCorp = new HouseCorp();
		// //看我怎么挣钱
		// houseCorp.makeMoney();
		// System.out.println("\n");
		// System.out.println("----服装公司是这样运行的-----");
		// ClothesCorp clothesCorp = new ClothesCorp();
		// clothesCorp.makeMoney();
		House house = new House();
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("\n");
		// 山寨公司生产的产品很多，不过我只要制定产品就成了
		System.out.println("-------山寨公司是这样运行的-------");
		// ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();

	}

}
