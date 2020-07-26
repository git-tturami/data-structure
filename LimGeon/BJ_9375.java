import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BJ_9375 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // 테스트 케이스 입력
		for(int i=0; i<n; i++) { // 테스트 개수 만큼 반복
			Map<String, Integer> fashion = new HashMap<>(); // 테스트할 때마다 해쉬맵 새로 생성
			int m = sc.nextInt(); // 의상의 종류 개수 입력
			for(int j=0; j<m; j++) { // 의상의 종류 개수만큼 반복해서 입력
				String fName, fKind; // 의상의 이름, 의상의 종류
				fName = sc.next();
				fKind = sc.next();
				if(fashion.containsKey(fKind)) { //이미 의상의 종류가 있다면 기존 의상의 종류 개수에 +1 해서 replace한다.
					fashion.replace(fKind,fashion.get(fKind)+1);
				}
				else { // 없다면 {의상의 종류, 1}로 put
					fashion.put(fKind,1);
				}
			}
			int sum = 1; // 경우의 수를 저장할 변수
			for(String fNameKey : fashion.keySet()){
			    sum *= fashion.get(fNameKey)+1; // 의상의 종류별 개수를 곱해서 경우의 수 구하기
			}
			System.out.println(sum-1); // 알몸인 경우를 제외하기 위해 -1
		}
		
	}
}
