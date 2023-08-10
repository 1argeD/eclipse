package share;

public class CalcThread extends Thread {
    ShareData share = null; //공유객체 
	public void run() {
		long sum = 0;
		//동기화 
		synchronized (share) {//()안에 있는 것이 동기화 대상 객체 - 여기선 share데이터
			for(int i = 0; i<20000000; i++) {
				sum+=i;
				share.sum = sum;//공유 객체에 데이터 쓰기
			}
			share.notify();//시작해라-신호를 주는 것
		}
		
//		ShareData.isReady = true;
	}

}
