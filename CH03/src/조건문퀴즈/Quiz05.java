package ���ǹ�����;
import java.util.Random;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Random ran = new Random();
		int random = ran.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ǻ�Ͱ� ������ ���ڸ� �����ּ���.");
		System.out.println("���� ��ȸ : 5��");
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int input = sc.nextInt();
		int chance = 5;
		do {
			if(checkRandomInput(random, input)==false) {
				--chance;
			} else {
				break;
			};
			if(chance==1) {
				System.out.println("������ ��ȸ!");
			} else if(chance==0){
				break;
			} else {
				System.out.println("���� ��ȸ : "+chance+"��");
			}
			System.out.print("���ڸ� �ٽ� �Է��� �ּ��� : ");
			input = sc.nextInt();
		}
		while(random != input && chance != 0); 
		System.out.println("�����Դϴ�.");
	}
	
	public static boolean checkRandomInput(int random, int input) {
		if(random>input) {
			System.out.println("���ڰ� �Է°����� Ů�ϴ�!");
			return false;
		} else if(random<input){
			System.out.println("���ڰ� �Է°����� �۽��ϴ�!");
			return false;
		} else {
			return true;
		}
		
	}

}
