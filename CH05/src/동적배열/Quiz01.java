package �����迭;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("�ܾ �Է����ּ���(����� ����, Ȯ���� Ȯ��) : ");
		String answer = sc.nextLine();
		
		int num;
		
		do{
			if(answer.equals("Ȯ��")) {
				System.out.print(list.size()+1+"��° �ܾ �Է����ּ���(����� ����, Ȯ���� Ȯ��) : ");
				answer = sc.nextLine();
				list.add(answer);
			} else if(answer.equals("����")){
				break;
			} else {
				System.out.print("�ܾ �Է����ּ���(����� ����, Ȯ���� Ȯ��) : ");
				answer = sc.nextLine();
			}
			
		} while(answer.equals("Ȯ��")||!answer.equals("����"));
		
		System.out.print("���°? : ");
		num = sc2.nextInt();
		do {
			if(num>list.size()) {
				System.out.print(list.size()+"�� ���ų� ���� ���� �Է��� �����մϴ� : ");
				num = sc2.nextInt();
			} else {
				break;
			}
		} while(num>list.size());
		System.out.println(num+"��°�� "+list.get(num-1)+"�̴�");
		System.out.println("�迭�� ��� �� (�׳� for-each������ ��������): ");
		
		for(String aa : list) {
			System.out.print(aa+" ");
		}
		System.out.println();
		System.out.println("�迭�� ��� �� (�׳� for������ ��������): ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	
	}

}
