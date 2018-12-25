package AdapterPattern;

public class App {
	public static void main(String[] args) {
		// IUserInfo youngGirl = new UserInfo();
		IUserInfo youngGirl = new OuterUserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}

}
