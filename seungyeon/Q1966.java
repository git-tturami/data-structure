package datastructure3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
 
public class Q1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
   
        
        for(int n=0 ; n<T ; n++){
            String[] input = reader.readLine().split(" ");
            String[] priority = reader.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int count = 0;
            queue.clear(); 
            
            for(int i=0 ; i<N ; i++)
                queue.add(Integer.parseInt(priority[i])); 
            
            while(!queue.isEmpty()){
                boolean isPriority = true;
                
                for(int i=1 ; i<queue.size() ; i++){ 
                    if(queue.peek() < queue.get(i)){
                        isPriority = false;
                        break;
                    }
                }
                
                if(isPriority){
                    count++;
                    queue.poll();
                    
                    if(M == 0)
                        break;
                    else 
                        M -= 1;
                }
                else { 
                    int temp = queue.poll();
                    queue.add(temp);
                    M = (M==0) ? queue.size()-1 : --M;
                }
            }
            System.out.println(count);
           
        }
     
    }
}
