package ���ǹ�����;
import java.util.Scanner;

public class Quiz02 {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 
	 System.out.print("���ڸ� �Է��ϼ��� : ");
	 int a = in.nextInt();
	 if(a%2==0) {
		 System.out.println("�Էư��� ¦���Դϴ�");
	 } else {
		 System.out.println("�Էư��� Ȧ���Դϴ�");
	 }
 }
}
