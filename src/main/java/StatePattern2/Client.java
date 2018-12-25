package StatePattern2;

public class Client {

	public static void main(String[] args) {
		Context2 context2= new Context2();
		context2.setLiftState(new ClosingState());
		context2.open();
		context2.close();
		context2.run();
		context2.stop();
	}

}
