import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Array Checksum
 * 
 * @author comline
 *
 */
public class Problem017 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	long result = 0;
	
	
	@Override
	protected void input(String str) {
		String[] strArr = str.split(" ");
				
		for ( String item : strArr) {
			this.inputList.add( Integer.parseInt( item ) );
		}
	}

	
	@Override
	protected void process() {
		final int SEED = 113;
		final int LIMIT = 10000007;
		
		for ( int i = 0; i < this.inputList.size(); i++ ) {
			this.result = ( this.result + this.inputList.get(i) ) * SEED;
			
			if ( this.result % LIMIT > 0 ) {
				this.result %= LIMIT;
			}
		}
	}

	
	@Override
	protected void output() {
		System.out.println(this.inputList);
		
		System.out.print(this.result);
	}
}