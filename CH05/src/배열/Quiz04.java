package �迭;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ���ڸ� ����� ���ΰ�? : ");
		int cnt = sc.nextInt();
		
		int[] input = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"��° ���� �Է� : ");
			input[i] = sc.nextInt();
		}
		
		System.out.println("�� ���� �Է��� ���ڸ� ����ұ��?");
		int output = sc.nextInt();
		
		if(output==0) {
			System.out.println("���� 0�� ����, Ȥ �ؽ�Ʈ�� �Է��� �� �����ϴ�.");
		}else if(output>cnt){
			System.out.println("�Է��Ͻ� ���� "+output+"��(��) �Է��Ͻ� ���� "+cnt+"���� �����ϴ�.");
		}else if(output<=cnt) {
			System.out.println(output + "��° �Է��� ���ڴ� "+input[output-1]+"�Դϴ�.");
		}else {
			System.out.println("���� 0�� ����, Ȥ �ؽ�Ʈ�� �Է��� �� �����ϴ�.");
		}
	}
}
