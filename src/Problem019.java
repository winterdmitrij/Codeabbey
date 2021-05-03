import java.util.ArrayList;
import java.util.List;

import services.TaskSolution;

/** Matching Brackets
 * 
 * @author comline
 *
 */
public class Problem019 extends TaskSolution{
	List<String> inputList = new ArrayList<String>();
	List<Boolean> result = new ArrayList<Boolean>();
	char[] brackets = new char[] { '(', ')', '[', ']', '{', '}', '<', '>' };
	//String brackets = "()[]{}<>";
	
	
	@Override
	protected void input(String str) {
		String[] tmpArr = str.split("\n");
		
		for ( String item : tmpArr )
			this.inputList.add(item);
	}

	
	@Override
	protected void process() {
		for ( String item : this.inputList ) {
			this.result.add( isMatchingBrackets(item) );
		}
	}

	
	@Override
	protected void output() {
		System.out.println(this.inputList);
		System.out.println(this.result);
	}

	
	protected boolean isMatchingBrackets(String string) {
		boolean marke = true;
		char bracket = 'a';
		
		for ( int i = 0; i < string.length(); i++ ) {
			System.out.print( string.charAt(i) + " ");
			//for (int j = 0; j < this.brackets.length; i++) {
				//if ( this.brackets[j] == string.charAt(i)) {
					//bracket = this.brackets[j];
					//System.out.print(bracket);
					//marke = false;
				//}
				//else if (this.brackets[j] == string.charAt(i) && j % 2 == 1 && bracket != '0' ) {
				//	marke = true;
				//}
				//else if (this.brackets[j] == string.charAt(i) && j % 2 == 1 && bracket == '0' ) {
				//	return false;
				//}
				//else
				//	isMatchingBrackets(string, i);
			//}
		}
		
		return marke;
	}
}