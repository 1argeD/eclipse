package 기초문제2;

public class SubEntry extends Entry{
	static String definition;
	
	static int year;
	
	public SubEntry(String w) {
		this.word = w;
	}
	
	public SubEntry(String w, String d, int y) {
		Entry.word = w;
		this.definition = d;
		this.year = y;
	}
	
	public static void printView() {
		Entry.writeView(Entry.word);
		System.out.println("원어 : "+ definition);
		System.out.println("시기 : "+ year+" 년");
	}
	
}
