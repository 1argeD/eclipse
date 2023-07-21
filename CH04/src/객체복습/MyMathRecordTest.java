package °´Ã¼º¹½À;

import org.junit.jupiter.api.Test;

class MyMathRecordTest {
	MyMathRecord myMathodRecord = new MyMathRecord(1,10);
	@Test
	void test() {
		System.out.println(myMathodRecord.allsum());
		System.out.println(myMathodRecord.mul());
		System.out.println(myMathodRecord.max(3, 7));
	}

}
