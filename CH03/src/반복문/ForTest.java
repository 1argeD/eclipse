package �ݺ���;

public class ForTest {
	public static void main(String[] args) {
		int num=0;
		
		while(num++<10) {
			System.out.print(num+", ");
		}
		
		System.out.println("while���� �̿�");
		//////////////////////////////////////////////////////////////////
		
		num=0;
		
		do {
			num++;
			System.out.print(num+", ");
			}while(num<10);
		
		System.out.println("do-while���� �̿�");
		/////////////////////////////////////////////////////////////////
		
		for(num = 1; num<11; num++) System.out.print(num+", ");
		
		System.out.println("for���� �̿�");
	}
}
