package ÇÔ¼ö;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(12);
		
		if(num==0) {
			System.out.println("°ûµ¿±Ô´Ô");
		} else if(num==1) {
			System.out.println("±è°æÈñ´Ô");
		} else if(num==2) {
			System.out.println("±è¿ëÁÖ´Ô");
		} else if(num==3) {
			System.out.println("³ª½ÂÁ¤´Ô");
		} else if(num==4) {
			System.out.println("¹Ú°æºó´Ô");
		} else if(num==5) {
			System.out.println("ºò¿µÀÓ´Ô");
		} else if(num==6) {
			System.out.println("¹ÚÀç¿õ´Ô");
		} else if(num==7) {
			System.out.println("À±Ã¢¿í´Ô");
		} else if(num==8) {
			System.out.println("ÀÌÀç¿µ´Ô");
		} else if(num==9) {
			System.out.println("ÀÌÁØ¿µ´Ô");
		} else if(num==10) {
			System.out.println("ÀÌÁø¿í´Ô");
		} else {
			System.out.println("ÇÑÁ¾Çõ´Ô");
		} 
	}
}
