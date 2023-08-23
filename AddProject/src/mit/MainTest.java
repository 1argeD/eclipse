package mit;

public class MainTest {

	public static void main(String[] args) {
		/*사용자로 부터 두 개의 수를 입력받아서
		  첫수와 끝수가 포함되는 사이의 수를 모두 더해서 출력하는 프로그램
		  단, 사용자가 입력했던 모든 수를 DB 저장해서 확인해 볼 수 있는 프로그램
		 */
		Cal cal = new Cal();
		Num num = new Num();
		int answer=0;
		do {
			System.out.print("선택하세요(1,2):");
			num = cal.input();
			
			
			
		
		}while(answer!=1||answer!=2);

	}

}
