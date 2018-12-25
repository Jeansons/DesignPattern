package CompositePattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月6日 
 * @method Leaf
 * 最小的叶子节点 ,就是小兵
 */
@SuppressWarnings("all")
public class Leaf implements ICorp {
	//叶子叫什么名字
	private String name="";
	//叶子的职位
	private String position="";
	//叶子的薪水
	private int salary=0;
	//通过构造函数传递信息
	public Leaf(String name,String position,int salary) {
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	//最小的小兵智能获得自己的信息了
	public String getInfo() {
		String info ="";
		info ="名称："+this.name;
		info = info +"\t职位："+this.position;
		info = info +"\t薪水"+this.salary;
		return info;
	}

}
