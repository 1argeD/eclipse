package 기초문제5;

public class Test34 extends Salary {
	String department;
	
	public Test34( String name,int salary, String department) {
		this.department = department;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Test34 ob = new Test34("야철대장",85000000,"철기방");
		getInfomation2(ob.name, ob.salary, ob.department);
		
	}
	
	public static void getInfomation2(String name, int salary, String department) {
		System.out.println("출력");
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println();
		System.out.println("연봉 : " + salary);
		System.out.println();
		System.out.println("부서 : "+ department);
		
	}
}
