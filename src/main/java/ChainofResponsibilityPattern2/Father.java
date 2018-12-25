package ChainofResponsibilityPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月15日 
 * @method Father
 * 父亲类
 */
public class Father extends Handler2{
	//父亲只处理女儿的请求
	public Father() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void response(IWomen women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}

}
