import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		int sum1=0;
		int sum2=0;
		for(int i=0; i<N.length()/2; i++) {
			sum1+=(int)(N.charAt(i))-'0';
		}
		for(int i=N.length()/2; i<N.length(); i++) {
			sum2+=(int)(N.charAt(i)-'0');
		}
		if(sum1==sum2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}

}
