package �Լ�;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(12);
//		
//		if(num==0) {
//			System.out.println("�����Դ�");
//		} else if(num==1) {
//			System.out.println("������");
//		} else if(num==2) {
//			System.out.println("����ִ�");
//		} else if(num==3) {
//			System.out.println("��������");
//		} else if(num==4) {
//			System.out.println("�ڰ���");
//		} else if(num==5) {
//			System.out.println("���Ӵ�");
//		} else if(num==6) {
//			System.out.println("�������");
//		} else if(num==7) {
//			System.out.println("��â���");
//		} else if(num==8) {
//			System.out.println("���翵��");
//		} else if(num==9) {
//			System.out.println("���ؿ���");
//		} else if(num==10) {
//			System.out.println("�������");
//		} else {
//			System.out.println("��������");
//		} 
		
		String[] name = {"�����Դ�","������","����ִ�","��������","�ڰ���"
				,"�ڿ��Ӵ�", "�������","��â���","���翵��","���ؿ���","�������","��������"};
	
		for(int i=0; i<name.length; i++) {
			if(num==i) {
				System.out.println(name[i]);
			}
		}
	}
}
