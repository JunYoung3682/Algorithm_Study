import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt(); //��ü ���� ��
		int K=sc.nextInt(); // ���� ��
		
		int coin[]=new int[N]; //���� ����Ʈ
		
		for(int i=0; i<N; i++) { //���� ���
			coin[i]=sc.nextInt();
		}
		int cnt=0;
		
		for(int i=N-1; i>=0; i--) { //ū ������ ��
			if(coin[i]<=K) { 
				cnt+=K/coin[i]; 
				K%=coin[i];
			}
		}
		System.out.println(cnt); 
	}

}
