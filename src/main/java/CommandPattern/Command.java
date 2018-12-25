package CommandPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method Command
 * 命令的抽象类，我们把客户发出的命令定义成一个一个的对象
 */
public abstract class Command {
	//把三个组都定义好，子类可以直接使用
	protected RequirmentGroup requirmentGroup =new RequirmentGroup(); //需求组
    protected PageGroup pageGroup =new PageGroup(); //美工组
    protected CodeGroup codeGroup =new CodeGroup(); //代码组
    
    //只要一个方法，你要我做什么事情
    public abstract void execute();
    
	

}
