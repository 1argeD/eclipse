package �ݺ���;

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
			System.out.println("¦���� �ϳ�"+i);
			if(i%2==0) {
				continue;//���Ϲ��� ����
			}
			System.out.println("Ȧ���� �̰ͱ���"+i*i);
		}
	}

}
