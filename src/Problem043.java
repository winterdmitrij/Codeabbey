import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Dice Rolling
 * 
 * @author comline
 *
 */
public class Problem043 extends TaskSolution{
	List<Double> inputList = new ArrayList<Double>();
	List<Integer> result = new ArrayList<Integer>();
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr ) {
			this.inputList.add( Double.parseDouble( item ) );
		}
	}

	
	@Override
	protected void process() {
		for ( double zahl : this.inputList ) {
			this.result.add( gitDiceNumber(zahl) );
		}
	}
	

	@Override
	protected void output() {
		System.out.println(this.inputList);
		
		for ( int item : this.result ) {
			System.out.print( item + " " );
		}
	}

	
	protected int gitDiceNumber(double rndNumber) {
		return (int) ( rndNumber * 6 ) + 1;
	}
}