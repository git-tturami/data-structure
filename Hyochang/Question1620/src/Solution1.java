import java.util.*;

public class Solution1 {
	
	public static void main(String[] args) {
		
		int n,m;
		int count=0;
		String name;
		String question;
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		while(!(n>=1&&n<=100000))
		{
			System.out.print("다시 입력하세요");
			n=sc.nextInt();
		}
		
		m=sc.nextInt();
		while(!(m>=1&&n<=100000))
		{
			System.out.print("다시 입력하세요");
			m=sc.nextInt();
		}
		
		sc.nextLine();
		
		ArrayList<String> input=new ArrayList<String>();
		ArrayList<String> output=new ArrayList<String>();
		ArrayList<String> answer=new ArrayList<String>();
		
		
		for(int i=0; i<n; i++)
		{
			name=sc.nextLine();
			input.add(name);
		}
		
		for(int i=0; i<m; i++)
		{
			question=sc.nextLine();
			output.add(question);
		}
				
		for(int i=0;i<m;i++) {
			
		try
		{
			int index=Integer.parseInt(output.get(count));
			answer.add(input.get(index-1));
			count++;
		}
		
		catch(NumberFormatException e)
		{
			String find=output.get(count);
			answer.add(Integer.toString(input.indexOf(find)+1));
			count++;
		}
		
		}
		
		for(int i=0; i<answer.size(); i++)
		{
			System.out.println(answer.get(i));
		}
		
		sc.close();

	}

}
