package Game;
import java.util.Random;
import java.util.Scanner;

public class GameStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("게임 캐릭터 이름 입력하기 : ");
		Charactor myChr = new Charactor(sc.nextLine(), 100);
		Charactor enemy = new Charactor("enemy", 100);
		
		int myHp = myChr.energy;
		int enemyHp = enemy.energy;
		int enemyBehavior = 0;
		do {
			
			System.out.print("캐릭터가 할 동작을 입력해주세요(펀치,킥) : ");
			String input = sc.nextLine();
			enemyBehavior = rd.nextInt(2);
			
			if(input.equals("킥")) {
				if(enemyBehavior==1) {
					
					enemyHp-=myChr.kick();
					System.out.println(myChr.name+"의 킥!");
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
					
					System.out.println("상대방의 킥!");
					myHp-=enemy.kick();
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
				} else if(enemyBehavior==2) {
					
					enemyHp-=myChr.kick();
					System.out.println(myChr.name+"의 킥!");
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
					
					System.out.println("상대방의 펀치!");
					myHp-=enemy.punch();
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
				
				} else if(enemyBehavior==0) {
					
					System.out.println(myChr.name+"의 킥!");
					
					System.out.println("하지만 상대방이 당신의 공격을 막았습니다!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
				}
				
			} else if(input.equals("펀치")) {
				
				if(enemyBehavior==1) {
					
					enemyHp-=myChr.punch();
					System.out.println(myChr.name+"의 펀치!");
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
					
					System.out.println("상대방의 킥!");
					myHp-=enemy.kick();
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
					
				} else if(enemyBehavior==2) {
					
					enemyHp-=myChr.punch();
					System.out.println(myChr.name+"의 펀치!");
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
				} else if(enemyBehavior==0) {
					
					System.out.println("하지만 상대방이 당신의 공격을 막았습니다!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
				}
				
			} else if(input.equals("막기")) {
				
				if(enemyBehavior==1) {
					System.out.println("상대방의 킥!");
					myHp-=enemy.kick();
					
					System.out.println("하지만 "+myChr.name+"의 방어성공!");
					myHp+=myChr.shiled();
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
					
				} else if(enemyBehavior==2) {
					
					System.out.println("상대방의 펀치!");
					System.out.println("하지만 "+myChr.name+"의 방어성공!");
					myHp+=myChr.shiled();
					myHp-=enemy.punch();
					
					System.out.println(myChr.name+"의 hp는"+myHp+"만큼 남았습니다.");
					
				} else if(enemyBehavior==0) {
					
					System.out.println("하지만 상대방이 당신의 공격을 막았습니다!");
					int dmg = myChr.kick()-enemy.shiled();
					enemyHp-= dmg;
					System.out.println("상대 hp는 "+enemyHp+"만큼 남았습니다.");
				}
					
			}
			if(myHp<=0) {
				System.out.println("당신은 패배하였습니다.");
				break;
			}
			
			if(enemyHp<=0) {
				System.out.println("당신이 승리하였습니다.");
				break;
			}
			
		} while(enemyHp>0||myHp>0); 	

	}

}
