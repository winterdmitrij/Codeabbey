
public class Test {

	public static void main(String[] args) {
		String inputData = "652 400 340\n"
				+ "914 1555 802\n"
				+ "762 917 530\n"
				+ "1188 362 621\n"
				+ "918 1007 1839\n"
				+ "300 521 676\n"
				+ "743 1434 3346\n"
				+ "396 1704 735\n"
				+ "1341 751 1268\n"
				+ "378 626 1182\n"
				+ "790 1173 935\n"
				+ "425 138 170\n"
				+ "921 3765 1632\n"
				+ "857 424 486\n"
				+ "611 356 729\n"
				+ "214 248 601\n"
				+ "644 1307 808\n"
				+ "136 266 217\n"
				+ "1007 990 2164\n"
				+ "1573 889 3231\n"
				+ "939 2260 1850\n"
				+ "954 3641 1614\n"
				+ "883 483 2123\n"
				+ "989 1735 531\n"
				+ "387 353 732\n"
				+ "535 1034 827\n"
				+ "771 581 1559\n"
				+ "233 415 335";
		
		Problem009 x = new Problem009();
		
		x.input(inputData);
		x.process();
		x.output();
	}
}
