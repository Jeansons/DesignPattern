package ObserverPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method Observer
 * 所有观察者，通用接口
 */
public interface Observer2 {
	//一发现别人有动静，自己也要行动起来
	public void update(String context);

	
}
