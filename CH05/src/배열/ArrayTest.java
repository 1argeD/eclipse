package �迭;

public class ArrayTest {
	public static void main(String[] args) {
		//�迭(array) p177
		//�迭�� �ε����� ���� ������ ���� (�ε��� 0������ �����ϴ� ����)
		
		int num1=1,num2=2,num3 =3;
		
		//�迭�� ������
		//�ڷ���[] �ĺ��� or �ڷ��� �ĺ���[]
		
		//�迭�� ����
		//new �ڷ���[�迭 ũ��]

		int[] num = new int[3];
		int num10[] = new int[3];
		
		num[0] = 3;
		num[1] = 4;
		num[2] = 7;
		
		int[] anum = {5,6,7,8,9};//�迭 ����� ���ÿ� �ʱ�ȭ(���� ���� �ʱ�ȭ �Ұ�)
		
		int[] anum2;
		//anum2 = {1,2,3}; //���������� ���������� ����.
		 
		//�迭�� ũ�� ���� - ���̰ų� �ø� �� ����.
		
		for(int i=0; i<3; i++) {
			System.out.println(num[i]);
		}
	}
}
