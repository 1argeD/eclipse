package º¹½À;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//È­¾¾ ¼·¾¾ º¯È¯±â ¸¸µé±â
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¡ÆFÈ­¾¾¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä : ");
		int template = sc.nextInt();
		
		System.out.println("È­¾¾ : "+template+"¡ÆF´Â ¼·¾¾ : "+(template-32)*5/9+"¡ÆC ÀÔ´Ï´Ù.");
	}
}
