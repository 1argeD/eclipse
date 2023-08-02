package Game;
import java.util.Random;
import java.util.Scanner;

public class GameStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("���� ĳ���� �̸� �Է��ϱ� : ");
		Charactor myChr = new Charactor(sc.nextLine(), 100);
		Charactor enemy = new Charactor("enemy", 100);
		
		int myHp = myChr.energy;
		int enemyHp = enemy.energy;
		int enemyBehavior = 0;
		do {
			
			System.out.print("ĳ���Ͱ� �� ������ �Է����ּ���(��ġ,ű) : ");
			String input = sc.nextLine();
			enemyBehavior = rd.nextInt(2);
			
			if(input.equals("ű")) {
				if(enemyBehavior==1) {
					
					enemyHp-=myChr.kick();
					System.out.println(myChr.name+"�� ű!");
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
					
					System.out.println("������ ű!");
					myHp-=enemy.kick();
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
				} else if(enemyBehavior==2) {
					
					enemyHp-=myChr.kick();
					System.out.println(myChr.name+"�� ű!");
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
					
					System.out.println("������ ��ġ!");
					myHp-=enemy.punch();
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
				
				} else if(enemyBehavior==0) {
					
					System.out.println(myChr.name+"�� ű!");
					
					System.out.println("������ ������ ����� ������ ���ҽ��ϴ�!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
				}
				
			} else if(input.equals("��ġ")) {
				
				if(enemyBehavior==1) {
					
					enemyHp-=myChr.punch();
					System.out.println(myChr.name+"�� ��ġ!");
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
					
					System.out.println("������ ű!");
					myHp-=enemy.kick();
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
					
				} else if(enemyBehavior==2) {
					
					enemyHp-=myChr.punch();
					System.out.println(myChr.name+"�� ��ġ!");
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
				} else if(enemyBehavior==0) {
					
					System.out.println("������ ������ ����� ������ ���ҽ��ϴ�!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
				}
				
			} else if(input.equals("����")) {
				
				if(enemyBehavior==1) {
					System.out.println("������ ű!");
					myHp-=enemy.kick();
					
					System.out.println("������ "+myChr.name+"�� ����!");
					myHp+=myChr.shiled();
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
					
				} else if(enemyBehavior==2) {
					
					System.out.println("������ ��ġ!");
					System.out.println("������ "+myChr.name+"�� ����!");
					myHp+=myChr.shiled();
					myHp-=enemy.punch();
					
					System.out.println(myChr.name+"�� hp��"+myHp+"��ŭ ���ҽ��ϴ�.");
					
				} else if(enemyBehavior==0) {
					
					System.out.println("������ ������ ����� ������ ���ҽ��ϴ�!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("��� hp�� "+enemyHp+"��ŭ ���ҽ��ϴ�.");
				}
					
			}
			if(myHp<=0) {
				System.out.println("����� �й��Ͽ����ϴ�.");
				break;
			}
			
			if(enemyHp<=0) {
				System.out.println("����� �¸��Ͽ����ϴ�.");
				break;
			}
			
		} while(enemyHp>0||myHp>0); 	

	}

}
