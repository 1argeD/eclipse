package ���ʹ���;

public class Test38 extends Helth {
	static double s_weight=0.0, fat=0.0;
	static String result=null;
	
	public static void main(String[] args) {
		Helth helth = new Helth();
		Helth.input();
		char gender = helth.gender;
		double tall = helth.tall;
		double weight = helth.weight;
		double fat = calculate(gender, tall, weight);
		output2(fat);
	}
	
	//fat
	public static double calculate(char gender, double tall,double weight) {
		
		if(gender=='M') {
			s_weight = (tall-100)*0.9;
			return weight/s_weight*100;
		} else if(gender=='F') {
			s_weight = (tall-100)*0.85;
			return weight/s_weight*100;
		}
		
		return 0;
	}
	
	public static void output2(double fat) {
		String result="";
		
		if(fat<=90) {
			result = "��ü��";
		} else if(91<fat&&fat<=110) {
			result = "����(ǥ��ü��)";
		} else if(111<fat&&fat<=120) {
			result = "��ü��";
		} else if(121<fat&&fat<=130) {
			result = "�浵��";
		} else if(131<fat&&150>=fat) {
			result = "�ߵ���";
		} else if(150<fat) {
			result = "����";
		}
		
		Helth.output(fat, result);
	}
}
