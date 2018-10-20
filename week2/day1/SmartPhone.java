package week2.day1;

public class SmartPhone extends MobilePhone 
                      implements TAB{

	public int version =10;
	public void netWork4G() {
		System.out.println("connect netWork4G");
	}
	public void capturePix() {
		System.out.println("capture Pix");
	}
	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("make call bluetooht");
	}
	@Override
	public void fingerPrint() {
		//i=20;
		System.out.println(i);
	}
	public void printVersion() {
		System.out.println(version+" super "+super.version);
	}
	
	@Override
	public void playMusic() { 
		System.out.println("play music");
	}
	
}

