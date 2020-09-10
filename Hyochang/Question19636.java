import java.util.*;
import java.io.*;

public class Main {

		public static void main(String[] args) throws IOException{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			String s[]=(br.readLine()).split(" ");

			int W=Integer.parseInt(s[0]); //기존 몸무게
			int C=Integer.parseInt(s[1]); //기존 기초 대사량
			int B=C; //기존 섭취량 
			int T=Integer.parseInt(s[2]); //역칫값 
			
			String s2[]=(br.readLine()).split(" ");
			
			int D=Integer.parseInt(s2[0]); //다이어트 기간 
			int i=Integer.parseInt(s2[1]); //후 섭취량
			int a=Integer.parseInt(s2[2]); //후 활동량 
			
			int criteria; //최종 변화량
			int afterW=W; //변화 후 몸무게 
 			
			//기초 대사량 변화 x 
			criteria=(i-B-a);
			afterW+=criteria*D;
			
			if(afterW<=0)
				System.out.println("Danger Diet");
			
			else
				System.out.println(afterW+" "+B);

			afterW=W;
			criteria=(i-B-a);
			afterW+=criteria;	
										
				for(int k=1;k<D;k++) {
					
					if(Math.abs(criteria)>T) {
					
						if (criteria%2==0) {
							B=B+criteria/2;
						}
						else {
							B=B+criteria/2-1;
						}
						criteria=(i-B-a);
						afterW+=criteria;	
					}
					
					else {
						afterW+=criteria;
					}
					
				}	

				if(afterW<=0 || B<=0) 
					System.out.println("Danger Diet");

				else {
					if(C>B)
						System.out.println(afterW+" "+B+" YOYO");
			
					else
						System.out.println(afterW+" "+B+" NO");
			}
		
			br.close();
		}
				
}