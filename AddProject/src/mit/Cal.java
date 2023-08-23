package mit;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cal implements interCal{
	List<Num> numList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Num num = new Num();
	
	public Num input() {
		System.out.print("첫번째 숫자 입력:");
		num.a = sc.nextInt();
		System.out.print("두번째 숫자 입력:");
		num.b = sc.nextInt();
		
		numList.add(num);//db대신
		return num;
	}
	
	
	public void cal(Num num) {
		Map<Num, Integer> sumNum = new HashMap<Num, Integer>();
		int sum = 0;
		for(  ;num.a<num.b; num.a++) {
			sum+=num.a;
		}
		sumNum.put(num, sum);
		
		//sumNum값 db에 저장하기
		System.out.println("결과는 "+sum+"이다");
	}
	
	public void checkLog() {
		
	};
}
