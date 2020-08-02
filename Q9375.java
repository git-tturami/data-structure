package datastructure2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Q9375 {
	static Scanner sc=new Scanner(System.in);
	
	public static void fashionmatch(){
		int n;
		int value;
		int index;
		int result;
		
		n=sc.nextInt();
		String input=sc.nextLine();
		ArrayList<String> wearname=new ArrayList<String>();
		ArrayList<Integer> wearamount=new ArrayList<Integer>();
		if(n<0 || n>30) {
			System.out.println("n is not available");
			System.exit(0);
		}
		
		for(int i=0;i<n;i++) {
			input=sc.nextLine();
			String[] wear=input.split(" ");
			if(!(wearname.isEmpty())&&wearname.contains(wear[1])) {
				index=wearname.indexOf(wear[1]);
				value=wearamount.get(index);
				wearamount.set(index, ++value);
				
			}
			else {
				value=1;
				wearname.add(wear[1]);
				wearamount.add(value);
			}
		}
		result=1;
		for(int i=0;i<wearamount.size();i++) {
			result=result*(wearamount.get(i)+1);
		}
		
		System.out.println(result-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=sc.nextInt();
		while(m!=0) {
			fashionmatch();
			m--;
		}
	
	

}


}
