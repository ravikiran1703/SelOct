package week2.day1;

public class LearnThisKeyword {

	public LearnThisKeyword() {
		this(5);
		System.out.println("constructer called");
	}
	public LearnThisKeyword(int i) {
		System.out.println("1 args constructer called");
	}
	int num =10;
	public static void main(String[] args) {
		LearnThisKeyword key = new LearnThisKeyword();
		key.printNumber();
		//System.out.println(key.num);
	}
	public void printNumber() {
		int num =5;
		System.out.println(this.num);
	}
}





