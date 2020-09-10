import java.util.*;
import java.io.*;

public class Main {

		public static void main(String[] args) throws IOException{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			String s[]=(br.readLine()).split(" ");

			int Weight=Integer.parseInt(s[0]); //기존 몸무게
			int BMR=Integer.parseInt(s[1]); //기존 기초 대사량
			int I=BMR; //기존 섭취량 
			int T=Integer.parseInt(s[2]); //역칫값 
			
			s=(br.readLine()).split(" ");
			
			int Day=Integer.parseInt(s[0]); //다이어트 기간 
			int AI=Integer.parseInt(s[1]); //후 섭취량
			int Aa=Integer.parseInt(s[2]); //후 활동량 
			
			int change=0; //최종 변화량
			int afterW=Weight; //변화 후 몸무게 
 			
			//기초 대사량 변화 x 
			change=(AI-BMR-Aa);
			afterW+=change*Day;
			
			if(afterW<=0)
				System.out.println("Danger Diet");
			
			else
				System.out.println(afterW+" "+BMR);

			afterW=Weight;
				
				for(int k=0;k<Day;k++) {
					
					change=AI-BMR-Aa;
					
					if(Math.abs(change)>T) {
					
						if (change%2==0) {
							BMR=BMR+change/2;
						}
						else {
							BMR=BMR+(change/2)-1;
						}
						
						afterW+=change;	
					}
					
					else {
						afterW+=change;
					}
					
				}	

				if(afterW<=0 || BMR<=0) 
					System.out.println("Danger Diet");

				else {
					if(I>BMR)
						System.out.println(afterW+" "+BMR+" YOYO");
			
					else
						System.out.println(afterW+" "+BMR+" NO");
			}
		
			br.close();
		}
				
}