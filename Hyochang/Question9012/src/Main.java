import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		while((n--)>0)
		{
			
			boolean check=true;
			String input=br.readLine();
			Stack<Character> stack=new Stack<>();
			
			char temp;
			
			for(int i=0;i<input.length();i++)
			{
				temp=input.charAt(i);
				
				if(temp=='(') {
					stack.push(temp);
				}
				
				else {
					if(!stack.isEmpty()) {
						stack.pop();
					}
					else {
						check=false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty())
				check=false;
			
			if(check)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		br.close();
	}

}
