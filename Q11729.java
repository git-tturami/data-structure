package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11729 {
	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(sc.readLine());
		System.out.println((int)Math.pow(2, n)-1);
		hanoi(n,1,3,2);
	}
	
	public static void hanoi(int n,int s,int f,int no) {
		if(n==1) {
			System.out.println(s+" "+f);
		}
		else {
			hanoi(n-1,s,no,f);
			System.out.println(s+" "+f);
			hanoi(n-1,no,f,s);
		}
	}
}
