package 반복문;

public class BreakCountinueTest {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==3) {
				break;
			}
		}
		System.out.println("----------------------------");
		for(int i=0; i<10; i++) {
			System.out.println("짝수만 하나"+i);
			if(i%2==0) {
				continue;//이하문장 무시
			}
			System.out.println("홀수면 이것까지"+i*i);
		}
	}

}
