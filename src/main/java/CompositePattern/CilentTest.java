package CompositePattern;

import java.util.ArrayList;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;
@SuppressWarnings("all")
public class CilentTest {

	@Test
	public void test() {
		//首先产生了一个根节点
		IRoot ceo = new Root("1", "总经理", 100000);
		//产生三个部门经理，也就是树枝节点
		IBranch developDep = new Branch("11", "研发部经理", 10000);
		IBranch salesDep =new Branch("12", "销售部经理", 20000);
		IBranch financeDep = new Branch("13", "财务部经理", 30000);
		//再把三个小组长产生出来
		IBranch firstDevGroup = new Branch("111", "开发一组", 5000);
		IBranch secondDevGroup = new Branch("112", "开发二组", 6000);
		//剩下的及时我们这些小兵了,就是路人甲，路人乙
//		ILeaf a = new Leaf("a","开发人员",2000);
//		ILeaf b = new Leaf("b","开发人员",2000);
//		ILeaf c = new Leaf("c","开发人员",2000);
//		ILeaf d = new Leaf("d","开发人员",2000);
//		ILeaf e = new Leaf("e","开发人员",2000);
//		ILeaf f = new Leaf("f","开发人员",2000);
//		ILeaf g = new Leaf("g","开发人员",2000);
//		ILeaf h = new Leaf("h","销售人员",5000);
//		ILeaf i = new Leaf("i","销售人员",4000);
//		ILeaf j = new Leaf("j","财务人员",5000);
//		ILeaf k = new Leaf("k","CEO秘书",8000);
//		ILeaf zhenglaoliu =new Leaf("正老刘", "研发部副总", 20000);
//		//改产生的人都产生出来了，然后我们怎么组装这棵树
//		//首先是定义总经理下有三个部门经理
//		ceo.add(developDep);
//		ceo.add(salesDep);
//		ceo.add(financeDep);
//		//总经理下还有一个秘书
//		ceo.add(k);
//		//定义研发部下的结构
//		developDep.add(firstDevGroup);
//		developDep.add(secondDevGroup);
//		//研发部经理下还有一个副总
//		developDep.add(zhenglaoliu);
//		//看看开发两个小组下有什么
//		firstDevGroup.add(a);
//		firstDevGroup.add(b);
//		firstDevGroup.add(c);
//		secondDevGroup.add(d);
//		secondDevGroup.add(e);
//		secondDevGroup.add(f);
//		//再看销售部下的人员情况
//		salesDep.add(h);
//		salesDep.add(i);
//		//最后一个财务
//		financeDep.add(j);
		//树状结构写完毕，然后我们打印出来
		System.out.println(ceo.getInfo());
		//打印出来整个树形
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}

	private void getAllSubordinateInfo(ArrayList subordinateList) {
		int length =subordinateList.size();
		for(int m =0 ;m<length;m++) { //定义一个arraryList长度，不要在for循环中每次计算
			Object sObject =subordinateList.get(m);
			if(sObject instanceof Leaf) { //是个叶子节点，也就是员工
				ILeaf employee =(ILeaf) sObject;
				System.out.println(employee.getInfo());
				
			}else {
//				IBranch branch = (IBranch) sObject;
//				System.out.println(branch.getInfo());
//				//再递归调用
//				getAllSubordinateInfo(branch.getSubordinateinfo());
			}
					
			
		}
	}

}
