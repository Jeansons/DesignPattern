package BridgePattern;

/**
 * 
 * @user ycp
 * @time 2018年11月2日
 * @method HouseCorp
 *
 */
public class HouseCorp extends Corp {

	public HouseCorp(House house) {
		super(house);

	}

	// @Override
	// protected void produce() {
	// System.out.println("房地产公司盖房子...");
	//
	// }
	//
	// @Override
	// protected void sell() {
	// System.out.println("房地产公司出售房子...");
	//
	// }
	// 房地产公司很high了，赚钱，计算利润
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
