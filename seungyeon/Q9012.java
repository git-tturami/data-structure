package datastructure3;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> stack=new Stack();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		String input;
		sc.nextLine();
		while(t!=0) {
			input=sc.nextLine();
			n=0;
			while(n<input.length()) {
				if(input.charAt(n)=='(') {
					stack.push(input.charAt(n));
				}
				else {
					if(!stack.isEmpty()&&(char)stack.peek()=='(') {
						stack.pop();
					}
					else {
						stack.push(input.charAt(n));
					}
				}
				
				n++;
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}
			else {
				stack.clear();
				System.out.println("NO");
			}
			
			t--;
		}
	}

}
