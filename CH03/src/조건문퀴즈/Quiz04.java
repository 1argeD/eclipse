package 조건문퀴즈;
import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 *	표준몸무게 
		 * 	신장 -100*10 = 표준몸무게
		 * 		성별을 입력해 주세요.
		 * 		신장을 입력해주세요
		 * 		몸무게를 입력해주세요
		 * 		당신은 과체중입니다
		 * 		or 당신은 저체중입니다.
		 * 		or 완벽한 표준입니다.
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요 : ");
		String gender = in.next();
		
		System.out.print("신장을 입력하세요 : ");
		int height = in.nextInt();
		
		System.out.print("몸무게를 입력하세요 : ");
		int weight = in.nextInt();
		
		double STW;
		
		if(gender.equals("남")||gender.equals("1")) {
			
			STW = height-100;
			
			checkWeight(STW,weight);
			
		} else if(gender.equals("여")||gender.equals("2")){
			
			STW = (height-100)*0.9;
			
			checkWeight(STW,weight);
		}
		
	}
	
	public static void checkWeight(double STW, int weight) {
		if(STW>weight) {
			System.out.println("당신은 저체중입니다");
		} else if(STW < weight) {
			System.out.println("당신은 과체중입니다");
		} else {
			System.out.println("완벽한 표준입니다");
		}
	}
}
