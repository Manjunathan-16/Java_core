import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		String input = "[{()}]";

		Stack<Character> stack = new Stack<>();
		for(char ch : input.toCharArray()){
			if(ch == '(' || ch == '[' || ch == '{'){
				stack.push(ch);
			}else{
				if(stack.isEmpty()){
					System.out.println("invalid empty");
					System.exit(0);
				}
				char top = stack.pop();
			if(ch == ')' && top != '(' || ch == '}' && top !='{' || ch == ']' && top!= '['){
				System.out.println("invlaid ");
				System.exit(0);
				}
			}
		}

		if(!stack.isEmpty()){
			System.out.println("invalid");
		}else {
			System.out.println("valid");
		}
	}
}