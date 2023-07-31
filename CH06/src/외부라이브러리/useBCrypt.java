package 외부라이브러리;

import java.util.Scanner;

import at.favre.lib.crypto.bcrypt.BCrypt;
	

public class useBCrypt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 것은?");
		System.out.println("1.암호화 \n2.암호확인\n");
		
		if(scanner.nextInt()==1) {
			System.out.print("문장을 입력해 주세요 : ");
			String words = sc.nextLine();
			String DW = BCrypt.withDefaults().hashToString(12, words.toCharArray());
			System.out.println("암호와 문장" + DW);
			
		}else {
			
			System.out.println("평문 : ");
			String com = sc.nextLine();
			System.out.println("암호문 : ");
			String user = sc.nextLine();
			//같은 값인지 확인
			BCrypt.Result result = BCrypt.verifyer().verify(com.toCharArray(), user);
	
			if(result.verified) {
				System.out.println("똑같다");
			} else {
				System.out.println("다르다");	
			}
		}
		
		
		
		
	}
}
