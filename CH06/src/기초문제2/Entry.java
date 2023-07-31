package 기초문제2;

public class Entry {
	static String word;
	
	public Entry() {
		
	}
	public Entry(String w) {
		this.word = w;
	}
	
	public static void writeView(String w) {
		System.out.println("약어 : "+ w);
	}

}
