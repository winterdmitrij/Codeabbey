import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Bubble Sort
 * 
 * @author comline
 *
 */
public class Problem027 extends TaskSolution{
	List<Integer> inputList = new ArrayList<Integer>();
	int pass = 0, swap = 0;
	
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split(" ");
		
		for ( String item : tmpArr )
			this.inputList.add( Integer.parseInt(item) );
	}

	
	@Override
	protected void process() {
		boolean marke = true;
		int length = this.inputList.size() - 1;
		int tmpNumber;
		
		while ( marke ) {
			marke = false;
			this.pass++;
			for (int i = 0; i < length; i++) {
				if ( this.inputList.get(i) > this.inputList.get(i+1) ) {
					tmpNumber = this.inputList.get(i);
					this.inputList.set( i, this.inputList.get(i+1) );
					this.inputList.set( i+1, tmpNumber );
					
					marke = true;
					this.swap++;
				}
			}
			length--;
		}
	}

	
	@Override
	protected void output() {
		System.out.println(this.inputList);
		System.out.println("\n" + this.pass + " " + this.swap);
	}
}