package 겟셋;

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
//		System.out.println(name+"입니다.");
//	}
//	
//	public void print(int num) {
//		System.out.println(num+"번 아이언입니다.");
//	}
//	
//	
//	public void print() {
//		if(name==null) {
//			System.out.println(num+"번 아이언입니다.");	
//		}else {
//			System.out.println(name+"입니다.");
//		}
//	}
	
	/////////////////////////////////////////////////////////////////////
	
	String iron ="7번 아이언입니다.";
	
	public GolfClub() {
	}
	
	public GolfClub(int num) {
		iron = num+"번 아이언입니다";
		this.iron = iron;
	}

	public GolfClub(String iron) {
		this.iron = iron+"입니다";
	}
	
	
	void print() {
		System.out.println(iron);
	}
	


}
