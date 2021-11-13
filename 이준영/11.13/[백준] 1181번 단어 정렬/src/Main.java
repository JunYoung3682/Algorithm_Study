import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); //입력 받을 단어의 수 N 입력 
		
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<N; i++) {
			String str=sc.next();
			if (list.contains(str)!=true) // ArrayList에서 contains메소드를 통해 중복값을 피해서 add
 				list.add(str);
		}
		List<String> sortedList = new ArrayList<>(list); //정렬 리스트를 만들어줌
		Comparator<String> c = new Comparator<String>() { //기본적인 정렬 코드
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(),s2.length()); //길에 따라 오름 내림차순 결정
				} 
			};
			Collections.sort(sortedList, c); 
		
		for(String i : sortedList) {
			System.out.println(i);
		}
	}
}
