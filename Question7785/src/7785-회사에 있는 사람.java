import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int n=0;
		
		if(count==0) {
			n=Integer.parseInt(bf.readLine());
			count++;
		}
		
		HashMap<String,String> people=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			
			String[] s=bf.readLine().split(" ");
			
			if(s[1].equals("leave"))
			{
				
				people.remove(s[0]);
				
			}
			
			else {
				
			people.put(s[0], s[1]);
			
			}
		}
		
		 TreeMap<String, String> remainPeoples = new TreeMap<String, String>(Collections.reverseOrder());
		 remainPeoples.putAll(people);
	 
	     Iterator<String> remainPeoplesIter = remainPeoples.keySet().iterator();
	     
	     while( remainPeoplesIter.hasNext()) {
	    	 
	            String key = remainPeoplesIter.next();
	            
	            System.out.println(key);
	 
	     }

		bf.close();
	}

}
