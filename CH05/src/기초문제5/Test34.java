package ���ʹ���5;

public class Test34 extends Salary {
	String department;
	
	public Test34( String name,int salary, String department) {
		this.department = department;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Test34 ob = new Test34("��ö����",85000000,"ö���");
		getInfomation2(ob.name, ob.salary, ob.department);
		
	}
	
	public static void getInfomation2(String name, int salary, String department) {
		System.out.println("���");
		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println();
		System.out.println("���� : " + salary);
		System.out.println();
		System.out.println("�μ� : "+ department);
		
	}
}
