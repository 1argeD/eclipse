package 동적배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("단어를 입력해주세요(종료는 종료, 확인은 확인) : ");
		String answer = sc.nextLine();
		
		int num;
		
		do{
			if(answer.equals("확인")) {
				System.out.print(list.size()+1+"번째 단어를 입력해주세요(종료는 종료, 확인은 확인) : ");
				answer = sc.nextLine();
				list.add(answer);
			} else if(answer.equals("종료")){
				break;
			} else {
				System.out.print("단어를 입력해주세요(종료는 종료, 확인은 확인) : ");
				answer = sc.nextLine();
			}
			
		} while(answer.equals("확인")||!answer.equals("종료"));
		
		System.out.print("몇번째? : ");
		num = sc2.nextInt();
		do {
			if(num>list.size()) {
				System.out.print(list.size()+"와 같거나 작은 값만 입력이 가능합니다 : ");
				num = sc2.nextInt();
			} else {
				break;
			}
		} while(num>list.size());
		System.out.println(num+"번째는 "+list.get(num-1)+"이다");
		System.out.println("배열의 모든 값 (그냥 for-each문으로 가져오기): ");
		
		for(String aa : list) {
			System.out.print(aa+" ");
		}
		System.out.println();
		System.out.println("배열의 모든 값 (그냥 for문으로 가져오기): ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	
	}

}
