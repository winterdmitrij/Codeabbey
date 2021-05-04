import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import services.TaskSolution;

/** Square Root
 * 
 * @author comline
 *
 */
public class Problem018 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> inputNumbersList = new ArrayList<Integer>();
	List<Integer> inputCountOfStepsList = new ArrayList<Integer>();
	List<Double> result = new ArrayList<Double>();
	
	@Override
	protected void input(String str) {
		StringTokenizer st = new StringTokenizer(str, " \n");
		
		while ( st.hasMoreTokens() )
			this.inputList.add( Integer.parseInt( st.nextToken() ) );
		
		for ( int i = 0; i < this.inputList.size(); i++ ) {
			if ( i % 2 == 0 )
				this.inputNumbersList.add( this.inputList.get(i) );
			else
				this.inputCountOfStepsList.add( this.inputList.get(i) );
		}
	}

	
	@Override
	protected void process() {
		for ( int i = 0; i < this.inputNumbersList.size(); i++ ) {
			this.result.add( squareRoot( this.inputNumbersList.get(i), this.inputCountOfStepsList.get(i) ) );
		}
	}

	
	@Override
	protected void output() {
		System.out.println(this.inputNumbersList);
		System.out.println(this.inputCountOfStepsList);
		System.out.println();
		
		for ( double item : this.result ) {
			System.out.print( ( "" + item ).toString().replace(',', '.') + " " );
		}
	}


	protected double squareRoot(int value, int countOfSteps) {
		double approximation = 1.;
		double div;
		
		for (int i = 0; i < countOfSteps; i++) {
			div = value / approximation;
			approximation = ( approximation + div ) / 2;	
		}
		
		return approximation;
	}
}