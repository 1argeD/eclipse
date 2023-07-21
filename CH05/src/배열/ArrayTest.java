package 배열;

public class ArrayTest {
	public static void main(String[] args) {
		//배열(array) p177
		//배열은 인덱스로 접근 가능한 변수 (인덱스 0번부터 시작하는 숫자)
		
		int num1=1,num2=2,num3 =3;
		
		//배열의 선언방법
		//자료형[] 식별자 or 자료형 식별자[]
		
		//배열의 생성
		//new 자료형[배열 크기]

		int[] num = new int[3];
		int num10[] = new int[3];
		
		num[0] = 3;
		num[1] = 4;
		num[2] = 7;
		
		int[] anum = {5,6,7,8,9};//배열 선언과 동시에 초기화(선언 이후 초기화 불가)
		
		int[] anum2;
		//anum2 = {1,2,3}; //문법적으로 혀용해주지 않음.
		 
		//배열은 크기 고정 - 줄이거나 늘릴 수 없음.
		
		for(int i=0; i<3; i++) {
			System.out.println(num[i]);
		}
	}
}
