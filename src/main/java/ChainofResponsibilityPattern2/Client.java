package ChainofResponsibilityPattern2;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("all")
public class Client {

	public static void main(String[] args) {
		//随机挑选几个女性
		Random random =new Random();
		ArrayList<IWomen> arrayList=new ArrayList();
		for(int i=0; i<5;i++) {
			arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
			
		}
		//定义三个请示对象
		Handler2 father = new Father();
		Handler2 husband = new Husband();
		Handler2 son = new Son();
		
		//设置请示顺序
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women:arrayList){
			father.HandleMessage(women);
			}
	}

}
