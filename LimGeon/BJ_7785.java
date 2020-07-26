import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BJ_7785 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> rollBook = new HashMap<>(); // 출석부 해쉬맵 생성
		
		int n = sc.nextInt(); // 출입 기록의 수 입력
		for(int i=0; i<n; i++) { // 출입 기록의 수만큼 반복
			String name, status; // 사람의 이름, enter or leave
			name = sc.next();
			status = sc.next();
			rollBook.put(name,status); // enter 또는 leave는 최신으로 덮어쓰면 돼서 그냥 put으로 넣는다.
		}
		
		//TreeMap을 이용한 역순 정렬
		TreeMap<String,String> tm = new TreeMap<String,String>(rollBook);
		Iterator<String> iteratorKey = tm.descendingKeySet( ).iterator( );   //키값 오름차순 정렬(기본)

		while(iteratorKey.hasNext()) {
		  String key = iteratorKey.next();
		  if(tm.get(key).equals("enter")) //enter인 경우에만 출력
			  System.out.println(key);
		 }
		
	}
}
