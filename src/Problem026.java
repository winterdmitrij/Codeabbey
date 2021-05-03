import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import services.TaskSolution;

/** Greatest Common Divisor and Least Common Multiples
 * 
 * @author comline
 *
 */
public class Problem026 extends TaskSolution{
	List<Integer> inputListA = new ArrayList<Integer>();
	List<Integer> inputListB = new ArrayList<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	
	
	public void input(String s) {
		StringTokenizer st = new StringTokenizer(s, " \n");
		List<Integer> tempList = new ArrayList<Integer>();
		while (st.hasMoreTokens()) {
			tempList.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < tempList.size(); i++) {
			if ( i % 2 == 0)
				this.inputListA.add( tempList.get(i) );
			else
				this.inputListB.add( tempList.get(i) );
		}
	}

	@Override
	protected void process() {
		for ( int i = 0; i < this.inputListA.size(); i++ ) {
			this.result.add( gcd( this.inputListA.get(i), this.inputListB.get(i) ) );
			this.result.add( lcm( this.inputListA.get(i), this.inputListB.get(i) ) );
		}
	}

	@Override
	protected void output() {
		System.out.println(this.inputListA);
		System.out.println(this.inputListB);
		System.out.println();
		
		for ( int i = 0; i < this.result.size(); i += 2 )
			System.out.print( "(" + this.result.get(i) + " " + this.result.get(i+1) + ") ");
	}

	
	protected int gcd(int numberA, int numberB) {
		if ( numberA == numberB )
			return numberA;
		else {
			while( numberA != numberB ) {
				if ( numberA > numberB )
					numberA -= numberB;
				else if ( numberB > numberA )
					numberB -= numberA;
			}
			return numberA;
		}
	}
	
	protected int lcm(int numberA, int numberB) {
		return ( numberA * numberB / gcd ( numberA, numberB ) );
	}
}