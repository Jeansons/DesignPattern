package CommandPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method Group
 * 项目组分成了三个组，每个组还是要接受增删改查的命令
 */
public abstract class Group {
	//甲乙双方分开办公，要和哪个组讨论，你首先要找到这个组
	public abstract void find();
	//增加功能
	public abstract void add();
	//删除功能
	public abstract void delete ();
	//修改功能
	public abstract void change();
	//被要求给出所有的变更计划
	public abstract void plan();

}
