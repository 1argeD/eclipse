package �ټ�;

public class GolfClub {
//	static int num=7;
//	static String name;
//	
//	public GolfClub(int num) {
//		this.num = num;
//	}
//	
//	public GolfClub() {
//	}
//	
//	public GolfClub(String name) {
//		GolfClub.name = name;
//	}
//
//	public void print(String name) {
//		System.out.println(name+"�Դϴ�.");
//	}
//	
//	public void print(int num) {
//		System.out.println(num+"�� ���̾��Դϴ�.");
//	}
//	
//	
//	public void print() {
//		if(name==null) {
//			System.out.println(num+"�� ���̾��Դϴ�.");	
//		}else {
//			System.out.println(name+"�Դϴ�.");
//		}
//	}
	
	/////////////////////////////////////////////////////////////////////
	
	String iron ="7�� ���̾��Դϴ�.";
	
	public GolfClub() {
	}
	
	public GolfClub(int num) {
		iron = num+"�� ���̾��Դϴ�";
		this.iron = iron;
	}

	public GolfClub(String iron) {
		this.iron = iron+"�Դϴ�";
	}
	
	
	void print() {
		System.out.println(iron);
	}
	


}
