package CommandPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method AddRequirementCommand
 * 增加一项需求
 */
public class AddRequirementCommand extends Command{
    //执行增加一项需求的命令
	@Override
	public void execute() {
		super.requirmentGroup.find();
		super.requirmentGroup.add();
		super.requirmentGroup.plan();
	}

}
