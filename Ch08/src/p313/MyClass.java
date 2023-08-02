package p313;

public class MyClass {
	int a;
	
	MyClass(int a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "MyClass [a=" + a + " ]";
	}
	
	@Override
	public boolean equals(Object ob) {
		if(a == ((MyClass)ob).a) {
			return true;
		} else {
			return false;
		}
	}
}
