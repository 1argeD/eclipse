package 타입변환과다형성;

public class TestMain {

	public static void main(String[] args) {
		Parents p = new Parents("aaa");
		p.print();
		
		test1(p);//자식과 부모객체가 있으면 부모를 받을 수 있다..
		
		Child c = new Child("bbb");
		c.print();
		c.print2();
	
		////////////////////////////////////////////////////////////////////////////////
		
		Parents p2 = new Child("ccc");
		p2.print(); //부모로 부터 받았기 때문에 자식에 있는 print2()를 사용할 수 없다.
		
		((Child)p2).print2();//형변환 - 바뀔 수 있는 경우에만 형을 변환시킨다.(원복) 
		
		Child c1 = (Child)p2;
		c1.print2();
		
		
	}
	
	static void test1(Parents p) {
		
	}

}
