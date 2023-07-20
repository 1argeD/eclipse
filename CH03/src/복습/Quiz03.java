package º¹½À;

public class Quiz03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2!=0) sum = sum+i;
		}
		System.out.println(sum);
	
	int total = 0, x = 0,y;
	
	while (++x < 5) {
		y = x * x;
		System.out.println(y);
		total +=y;
	}
	System.out.println(total);
	}
	
}
