package ThreadTest;

public class PiTest extends Thread{
	
		//���� ���
		static double total = 0.0;
		
		public void run() {
			for(long i = 1; i<2000000000;i+=2) {
				if(i/2%2==0) 
					total += 1.0/i;
				else 
					total -= 1.0/i;
		}
				
		System.out.println("PI ���� : "+(total*4));
	}

}
