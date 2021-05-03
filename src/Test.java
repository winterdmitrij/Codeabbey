
public class Test {

	public static void main(String[] args) {
		String inputData = "272 510\n"
				+ "2584 4964\n"
				+ "1470 3290\n"
				+ "2460 3362\n"
				+ "888 3608\n"
				+ "5 9\n"
				+ "79 520\n"
				+ "1806 252\n"
				+ "2550 3600\n"
				+ "6 358\n"
				+ "7 419\n"
				+ "8 8105\n"
				+ "99 75\n"
				+ "269 6\n"
				+ "898 2298\n"
				+ "1360 6528\n"
				+ "370 6\n"
				+ "4800 5760\n"
				+ "1332 3478\n"
				+ "4756 1914";
		
		Problem026 x = new Problem026();
		
		x.input(inputData);
		x.process();
		x.output();
	}
}
