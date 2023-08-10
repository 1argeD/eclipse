package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재시간을 알려줄게요.\n원하는 출력포맷을 입력해주세요:");
		String str = sc.nextLine();//시간 풀력포맷 형태  받기
		String w = str.equals("") ?  "MM-dd-E요일" : str; // 빈 값인지 확인
		
		SimpleDateFormat f = new SimpleDateFormat(w);
			
		Date date = new Date();//만들어진 시간이 현재시간 그러니깐 필요할 떄 생성해야 정확한 시간 값을 넣을 수 있다.
		
		System.out.println(f.format(date));
		
		sc.close();
		
	}
}
