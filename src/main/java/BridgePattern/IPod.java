package BridgePattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method IPod
 *生产iPod
 */
public class IPod extends Product {

	@Override
	public void beProduct() {
		System.out.println("生产出的iPod是这个样子的...");
		
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的iPod卖出去了...");
		
	}

}
