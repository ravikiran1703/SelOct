package week2day2;

public abstract class LearnAbstract {
	
	public LearnAbstract() {
		System.out.println("constructor from abstract class");
	}
	
	public abstract void print();
	
	private String name ="TestLeaf";
	
	public String getData() {
		return name;
	}
	
	 
}





