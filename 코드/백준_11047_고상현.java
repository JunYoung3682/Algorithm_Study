import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T, A=0, B=0, C=0;
		T = sc.nextInt();
		
		sc.close();
		
		if(T>=300) {
			A = T/300;
			T = T%300;
		}
		if(T>=60) {
			B = T/60;
			T = T%60;
		}
		if(T/10 != 0) {
			System.out.println(-1);
		}
		if(T%10 == 0) {
			C = T/10;	
			System.out.println(A+" "+B+" "+C);
		}
	}
}
