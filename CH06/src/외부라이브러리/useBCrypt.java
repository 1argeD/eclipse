package �ܺζ��̺귯��;

import java.util.Scanner;

import at.favre.lib.crypto.bcrypt.BCrypt;
	

public class useBCrypt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ����?");
		System.out.println("1.��ȣȭ \n2.��ȣȮ��\n");
		
		if(scanner.nextInt()==1) {
			System.out.print("������ �Է��� �ּ��� : ");
			String words = sc.nextLine();
			String DW = BCrypt.withDefaults().hashToString(12, words.toCharArray());
			System.out.println("��ȣ�� ����" + DW);
			
		}else {
			
			System.out.println("�� : ");
			String com = sc.nextLine();
			System.out.println("��ȣ�� : ");
			String user = sc.nextLine();
			//���� ������ Ȯ��
			BCrypt.Result result = BCrypt.verifyer().verify(com.toCharArray(), user);
	
			if(result.verified) {
				System.out.println("�Ȱ���");
			} else {
				System.out.println("�ٸ���");	
			}
		}
		
		
		
		
	}
}
