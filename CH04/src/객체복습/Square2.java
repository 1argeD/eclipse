package ��ü����;

public record Square2(
		int width, int height
		) {
	
	int area() {
		return height*width;
	}
	
	int round() {
		return (height+width)*2;
	}
	
}
