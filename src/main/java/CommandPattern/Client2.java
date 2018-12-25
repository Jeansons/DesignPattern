package CommandPattern;

import org.junit.Test;

public class Client2 {

	@Test
	public void test() {
		//定义我们的接头人
		Invoker xiaosan = new Invoker();
		//客户要求增加一项需求
		System.out.println("-----增加需求---------");
		//客户给我们下命令来
		//Command command = new AddRequirementCommand();
		Command command =new DeletePageCommand();
		///command.pageGroup.add();
		//接头人接受命令
		xiaosan.setCommand(command);
		//接头执行命令
		xiaosan.actiong();
		command.pageGroup.add();
	}

}
