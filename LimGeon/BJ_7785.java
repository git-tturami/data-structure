import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BJ_7785 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> rollBook = new HashMap<>(); // �⼮�� �ؽ��� ����
		
		int n = sc.nextInt(); // ���� ����� �� �Է�
		for(int i=0; i<n; i++) { // ���� ����� ����ŭ �ݺ�
			String name, status; // ����� �̸�, enter or leave
			name = sc.next();
			status = sc.next();
			rollBook.put(name,status); // enter �Ǵ� leave�� �ֽ����� ����� �ż� �׳� put���� �ִ´�.
		}
		
		//TreeMap�� �̿��� ���� ����
		TreeMap<String,String> tm = new TreeMap<String,String>(rollBook);
		Iterator<String> iteratorKey = tm.descendingKeySet( ).iterator( );   //Ű�� �������� ����(�⺻)

		while(iteratorKey.hasNext()) {
		  String key = iteratorKey.next();
		  if(tm.get(key).equals("enter")) //enter�� ��쿡�� ���
			  System.out.println(key);
		 }
		
	}
}
