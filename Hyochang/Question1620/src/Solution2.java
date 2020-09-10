import java.util.*;

public class Solution2 {
	
	public static void main(String[] args) {
		
		int n,m;
		int index=1;
		String name;
		String question;
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		while(!(n>=1&&n<=100000))
		{
			System.out.print("�ٽ� �Է��ϼ���");
			n=sc.nextInt();
		}
		
		m=sc.nextInt();
		while(!(m>=1&&n<=100000))
		{
			System.out.print("�ٽ� �Է��ϼ���");
			m=sc.nextInt();
		}
		
		sc.nextLine();
		
		Map<String,Integer> input_1=new HashMap<>();
		ArrayList<String> input_2=new ArrayList<>();
		ArrayList<String> output=new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			name=sc.nextLine();
			input_1.put(name,index);
			input_2.add(name);
			index++;
		}
		
		for(int i=0; i<m; i++)
		{
			question=sc.nextLine();
			try //���ڸ� 
			{
				int number=Integer.parseInt(question);
				output.add(input_2.get(number-1));
			}
			catch(NumberFormatException e) //���ڸ�
			{
				output.add(Integer.toString(input_1.get(question)));
			}
		}
		
		for(int i=0;i<output.size();i++)
		{
			System.out.println(output.get(i));
		}
		
		sc.close();
		
	}

}
