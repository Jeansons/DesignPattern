package BridgePattern;

/**
 * 
 * @user ycp
 * @time 2018年11月2日
 * @method IPodCorp 我是山寨老大，你流行啥我就生产啥 现在 流行iPod
 */
public class IPodCorp extends Corp {

	public IPodCorp(Product product) {
		super(product);
		// TODO Auto-generated constructor stub
	}

	// //我开始生产iPod了
	// @Override
	// protected void produce() {
	// System.out.println("我生产iPod");
	// }
	// //山寨的iPod很畅销，便宜呀
	// @Override
	// protected void sell() {
	// System.out.println("iPod畅销");
	//
	// }
	// 狂赚钱
	public void makeMoney() {
		super.makeMoney();
		System.out.println("我赚钱呀....");

	}

}
