package CompositePattern;

import java.util.ArrayList;
/**
 * 
 * @user ycp 
 * @time 2018年11月6日 
 * @method IBranch
 * 树枝节点，也就是各个部门经理和组长的角色
 * 改成这些下边有小兵或者是经理等风云人物
 */
public interface IBranch {
//	//获得信息
//	public String getInfo();
//	//增加数据节点，例如研发部下的研发一组
//	public void add(IBranch branch);
//	//增加叶子节点
//	public void add(ILeaf leaf);
//	//获得下级信息
//	public ArrayList getSubordinateinfo();
	
	//能增加小兵和经理
	public void addSubordinate(ICorp corp);
	//还要能获得下属的信息
	public ArrayList<ICorp> getSubordinate();

}
