import java.util.*;
import java.io.*;

public class Main {

		public static void main(String[] args) throws IOException{
		
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			String s[]=(br.readLine()).split(" ");

			int Weight=Integer.parseInt(s[0]); //���� ������
			int BMR=Integer.parseInt(s[1]); //���� ���� ��緮
			int I=BMR; //���� ���뷮 
			int T=Integer.parseInt(s[2]); //��ĩ�� 
			
			s=(br.readLine()).split(" ");
			
			int Day=Integer.parseInt(s[0]); //���̾�Ʈ �Ⱓ 
			int AI=Integer.parseInt(s[1]); //�� ���뷮
			int Aa=Integer.parseInt(s[2]); //�� Ȱ���� 
			
			int change=0; //���� ��ȭ��
			int afterW=Weight; //��ȭ �� ������ 
 			
			//���� ��緮 ��ȭ x 
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