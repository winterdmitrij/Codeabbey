import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

public class Problem002 extends TaskSolution{
	//String inputData = "10 20 30 40 5 6 7 8";
	List<Integer> testData = new ArrayList<Integer>();
	int result = 0;
	
	public void input(String s) {
		String[] str = s.split(" ");
		for (String item : str) {
			this.testData.add(Integer.parseInt(item));
		}
	}
	
	public void process() {
		for (int item : testData) {
			this.result += item;
		}
	}
	
	public void output() {
		System.out.println(this.result);
	}
	/*
	public static void main(String[] args) {
		int[] arr = {1022, 32, 79, 1045, 671, 329, 1287, 1128, 309, 584, 218, 1004, 1160, 1107, 263, 1057, 257, 1216, 916, 103, 624, 28, 605, 658, 41, 1129, 380, 752, 1177, 384, 379, 224, 721, 177, 792, 441, 767, 947, 1157};
		int summ = 0;
		
		for (int item : arr) {
			summ += item;
		}
		System.out.println(summ);
	}
	*/
}
