import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Modular Calculator
 * 
 * @author comline
 *
 */
public class Problem014 extends TaskSolution{				//Noch nicht functioniert!!! 
	long result = 0;										// LONG ist auch zu kurz!!!!
	List<SignValue> inputList = new ArrayList<SignValue>();
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split("\n");
		
		this.result = Integer.parseInt( tmpArr[0] );
		
		for ( int i = 1; i < tmpArr.length; i++ ) {
			String[] items = tmpArr[i].split(" ");
			
			this.inputList.add( new SignValue( items[0].charAt(0), Integer.parseInt(items[1]) ) );
		}
	}

	
	@Override
	protected void process() {
		//this.result = this.startValue;
		
		for ( SignValue item : this.inputList ) {
			/*
			switch( item.getSign() ) {
			case '+':
				this.result += item.getValue();
				break;
			case '-':
				this.result -= item.getValue();
				break;
			case '/':
				this.result /= item.getValue();
				break;
			case '*':
				this.result *= item.getValue();
				break;
			case '%':
				this.result %= item.getValue();
				break;
			}
			*/
			
			if ( item.getSign() == '+' )
				this.result += item.getValue();
			else if ( item.getSign() == '*' )
				this.result *= item.getValue();
			else
				this.result %= item.getValue();
			System.out.print(this.result + ",  ");
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