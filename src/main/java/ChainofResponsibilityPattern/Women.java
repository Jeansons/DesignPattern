package ChainofResponsibilityPattern;

public class Women implements IWomen {
	/*
	 * 通过一个int类型的参数来描述妇女的个人状况
	 * 1---未出嫁
	 * 2---出嫁
	 * 3---夫死
	 */
	private int type=0;
	//妇女的请示
	private String request ="";
	
	public Women() {
		super();
		// TODO Auto-generated constructor stub
	}
	//构造函数传递过来请求
	public Women(int _type, String _request) {
		super();
		this.type = _type;
		this.request = _request;
	}
	//获得自己状况
	public int getType() {
		return this.type;
	}

	public String getRequest() {

		return this.request;
	}

}
