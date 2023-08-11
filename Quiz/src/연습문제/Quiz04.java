package 연습문제;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz04 {
	public static void main(String[] args) {
		int many;
		String info;
		String answer="";
		int a=0;
		int b;
		int c=100000;

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명을 입력하시겠습니까?");
		many = sc.nextInt();
		Person p;
		
		Map<String, Person> person = new HashMap<>();
		sc.nextLine();
		
		for(int i = 0; i<many; i++) {
			p = new Person();
			System.out.print((i+1)+"번쨰 사람 사람 이름 : ");
			info = sc.nextLine();
			person.put(info, p);
			System.out.print((i+1)+"번쨰 사람 사람 나이 : ");
			p.age = sc.nextInt();
			System.out.print((i+1)+"번쨰 사람 사람 키 : ");
			p.tall = sc.nextInt();
			System.out.print((i+1)+"번쨰 사람 사람 몸무게 : ");
			p.weigth = sc.nextInt();
			System.out.print((i+1)+"번쨰 사람 사람 성별 : ");
			sc.nextLine();
			p.gender = sc.nextLine();
			
		}
		
		int best=0;
		int small=0;
		
		System.out.println("[분석결과]");
		
		Set<String> keySet = person.keySet();
		for(String w : keySet){
			b=person.get(w).weigth;
			a = Math.max(a, b);
			c= Math.min(c, b);
			small = c;
			best = a; 
		}
		
		
		int sum = 0;
		for(String w : keySet) {
			sum += person.get(w).weigth;
		}
		
		int aver = sum/person.size();
		
		System.out.println("가장 큰 몸무게 : "+ best);
		System.out.println("평균 몸무게 : "+ aver);
		System.out.println("가장 작은 몸무게 : "+ small);
		
		
		do {
				System.out.println("[검색]");
				System.out.print("이름을 입력해 주세요(종료는 끝): ");
				answer = sc.nextLine();
				if(answer.equals("종료")) {
					sc.close();
					break;
					}
				System.out.println("이름 : "+answer+", 나이 : "+person.get(answer).age+", 성별 : "+person.get(answer).gender+", 키 : "+person.get(answer).tall+", 몸무게 : "+person.get(answer).weigth);	
			
		}while(answer!="종료");
		
	}
}
