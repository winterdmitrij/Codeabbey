import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/**Weighted sum of digits
 * 
 * @author comline
 *
 */
public class Problem013 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( String item : tmpArr ) {
			this.inputList.add( Integer.parseInt( item ) );
		}
	}

	@Override
	protected void process() {
		for ( int item : this.inputList ) {
			this.result.add( weightedSumOfDigits(item) );
		}
	}

	@Override
	protected void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}
	
	
	protected int weightedSumOfDigits(int zahl) {
		int sum = 0;
		int length = 1;
		int tmpZahl = zahl;
		
		while ( (tmpZahl / 10) > 0 ) {
			length++;
			tmpZahl /= 10;
		}
		
		for ( int i = length; i > 0; i-- ) {
			sum += (zahl % 10) * i;
			zahl /= 10;
		}
		
		return sum;
	}
}