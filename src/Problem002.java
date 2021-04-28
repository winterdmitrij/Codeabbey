
public class Problem002 {

	public static void main(String[] args) {
		//int anzahl = 39;
		int[] arr = {1022, 32, 79, 1045, 671, 329, 1287, 1128, 309, 584, 218, 1004, 1160, 1107, 263, 1057, 257, 1216, 916, 103, 624, 28, 605, 658, 41, 1129, 380, 752, 1177, 384, 379, 224, 721, 177, 792, 441, 767, 947, 1157};
		int summ = 0;
		
		// Variante #1
		//for (int i = 0; i < arr.length; i++) {
		//	summ += arr[i];
		//}
		
		// Variante #2
		for (int item : arr) {
			summ += item;
		}
		
		System.out.println(summ);
	}

}
