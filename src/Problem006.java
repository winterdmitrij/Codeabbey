
public class Problem006 {

	public static void main(String[] args) {
		double[] arrA = {7579, -7435816, 7964316, 4557505, 356190, 19745, -1234534, 140, 105, 3076363, -5286937, 11047, 21, 189, 4423, 6174417, 8015988, 15671, 1911364, 300209, 4340321, 23, 14029, -3406809};
		double[] arrB = {1576, -3813172, 625, 3136490, 497704, 900, -1578724, 8, 14, 709, 2606414, 878, 14, 14, 716, 283, 119, 1948, 886, 3275133, 351, 2, 1826, -181525};
		int[] result = new int[24];
		double erg;
		
		
		for (int i = 0; i < result.length; i++) {
			erg = arrA[i] / arrB[i];
			result[i] =  round(erg);
			//System.out.println(erg + " = " + result[i] + ", ");
			System.out.print(result[i] + " ");
		}
	}

	public static int round(double zahl) {
		int klZahl = (int) zahl;
		zahl = (double) zahl * 10;
		int intZahl = (int) zahl;
		
		if (zahl >= 0) {
			if (intZahl % 10 < 5)
				return klZahl;
			else
				return klZahl + 1;
		}
		else {
			if (Math.abs(intZahl) % 10 < 5)
				return klZahl;
			else
				return klZahl -1;
		}
	}
}




