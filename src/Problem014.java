import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Modular Calculator
 * 
 * @author comline
 *
 */
public class Problem014 extends TaskSolution{				//Noch nicht functioniert!!! 
	int startValue, result = 0;
	List<SignValue> inputList = new ArrayList<SignValue>();
	
	@Override
	protected void input(String str) {
		//StringTokenizer st = new StringTokenizer(str, " \n");
		String[] tmpArr = str.split("\n");
		
		this.startValue = Integer.parseInt( tmpArr[0] );
		
		for ( int i = 1; i < tmpArr.length; i++ ) {
			String[] items = tmpArr[i].split(" ");
			
			this.inputList.add( new SignValue( items[0].charAt(0), Integer.parseInt(items[1]) ) );
		}
	}

	
	@Override
	protected void process() {
		this.result = this.startValue;
		
		for ( SignValue item : this.inputList ) {
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
		}
	}

	
	@Override
	protected void output() {
		System.out.println(this.startValue);
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