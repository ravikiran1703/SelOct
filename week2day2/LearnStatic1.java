package week2day2;

public class LearnStatic1 {

	static int  staticNum =10;
	int insNum =10;
	public static void main(String[] args) {
		LearnStatic1 ls = new LearnStatic1();
		ls.increment();
		ls.increment();
		LearnStatic1 ls1 = new LearnStatic1();
		ls1.increment();
		ls.increment();
	}
	public void increment() {
		staticNum++;
		insNum++;
		System.out.println("static number "+staticNum+" non-static number "+insNum);
	}

}
