import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BJ_9375 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  // �׽�Ʈ ���̽� �Է�
		for(int i=0; i<n; i++) { // �׽�Ʈ ���� ��ŭ �ݺ�
			Map<String, Integer> fashion = new HashMap<>(); // �׽�Ʈ�� ������ �ؽ��� ���� ����
			int m = sc.nextInt(); // �ǻ��� ���� ���� �Է�
			for(int j=0; j<m; j++) { // �ǻ��� ���� ������ŭ �ݺ��ؼ� �Է�
				String fName, fKind; // �ǻ��� �̸�, �ǻ��� ����
				fName = sc.next();
				fKind = sc.next();
				if(fashion.containsKey(fKind)) { //�̹� �ǻ��� ������ �ִٸ� ���� �ǻ��� ���� ������ +1 �ؼ� replace�Ѵ�.
					fashion.replace(fKind,fashion.get(fKind)+1);
				}
				else { // ���ٸ� {�ǻ��� ����, 1}�� put
					fashion.put(fKind,1);
				}
			}
			int sum = 1; // ����� ���� ������ ����
			for(String fNameKey : fashion.keySet()){
			    sum *= fashion.get(fNameKey)+1; // �ǻ��� ������ ������ ���ؼ� ����� �� ���ϱ�
			}
			System.out.println(sum-1); // �˸��� ��츦 �����ϱ� ���� -1
		}
		
	}
}
