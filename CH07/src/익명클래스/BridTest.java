package �͸�Ŭ����;

public class BridTest {
	public static void main(String[] args) {
		Bird b = new Bird() {//����� ���� �͸� Ŭ���� ���� 
			void move() {
				System.out.println("�������� ���ư���");
			}
			
			void eat() {//�ܺο��� ��� �Ұ� - �θ�Ŭ������ ��ü��.
				System.out.println("����");
			}
		};
		
		b.move();
		
	}
}
