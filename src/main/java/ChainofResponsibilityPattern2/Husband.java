package ChainofResponsibilityPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月15日 
 * @method Husband
 * 丈夫类
 */
public class Husband extends Handler2{
	//丈夫只处理妻子的请求
	public Husband() {
		super(2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------妻子向丈夫请示-------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意\n");
	}

}
