package CommandPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method DeletePageCommand
 * 删除一个页面的命令
 */
public class DeletePageCommand  extends Command{
	//执行删除一个页面的命令
	@Override
	public void execute() {
		//找到页面组
		super.pageGroup.find();
		super.pageGroup.delete();
		super.pageGroup.plan();
	}

}
