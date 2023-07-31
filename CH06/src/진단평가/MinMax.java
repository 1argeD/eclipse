package 진단평가;

public record MinMax(
		int a, int b, int c, int d
		) {
	public int min(int a,int b,int c,int d) {
		int s1 = Math.min(a, b);
		int s2 = Math.min(c, d);
		return s1>s2 ? s2:s1; 
	}
	
	public int max(int a,int b,int c,int d) {
		int s1 = Math.max(a, b);
		int s2 = Math.max(c, d);
		return s1<s2 ? s2:s1;
	}

}
