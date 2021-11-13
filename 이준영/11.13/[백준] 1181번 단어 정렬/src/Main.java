import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); //�Է� ���� �ܾ��� �� N �Է� 
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<N; i++) {
			String str=sc.next();
			if (list.contains(str)!=true) // ArrayList���� contains�޼ҵ带 ���� �ߺ����� ���ؼ� add
 				list.add(str);
		}
		List<String> sortedList = new ArrayList<>(list); //���� ����Ʈ�� �������
		Comparator<String> c = new Comparator<String>() { //�⺻���� ���� �ڵ�
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(),s2.length()); //�濡 ���� ���� �������� ����
				} 
			};
			Collections.sort(sortedList, c); 
		
		for(String i : sortedList) {
			System.out.println(i);
		}
	}
}
