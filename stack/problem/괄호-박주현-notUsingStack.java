import java.util.Scanner;

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
			System.out.println(PS[i]);
			 if(isVPS(PS[i])==true) {
				 System.out.println("YES");
			 }
			 else {
				 System.out.println("NO");
			 }
		}
		
	}
	
	static boolean isVPS(String PS) {
		int LPAREN = 0;
		int RPAREN = 0;
		
		if(PS.length()%2==1) {
			return false;
		}
		
		for(int i = 0 ; i <PS.length(); i++) {
			if(PS.charAt(i)=='(') {
				LPAREN ++;
			}
			else if(PS.charAt(i)==')') {
				RPAREN ++;
			}
			
			if(LPAREN - RPAREN<0) {
				return false;
			}
		}
		if(LPAREN - RPAREN ==0) {
			return true;
		}
		
		return false;
		
	}

}
