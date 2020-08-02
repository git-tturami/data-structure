import java.util.Scanner;
import java.util.ArrayList;

public class BJ1620_List {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> pokeList = new ArrayList<>(); //m���� ���ϸ� �̸��� ���� ArrayList
		
		//�Է�
		int m, n; //m:���ϸ� �̸� ����, n:���� ����
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<m; i++) {
			String pokename = sc.nextLine();
			pokeList.add(pokename);
		}
		
		// ���� �Է�, ó�� �� ���
		for(int i=0; i<n; i++) {
			String problem = sc.nextLine();
			if('0'<=problem.charAt(0) && problem.charAt(0)<='9') //������ ������ ���
				System.out.println(pokeList.get(Integer.parseInt(problem)-1)); //�ش� �ε����� ���ϸ� �̸� ���
			else { //������ ���ϸ� �̸��� ���
				System.out.println(pokeList.indexOf(problem)+1); //�ش� ���ϸ� �̸��� �ε��� ���
			}
		}
	}
}
