package share;

public class MultiThreadMain {

	public static void main(String[] args) {
		CalcThread calc = new CalcThread();
		PrintThread print = new PrintThread();
		ShareData data = new ShareData();//동기화 객체 - 공유할 객체를 하나 만들어서 
		
		//각 객체에 wait과 notify를 사용하면 순서가 변해도 자원 사용의 우선순위를 정할 수 있다.
		print.share = data;//공유할 객체
		print.start();
		
		calc.share = data; //공유할 객체
		calc.start();
	}
}
