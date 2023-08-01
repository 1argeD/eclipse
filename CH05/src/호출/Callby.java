package »£√‚;

public class Callby {
	
	public static void main(String[] args) {
		int num=3; 
		CallByValue(num);
		System.out.println(num);
		
		MyNum myNum = new MyNum();
		myNum.num = 3;
		CallByReference(myNum);
		System.out.println(myNum.num);
	}
	
	static void CallByValue(int num) {
		num=4;
	}
	
	static void CallByReference(MyNum myNum) {
		myNum.num=4;
	}
	
}
