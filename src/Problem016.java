import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Average of an array
 * 
 * @author comline
 *
 */
public class Problem016 extends TaskSolution{				//NOCH NICHT FUNKTIONIERT!!!!
	List<String> inputList = new ArrayList<String>();
	List<Integer> result = new ArrayList<Integer>();
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			this.inputList.add(item);
		}
	}

	@Override
	protected void process() {
		for ( String item : this.inputList ) {
			String[] strArr = item.split(" ");
			int arrLength = strArr.length - 1;
			int[] intArr = new int[arrLength];
			
			for ( int i = 0; i < arrLength; i++ ) {
				intArr[i] = Integer.parseInt( strArr[i] );
			}
			
			this.result.add( averageOfAnArray( intArr ) );
		}
	}

	@Override
	protected void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}
	
	
	protected int averageOfAnArray(int[] arr) {
		int summ = 0;
		
		for ( int item : arr ) {
			summ += item;
		}
		// TODO Math.round funktioniert falsch !!!!!
		return Math.round( summ / arr.length );
	}
}