package ObserverPattern;

/**
 * 
 * @user ycp 
 * @time 2018年11月12日 
 * @method HanFeiZi
 * 韩非子，韩国的重要人物
 */
public class HanFeiZi implements IHanFeiZi{
    //韩非子是否在吃饭，作为监控的判断标准
    private boolean isHaveBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHaveFun = false;
	//把李斯声明出来
	private ILiSi liSi =new LiSi();
    //韩非子要吃饭了
    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
//        this.isHaveBreakfast =true;
        //通知李斯
        this.liSi.update("韩非子在吃饭");
    }
 
    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
    //以下是bean的基本方法，getter/setter，不多说
    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }
 
    public void setHaveBreakfast(boolean isHaveBreakfast) {
        this.isHaveBreakfast = isHaveBreakfast;
    }
 
    public boolean isHaveFun() {
        return isHaveFun;
    }
 
    public void setHaveFun(boolean isHaveFun) {
        this.isHaveFun = isHaveFun;
    }


}
