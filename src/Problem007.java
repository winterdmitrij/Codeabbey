import services.TaskSolution;

public class Problem007{

	public static void main(String[] args) {
		double[] fahrenheit = {129, 266, 108, 282, 489, 461, 60, 363, 72, 351, 475, 163, 163, 161, 336, 158, 377, 370, 484, 430, 521, 474, 565, 281, 241, 251, 471, 227, 354, 300, 214, 488, 124, 244, 231, 234, 277, 583};
		int celsius;
		
		//double[] fahrenheit = {495, 353, 168, -39, 22};
		
		for (double item : fahrenheit) {
			celsius = round( ( item - 32 ) * 5 / 9 );
			System.out.print(celsius + " ");
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
