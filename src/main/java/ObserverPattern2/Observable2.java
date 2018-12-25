package ObserverPattern2;

/**
 * 
 * @user ycp 
 * @time 2018年11月14日 
 * @method Observable
 * 所有被观察者，通用接口
 */
public interface Observable2 {
	//增加一个观察者
	public void addObserver (Observer2 observer);
	//删除一个观察者，--我不想让你看了
	public void deleteObserver (Observer2 observer);
	//既然要观察，我发生改变了他也应该用所动作--通知观察者
	public void notifyObservers(String context);

}
