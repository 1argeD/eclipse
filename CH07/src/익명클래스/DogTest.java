package �͸�Ŭ����;

public class DogTest {
	public static void main(String[] args) {
		Dog poodle = new Dog() {//�������̽��� ���� �͸�Ŭ���� ����
			@Override
			public void move() {
				System.out.println("Ǫ���� �ɾ��");
			}
		};
	}
}
