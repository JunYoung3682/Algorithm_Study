import java.util.Scanner;

public class main {
	static int N =0;
    static int M =0;
    static int[][] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int ans=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(arr[i][j]==0) {
					dfs(i,j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
	static boolean dfs(int x,int y) {
		if(x <= -1 || x>= N || y <= -1 || y >= M)
            return false;
		if(arr[x][y] == 0){
            arr[x][y] = 1;
            dfs(x -1, y);
            dfs(x, y -1);
            dfs(x + 1, y );
            dfs(x, y + 1);
            return true;
        }
        return false;
	}
}
