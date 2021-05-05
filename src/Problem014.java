import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Modular Calculator
 * 
 * @author comline
 *
 */
public class Problem014 extends TaskSolution{
	BigInteger result;
	List<SignValue> inputList = new ArrayList<SignValue>();
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split("\n");
		
		this.result = BigInteger.valueOf( Long.parseLong( tmpArr[0] ) );
		
		for ( int i = 1; i < tmpArr.length; i++ ) {
			String[] items = tmpArr[i].split(" ");
			
			this.inputList.add( new SignValue( items[0].charAt(0), Integer.parseInt(items[1]) ) );
		}
	}

	
	@Override
	protected void process() {
		for ( SignValue item : this.inputList ) {
			
			if ( item.getSign() == '+' )
				this.result = this.result.add( BigInteger.valueOf( (long) item.getValue() ) );
			else if ( item.getSign() == '*' )
				this.result = this.result.multiply( BigInteger.valueOf( (long) item.getValue() ) );
			else
				this.result = this.result.remainder( BigInteger.valueOf( (long) item.getValue() ) );
		}
	}

	
	@Override
	protected void output() {
		System.out.println();
		System.out.println(this.inputList);
		System.out.println("\n" + this.result);
	}
}

class SignValue{
	char sign;
	int value;
	
	protected SignValue(char sign, int value) {
		this.sign = sign;
		this.value = value;
	}
	
	
	protected char getSign() {
		return sign;
	}

	protected int getValue() {
		return value;
	}


	public String toString() {
		return "" + this.sign + " " + this.value;
	}
}