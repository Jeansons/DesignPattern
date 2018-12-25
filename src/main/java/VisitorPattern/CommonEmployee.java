package VisitorPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月20日 
 * @method CommonEmployee
 * @param 
 * 普通员工，也就是最小的小兵
 */
public class CommonEmployee extends Employee {
	//工作内容，这个非常重要，以后的职业规划就是靠这个了
	private String job;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	protected String getOtherInfo() {
		
		
		return "工作:"+this.job+"\t";
	}
	

}
