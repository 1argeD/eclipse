package º¹½À;

public class Quiz04 {
	public static void main(String[] args) {
//		int cnt = 1;
//		for(int i = 2; i<19; i+=2) {
//			System.out.println("2*"+cnt+"="+i);
//		}
	
		for(int i = 2; i<=9; i++) {
			System.out.println(i+"*"+1+"="+(i*1));
			for(int j = 2; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("-------------------");
		}
		
		
	}
}
