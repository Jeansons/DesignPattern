package BridgePattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method House
 * 盖房子
 */
public class House extends Product{

	@Override
	public void beProduct() {
		System.out.println("生产出的房子是这个样子的....");
		
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的房子卖出去了....");
		
	}

}
