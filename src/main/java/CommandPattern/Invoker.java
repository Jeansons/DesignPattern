package CommandPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method Invoker
 * 接头人的职责就是接受命令，并执行
 */
public class Invoker {
	//什么命令
	private Command command;
	//客户发出命令
	public void setCommand(Command command) {
		this.command =command;
	}
	//执行客户的命令
	public void actiong() {
		this.command.execute();
	}

}
