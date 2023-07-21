package 상속;

public class Parents {
	String name;
	
	Parents(String name) {
		this.name = name;
	}
	
	Parents() {
		
	}
	
	void who() {
		System.out.println("나의 이름은 " +name);
	}
}
