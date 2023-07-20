package 반복문;

public class ForTest {
	public static void main(String[] args) {
		int num=0;
		
		while(num++<10) {
			System.out.print(num+", ");
		}
		
		System.out.println("while문을 이용");
		//////////////////////////////////////////////////////////////////
		
		num=0;
		
		do {
			num++;
			System.out.print(num+", ");
			}while(num<10);
		
		System.out.println("do-while문을 이용");
		/////////////////////////////////////////////////////////////////
		
		for(num = 1; num<11; num++) System.out.print(num+", ");
		
		System.out.println("for문을 이용");
	}
}
