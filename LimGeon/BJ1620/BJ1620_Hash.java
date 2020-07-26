import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BJ1620_Hash {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> pokeHash = new HashMap<>(); //포켓몬 이름과 인덱스를 담을 HashMap
		
		//입력
		int m, n; //m:포켓몬 이름 개수, n:문제 개수
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<m; i++) {
			String pokename = sc.nextLine();
			pokeHash.put(i+1, pokename);
		}
		
		for(int i=0; i<n; i++) {
			String problem = sc.nextLine();
			if('0'<=problem.charAt(0) && problem.charAt(0)<='9') //문제가 숫자일 경우
				System.out.println(pokeHash.get(Integer.parseInt(problem))); // 해당 Index(=key)의 포켓몬 이름 출력
			else { //문제가 포켓몬 이름일 경우
				System.out.println(getKey(pokeHash, problem)); // 주어진 value 값을 가지고 있는 Index(=key)를 찾는 함수 호출
			}
		}
	}
	
	//value 값이 주어졌을 때 key 값을 찾는 함수
	public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) { 
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
