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
		System.out.print("ù��° ���� �Է�:");
		num.a = sc.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		num.b = sc.nextInt();
		
		numList.add(num);//db���
		return num;
	}
	
	
	public void cal(Num num) {
		Map<Num, Integer> sumNum = new HashMap<Num, Integer>();
		int sum = 0;
		for(  ;num.a<num.b; num.a++) {
			sum+=num.a;
		}
		sumNum.put(num, sum);
		
		//sumNum�� db�� �����ϱ�
		System.out.println("����� "+sum+"�̴�");
	}
	
	public void checkLog() {
		
	};
}
