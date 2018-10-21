package week2day2;

public class SubClass extends LearnAbstract {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.print();
		sc.displayData();
	}
	public static void displayData() {
		System.out.println("display data from SubClass");
	}

	//@Override
	public void print() {
		System.out.println(super.getData());
	}

}
