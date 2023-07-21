package °´Ã¼º¹½À;

public class Quiz02 {
	public static void main(String[] args) {
		MyMath2 myMath2 = new MyMath2(1,4,5);
		myMath2.sum();
		
		MyMath3 myMath3 = new MyMath3();
		myMath3.a = 10;
		myMath3.b = 10;
		myMath3.c = 20;
		myMath3.sub();
		
		MyMath2Record myMath2R = new MyMath2Record(1,4,5);
		myMath2R.sum();
	}

}
