
public class Problemoo4 {

	public static void main(String[] args) {
		int[] arrA = {2026721, -7926833, 8541467, -2031123, 7242137, -5611068, 7513803, -5653157, -3879663, 5492733, 9513310, -6756663, -7392940, 222550, -7848708, -3612234, 4232284, -2406127, -2027817, -7295929, 7047153, -7248086, -474485, 8940490, -8669881, -5881509, -3633603};
		int[] arrB = {-2409084, 9113570, -5486661, -6601058, -865001, -4652469, -3853411, -9489476, -1400175, -5468463, 9464751, 2285203, -2795270, 5170922, -593315, 582646, -3418073, -8190715, -1571151, -6001355, -2434883, -4477459, -6978234, 1309643, 6124192, -33548, 7865019};
		int[] result = new int[27];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = arrA[i] > arrB[i] ? arrB[i] : arrA[i];
			System.out.print(result[i] + " ");
		}
	}	
}

