package CommandPattern;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		System.out.println("----------客户要求增加一个需求-----------");
		Group rGroup =new RequirmentGroup();
		//找到需求组
		rGroup.find();
		//增加一个需求
		rGroup.add();
		//要求变更计划
		rGroup.plan();
		Group pGroup = new PageGroup();
		//找到美工组
		pGroup.find();
		pGroup.delete();
		pGroup.plan();
	}

}
