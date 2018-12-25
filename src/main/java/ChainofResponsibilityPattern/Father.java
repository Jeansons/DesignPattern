package ChainofResponsibilityPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method Father
 * 父亲
 */
public class Father implements IHandler{

	public void HandleMessage(IWomen women) {
		System.out.println("女儿的请示是"+women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
