package º¹½À;

public class Quiz05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 5; i<77; i++) {
			if(i%7!=0&&i%13!=0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}
