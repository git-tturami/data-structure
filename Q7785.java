package datastructure2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q7785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		String input=sc.nextLine();
		
		for(int i=0;i<n;i++) {
			input=sc.nextLine();
			String[] tokens=input.split(" ");
			if(!(hashmap.isEmpty())&&(hashmap.containsKey(tokens[0]))) {
				if(tokens[1].equals("enter")) {
					hashmap.replace(tokens[0], 1);
				}
				else {
					hashmap.remove(tokens[0]);
				}
			}
			else {
				if(hashmap.isEmpty()||tokens[1].equals("enter")) {
					hashmap.put(tokens[0], 1);
				}
				else {
					hashmap.remove(tokens[0]);
				}
			}
			
		}
		Set<String> set=hashmap.keySet();
		ArrayList<String> result=new ArrayList(set);
		Collections.sort(result);
		int i=result.size()-1;
		while(i>=0) {
			System.out.println(result.get(i--));
		}
	}

}
