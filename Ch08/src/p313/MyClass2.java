package p313;

public class MyClass2 {
	String name;
	int age;
	
	MyClass2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("'"+name+"��"+age+"���̴�"+"'");
	}
	
	public String toString() {
		return "�̸���"+name+" ���̴�"+age+"";
	}
		
	
	

}
