import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import services.TaskSolution;

/** Linear Function
 * 
 * @author comline
 *
 */
public class Problem010 extends TaskSolution{				//NOCH NICHT FUNKTIONIERT!!!!
	List<Integer> inputList = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	final int MIN = -10, MAX = 10;
	
	@Override
	protected void input(String str) {
		StringTokenizer st = new StringTokenizer(str, " \n");
		
		while ( st.hasMoreTokens() )
			this.inputList.add( Integer.parseInt( st.nextToken() ) );
	}

	@Override
	protected void process() {
		int x1, y1, x2, y2, b1, b2;
		
		for ( int i = 0; i < this.inputList.size(); i += 4 ) {
			x1 = this.inputList.get(i);
			y1 = this.inputList.get(i+1);
			x2 = this.inputList.get(i+2);
			y2 = this.inputList.get(i+3);
			
			for ( int a = this.MIN; a <= this.MAX; a++ ) {
				b1 = ( y1 - a * x1 );
				b2 = ( y2 - a * x2 );
				if ( b1 == b2 ) {
					this.result.add(a);
					this.result.add(b1);
					break;
				}
			}
		}
	}

	@Override
	protected void output() {
		System.out.println(this.inputList);
		System.out.println(this.result);
		
		for ( int i = 0; i < this.result.size(); i += 2 )
			System.out.print( "(" + this.result.get(i) + " " + this.result.get(i+1) + ") " );
	}
}