package ���ʹ�����Ǯ�������߰�����;

public class Ex2 {
	public static void main(String[] args) {
		//2���� �迭
		int[] array1 = {1,2,3,4};
		
		int[][] array2 = {{20,30,40},{50,60,70}};
		System.out.println(array2[1][1]);
		
		int[][] array3 = {{20,30,40,50},{50,60,70,80},{90,100,110,120}};
		
		int sum = 0;
		for(int[] first : array3) sum+=first[0];
		System.out.println(sum);
		
		"aa".charAt(1);
	}
}
