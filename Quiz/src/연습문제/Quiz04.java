package ��������;

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
		System.out.print("����� �Է��Ͻðڽ��ϱ�?");
		many = sc.nextInt();
		Person p;
		
		Map<String, Person> person = new HashMap<>();
		sc.nextLine();
		
		for(int i = 0; i<many; i++) {
			p = new Person();
			System.out.print((i+1)+"���� ��� ��� �̸� : ");
			info = sc.nextLine();
			person.put(info, p);
			System.out.print((i+1)+"���� ��� ��� ���� : ");
			p.age = sc.nextInt();
			System.out.print((i+1)+"���� ��� ��� Ű : ");
			p.tall = sc.nextInt();
			System.out.print((i+1)+"���� ��� ��� ������ : ");
			p.weigth = sc.nextInt();
			System.out.print((i+1)+"���� ��� ��� ���� : ");
			sc.nextLine();
			p.gender = sc.nextLine();
			
		}
		
		int best=0;
		int small=0;
		
		System.out.println("[�м����]");
		
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
		
		System.out.println("���� ū ������ : "+ best);
		System.out.println("��� ������ : "+ aver);
		System.out.println("���� ���� ������ : "+ small);
		
		
		do {
				System.out.println("[�˻�]");
				System.out.print("�̸��� �Է��� �ּ���(����� ��): ");
				answer = sc.nextLine();
				if(answer.equals("����")) {
					sc.close();
					break;
					}
				System.out.println("�̸� : "+answer+", ���� : "+person.get(answer).age+", ���� : "+person.get(answer).gender+", Ű : "+person.get(answer).tall+", ������ : "+person.get(answer).weigth);	
			
		}while(answer!="����");
		
	}
}
