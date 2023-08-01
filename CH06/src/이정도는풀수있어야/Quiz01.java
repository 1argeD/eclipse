package 이정도는풀수있어야;

public class Quiz01 {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc(1,2,3);
		
		int num1 = myCalc.add(5); //1+2+3+5
		int num2 = myCalc.add(); //1+2+3
		
		MyCalc myCalc1 = new MyCalc(6,2,3);
		int num3 = myCalc1.add(5); //6+2+3+5
		int num4 = myCalc1.add(); //6+2+3
		
		System.out.println(num1+" "+num2+ " "+num3+" "+num4);
	}
}
