package ��ü����;

public class MyMathClass {
	
	int num1, num2;
	
	MyMathClass(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	MyMathClass() {
		
	}
	
	int allsum() {
		int i=0;
		int sum = 0;
		for(; i<=num2; i++) {
			sum += i;
		}
		return sum;
	}
	
	int mul() {
		return num1*num2;
	}
	
	int max(int a, int b) {

//		if(a>b) {
//			return a;
//		} else {
//			return b;
//		}
		
		
		//���׿����� 
		//���� ? ���ϋ� : �����϶�
		
		return a>b ? a : b;		
	
	}
	
}
