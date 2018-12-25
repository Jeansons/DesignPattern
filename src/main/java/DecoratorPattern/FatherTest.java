package DecoratorPattern;

import org.junit.Test;

public class FatherTest {

	@Test
	public void test() {
		//成绩单拿过来
	//	SchoolReport sReport = new FouthGradeSchoolReport();
		SchoolReport sReport =new SugarFouthGradeSchoolReport();
		//看成绩单
		sReport.report();
		//然后老爸，一看，很开心，就签名了
		sReport.sign("张三");
		//签名？休想！
	}

}
