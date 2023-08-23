package mit;

import java.util.Map;

public interface InterDBClass {
	public void createTable();
	public void createSequence();
	public void saveSumNum(Map<Num, Integer> sumNum);
	public void checkLog();
}
