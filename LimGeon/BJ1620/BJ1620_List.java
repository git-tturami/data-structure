import java.util.Scanner;
import java.util.ArrayList;

public class BJ1620_List {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> pokeList = new ArrayList<>(); //m개의 포켓몬 이름을 담을 ArrayList
		
		//입력
		int m, n; //m:포켓몬 이름 개수, n:문제 개수
		m = sc.nextInt();
		n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<m; i++) {
			String pokename = sc.nextLine();
			pokeList.add(pokename);
		}
		
		// 문제 입력, 처리 및 출력
		for(int i=0; i<n; i++) {
			String problem = sc.nextLine();
			if('0'<=problem.charAt(0) && problem.charAt(0)<='9') //문제가 숫자일 경우
				System.out.println(pokeList.get(Integer.parseInt(problem)-1)); //해당 인덱스의 포켓몬 이름 출력
			else { //문제가 포켓몬 이름일 경우
				System.out.println(pokeList.indexOf(problem)+1); //해당 포켓몬 이름의 인덱스 출력
			}
		}
	}
}
