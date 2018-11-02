package AdapterPattern;
/**
 * 用户信息对象
 * @project DesignPattern
 * @time 2018年11月1日 
 * @method IUserInfo
 *
 */
public interface IUserInfo {
	//获得用户姓名
	public String getUserName();
	//获得家庭住址
	public String getHomeAddress();
	//手机号码，这个太重要，手机泛滥
	public String getMobileNumber();
	//办公电话，一般是座机
	public String getOfficeTelNumber();
	//这个人的职位是啥
	public String getJobPosition();
	//获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作
	public String getHomeTelNumber();

}
