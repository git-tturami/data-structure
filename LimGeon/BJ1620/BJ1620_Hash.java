import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BJ1620_Hash {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> pokeHash = new HashMap<>(); //���ϸ� �̸��� �ε����� ���� HashMap
		
		//�Է�
		int m, n; //m:���ϸ� �̸� ����, n:���� ����
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<m; i++) {
			String pokename = sc.nextLine();
			pokeHash.put(i+1, pokename);
		}
		
		for(int i=0; i<n; i++) {
			String problem = sc.nextLine();
			if('0'<=problem.charAt(0) && problem.charAt(0)<='9') //������ ������ ���
				System.out.println(pokeHash.get(Integer.parseInt(problem))); // �ش� Index(=key)�� ���ϸ� �̸� ���
			else { //������ ���ϸ� �̸��� ���
				System.out.println(getKey(pokeHash, problem)); // �־��� value ���� ������ �ִ� Index(=key)�� ã�� �Լ� ȣ��
			}
		}
	}
	
	//value ���� �־����� �� key ���� ã�� �Լ�
	public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) { 
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
