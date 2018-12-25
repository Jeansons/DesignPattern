package ChainofResponsibilityPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月15日 
 * @method Son
 * 儿子类
 */
public class Son extends Handler2 {
	//儿子只处理母亲的请求
	public Son() {
		super(3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------母亲向儿子请示-------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}

}
