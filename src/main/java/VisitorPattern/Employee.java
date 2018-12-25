package VisitorPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月20日 
 * @method Employee
 * @param 
 * 在一个单位里谁是员工，甭管你是部门经理还是小兵
 */
public abstract class Employee {
	public final static int MALE=0; //0代表是男性
	public final static int FEMALE=1; //1代表是女性
	//甭管是谁，都有工资
	private String name;
	//只要是员工那就有薪水
	private int salary;
	//性别很重要
	private int sex;
	//一下是简单的getter/setter，不多说
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	//打印出员工的信息
	public final void report() {
		String info ="姓名："+this.name+"\t";
		info = info +"性别："+(this.sex==FEMALE?"女":"男")+"\t";
		info = info +"薪水："+this.salary+"\t";
		//获取员工的其他信息
		info =info+this.getOtherInfo();
		System.out.println(info);
	}
	//拼装员工的其他信息
	protected abstract String getOtherInfo();
	
	

}
