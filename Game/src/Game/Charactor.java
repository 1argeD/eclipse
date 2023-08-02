package Game;

public class Charactor {

	String name;
	int energy;
	
	public Charactor(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}

	int punch() {
		return 10;
	}
	
	int kick() {
		return 20;
	}
	
	int shiled() {
		return 15;
	}
}
