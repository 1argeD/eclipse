package Vehicle;

public class OverTypeDemo {
 public static void main(String[] args) {
	 Vehicle v = new Car();
	 System.out.println(v.name); //�θ�� ���� �޾ƿ� ���̱⿡ �ڽ�Ŭ������ String ���� �������� ����.
	 
	 v.whoami();//static���� ������ ���� �ƴϱ� ������ ���� �ڽ��� �������� �����Ų��. 
	 v.move();//�θ�� ���� ���� static �ż��带 ����߱� ������ ���� ������ �ʴ´�.
 }
}
