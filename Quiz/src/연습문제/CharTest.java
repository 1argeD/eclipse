package 연습문제;

public class CharTest {
	public static void main(String[] args) {
		char ch = 'A';
		
		for(int i=0; i<26; i++) {
			System.out.println((char)(ch+i));
		}
		
	}
	String grade(int score, int maxScore) {
		int grade = (maxScore-(score+1))/10;
		char a = 'A';
		return ((char)(a+grade)+"");
	}
}
