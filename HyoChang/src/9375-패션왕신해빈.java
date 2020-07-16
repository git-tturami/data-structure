import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		ArrayList<Integer> answer=new ArrayList<>();
		
		n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			
			int num;
			String name,type;
			HashMap<String,Integer> cloMap=new HashMap<>();
			
			num=sc.nextInt();
			sc.nextLine();
			
			for(int j=0;j<num;j++)
			{
				name=sc.nextLine();
				type=name.split(" ")[1];
				
				if(cloMap.containsKey(type))
				{
					cloMap.put(type, cloMap.get(type)+1);
				}
				else 
				{
				cloMap.put(type, 1);
				}
				
			}
			
			int total=1;
			for(int y:cloMap.values())
			{
				total*=y+1;
			}
			answer.add(total-1);
		}		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(answer.get(i));
		}
		
		sc.close();
	}
}
