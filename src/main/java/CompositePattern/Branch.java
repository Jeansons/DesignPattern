package CompositePattern;

import java.util.ArrayList;

/**
 * 
 * @user ycp
 * @time 2018年11月6日
 * @method Branch 所有的树枝节点
 */
@SuppressWarnings("all")
public class Branch implements IBranch ,ICorp{
	// 存储子节点的信息
	//private ArrayList subordinateList = new ArrayList();

	// 树枝节点的名称
	private String name = "";
	// 树枝节点的职位
	private String position = "";
	// 树枝节点的薪水
	private int salary = 0;
	//领导下边的下级领导和小兵
	ArrayList<ICorp> subordinateList =new ArrayList<ICorp>();
	// 通过构造函数传递树枝节点的参数
	//传递领导的信息
	
	public Branch(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	// 获得自己树枝节点的信息 领导信息
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位" + this.position;
		info = info + "\t薪水" + this.salary;

		return info;
	}

//	// 增加一个树枝节点
//	public void add(IBranch branch) {
//		this.subordinateList.add(branch);
//	}
//	// 增加一个叶子节点
//	public void add(ILeaf leaf) {
//		this.subordinateList.add(leaf);
//
//	}

//	public ArrayList getSubordinateinfo() {
//
//		return this.subordinateList;
//	}
	//增加一个下属，可能是小头目，也可能是个小兵
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}
	//我有哪些下属
	public ArrayList<ICorp> getSubordinate() {	
		return this.subordinateList;
	}

}
