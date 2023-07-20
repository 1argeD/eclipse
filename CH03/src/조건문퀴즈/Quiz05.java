package 조건문퀴즈;
import java.util.Random;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Random ran = new Random();
		int random = ran.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터가 선택한 숫자를 맞춰주세요.");
		System.out.println("남은 기회 : 5번");
		System.out.print("숫자를 입력해 주세요 : ");
		int input = sc.nextInt();
		int chance = 5;
		do {
			if(checkRandomInput(random, input)==false) {
				--chance;
			} else {
				break;
			};
			if(chance==1) {
				System.out.println("마지막 기회!");
			} else if(chance==0){
				break;
			} else {
				System.out.println("남은 기회 : "+chance+"번");
			}
			System.out.print("숫자를 다시 입력해 주세요 : ");
			input = sc.nextInt();
		}
		while(random != input && chance != 0); 
		System.out.println("정답입니다.");
	}
	
	public static boolean checkRandomInput(int random, int input) {
		if(random>input) {
			System.out.println("숫자가 입력값보다 큽니다!");
			return false;
		} else if(random<input){
			System.out.println("숫자가 입력값보다 작습니다!");
			return false;
		} else {
			return true;
		}
		
	}

}
