package VisitorPattern2;
/**
 * 
 * @user ycp 
 * @time 2018年11月20日 
 * @method Manager
 * @param 
 * 经理级人物
 */
public class Manager extends Employee {
	//这类人物的职责非常明确：业绩
	private String performance;
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	//部门经理允许访问者访问
	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}
	
	
	

}
