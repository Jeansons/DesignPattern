package ChainofResponsibilityPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method IWomen
 * 古代悲哀女性的总称
 */
public interface IWomen {
	//获得个人状况
	public int getType();
	//获得个人请示，你要干什么？出去逛街？约会？还是看电影
	public String getRequest();
	
}
