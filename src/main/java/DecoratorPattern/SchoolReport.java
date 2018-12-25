package DecoratorPattern;
/**
 * 
 * @user ycp 
 * @time 2018年11月2日 
 * @method SchoolReport
 * 成绩单的抽象类
 */
public abstract class SchoolReport {
	//成绩单的主要展示的就是你的成绩情况
	public abstract void report();
	//成绩单要家长签字，这个是最重要命的
	public abstract void sign (String name);
	
}