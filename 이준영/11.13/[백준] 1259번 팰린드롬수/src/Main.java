import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		while(true) {
			String str=sc.next();
			if(str.equals("0")) {
				System.exit(0);
			}
			boolean ans=true;
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
					ans=false;
				}
			}
			if(ans==true) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
