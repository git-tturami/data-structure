package datastructure3;

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=factorial(n);
		
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
			
	}

}

