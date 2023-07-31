package 배열;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 숫자를 출력할 것인가? : ");
		int cnt = sc.nextInt();
		
		int[] input = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"번째 숫자 입력 : ");
			input[i] = sc.nextInt();
		}
		
		System.out.println("몇 번쨰 입력한 숫자를 출력할까요?");
		int output = sc.nextInt();
		
		if(output==0) {
			System.out.println("숫자 0과 음수, 혹 텍스트는 입력할 수 없습니다.");
		}else if(output>cnt){
			System.out.println("입력하신 숫자 "+output+"은(는) 입력하신 숫자 "+cnt+"보다 많습니다.");
		}else if(output<=cnt) {
			System.out.println(output + "번째 입력한 숫자는 "+input[output-1]+"입니다.");
		}else {
			System.out.println("숫자 0과 음수, 혹 텍스트는 입력할 수 없습니다.");
		}
	}
}
