public class Main {

	public static void main(String[] args) {
		Singleton.getInstance();
	}

}

class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("I am getting accessed");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}