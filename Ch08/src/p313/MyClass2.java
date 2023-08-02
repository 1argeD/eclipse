package p313;

public class MyClass2 {
	String name;
	int age;
	
	MyClass2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("'"+name+"은"+age+"살이다"+"'");
	}
	
	public String toString() {
		return "이름은"+name+" 나이는"+age+"";
	}
		
	
	

}
