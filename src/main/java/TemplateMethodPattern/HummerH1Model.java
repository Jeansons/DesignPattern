package TemplateMethodPattern;

public class HummerH1Model extends HummerModel {
	//private boolean alarmFlag = true; //是否要响喇叭
	@Override
	public void start() {
		System.out.println("悍马H1发动");

	}

	@Override
	public void stop() {
		System.out.println("悍马H1停止");

	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛");

	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");

	}

	

}
