import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> queue=new LinkedList<>();
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			
			String[] input=br.readLine().split(" ");
			String[] priority=br.readLine().split(" ");
			
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			int count=0;
			
			queue.clear();
			
			for(int j=0;j<N;j++) {
				queue.add(Integer.parseInt(priority[j]));
			}
			
			while(!queue.isEmpty()) {
				
				boolean first=true;
				
				for(int k=1;k<queue.size();k++) {
					
					if(queue.peek()<queue.get(k)) {
						first=false;
						break;
					}
				}
				
				if(first) {
					count++;
					queue.poll();
					
					if(M==0)
						break;
					else
						M--;
				}
				
				else {
					int temp=queue.poll();
					queue.add(temp);
					M= (M==0) ? queue.size()-1:--M;
				}
			}
			System.out.println(count);
		}
		br.close();
	}

}
