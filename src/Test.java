
public class Test {

	public static void main(String[] args) {
		String inputData = "158 934 261 716 142 178 330 1117 1100 875 966 1093 59 1244 136"
				+ "405 62 945 1150 965 1169 531 417 622 345 910 772 194 253 531 201 338 1122"
				+ "487 687 198 900 1278 680 1171 768 610 184 239 216";
		
		Problem002 x = new Problem002();
		
		x.input(inputData);
		x.process();
		x.output();

	}

}
