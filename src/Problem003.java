
public class Problem003 {

	public static void main(String[] args) {
		int[] arrA = {505181, 425449, 493689, 308213, 581192, 819056, 191146, 433578, 190900, 755130, 219471, 395867, 878130};
		int[] arrB = {529838, 780439, 130894, 713383, 408182, 121887, 412277, 90320, 339380, 846935, 651652, 708794, 202780};
		int[] result = new int[13];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = arrA[i] + arrB[i];
			System.out.print(result[i] + " ");
		}
	}

}