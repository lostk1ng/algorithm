package algorithm.designpattern;

public class Singleton {
	private static Singleton instance = new Singleton();
	private String name = "president";
	
	private Singleton() {}
	public static Singleton getInstance() {
		return instance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
