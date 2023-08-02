package 예외처리;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = sc.nextLine();
		
		try {
			int k = Integer.parseInt(num);
			if(k>100) {
				System.out.println(k+"은(는) 100보다 큽니다.");
			}else if(k==100) {
				System.out.println(k+"과 100은 같습니다.");
			} else {
				System.out.println(k+"은(는) 100보다 작습니다.");
			}
		} catch(Exception e) {
			System.out.println("'잘못된 입력입니다.'");
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		System.out.println("아래쪽은 이어서 수행");
	}
}
