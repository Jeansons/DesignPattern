package AdapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 外系统的用户信息的实现类
 * 
 * @project DesignPattern
 * @time 2018年11月1日
 * @method OuterUser
 *
 */
@SuppressWarnings("all")
public class OuterUser implements IOuterUser {
	/*
	 * 用户基本信息
	 * 
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "这个员工叫混世魔王....");
		baseInfoMap.put("mobileNumber", "这个员工电话是....");
		return baseInfoMap;
	}

	/*
	 * 员工的家庭信息
	 * 
	 */
	public Map getUserOfficeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumber", "员工的家庭电话是....");
		homeInfo.put("homeaddress", "员工的家庭地址是....");
		return homeInfo;
	}

	/*
	 * 员工的工作信息，比如职位等
	 */
	public Map getUserHomeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "这个人的职位是BOSS....");
		officeInfo.put("officeTelNumber", "员工的办公电话是....");
		return officeInfo;
	}

}
