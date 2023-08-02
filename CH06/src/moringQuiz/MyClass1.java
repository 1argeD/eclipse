package moringQuiz;

public class MyClass1 {
	int a,b; 
	int sum;

	MyClass1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	MyClass1() {
		
	}
	
	public int alladd() {
//		int sum1=0;
//		int sum2=0;
//	
//		for( a=1; a<=10; a++) sum1+=a;
//		for(  ; a<=b; a++) sum2+=a;
//
//		return a==0&&b==0 ? sum1: sum2;
		
		sum=0;
		
		if(a==0&&b==0) for(a=1; a<=10; a++) sum+=a;
		 else for(  ; a<=b; a++) sum+=a;
		
		return sum;
		
	}
	
	public int alladd(int a, int b) {
		sum=0;
		
		for(  ; a<=b; a++) sum+=a;
		
		return sum;
	}

}
