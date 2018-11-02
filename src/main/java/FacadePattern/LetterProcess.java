package FacadePattern;
/**
 * 
 * @project DesignPattern
 * @time 2018年10月31日 
 * @method LetterProcess
 *I'm glad to share my knowledge with you all.
 * 定义一个写信的过程
 */
public interface LetterProcess {
	//首先要写信的内容
	public void writeContext(String context);
	//其次写信封
	public void fillEnvelope(String address);
	
	//把信放到信封里
	public void letterInotoEnvelope();
	//然后邮递
	public void sendLetter();

}