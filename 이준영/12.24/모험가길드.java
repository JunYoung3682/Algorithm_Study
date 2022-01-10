import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<Integer> iarr = new ArrayList<Integer>();
		ArrayList<Character> carr = new ArrayList<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>48 &&str.charAt(i)<58) {
				iarr.add((int)str.charAt(i));
			} else {
				carr.add(str.charAt(i));
			}
		}
		iarr.sort(null);
		carr.sort(null);
		for(int i=0; i<carr.size(); i++) {
			System.out.print(carr.get(i));
		}
		int sum=0;
		for(int i=0; i<iarr.size(); i++) {
			sum+=(iarr.get(i)-'0');
		}
		System.out.println(sum);
	}

}
