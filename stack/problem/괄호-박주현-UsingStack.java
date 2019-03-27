import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 0;
		
		Scanner input = new Scanner(System.in);
		T = input.nextInt();
		
		String[] PS = new String[T];
		for(int i = 0 ; i < T; i++) {
			PS[i] = input.next();
		}
		
		for(int i = 0 ; i <T; i++) {
			 if(isVPS(PS[i])==true) {
				 System.out.println("YES");
			 }
			 else {
				 System.out.println("NO");
			 }
		}
		
	}
	
	static boolean isVPS(String PS) {
		Stack<Character> initialStack = new Stack<Character>();
		Stack<Character> popStack = new Stack<Character>();
		
		if(PS.length()%2==1) {
			return false;
		}
		
		for(int i = 0 ; i <PS.length(); i++) {
			initialStack.push(PS.charAt(i));
		}
		
		
		
		if(initialStack.peek().equals('(')) {
			return false;
		}
		else {
			popStack.push(initialStack.pop());
		}
		
		
		
		while(initialStack.empty()==false) {
			if(popStack.empty()) {
				popStack.push(initialStack.pop());
			}
			else if(initialStack.peek().equals(popStack.peek())){
				popStack.push(initialStack.pop());
			}
			else if(initialStack.peek().equals('(') && popStack.peek().equals(')')) {
				initialStack.pop();
				popStack.pop();
			}
			else {
				return false;
			}
		}
		
		if(popStack.empty()==true) {
			return true;
		}
		else {
			return false;	
		}
		
	}

}
