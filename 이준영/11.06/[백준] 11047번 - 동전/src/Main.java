import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt(); //전체 지폐 수
		int K=sc.nextInt(); // 구할 돈
		
		int coin[]=new int[N]; //지폐 리스트
		
		for(int i=0; i<N; i++) { //지폐 등록
			coin[i]=sc.nextInt();
		}
		int cnt=0;
		
		for(int i=N-1; i>=0; i--) { //큰 돈부터 비교
			if(coin[i]<=K) { 
				cnt+=K/coin[i]; 
				K%=coin[i];
			}
		}
		System.out.println(cnt); 
	}

}
