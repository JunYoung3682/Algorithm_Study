import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int x = 1, y = 1; // 초기 값
      int nx = -1, ny = -1; // 값 초기화
      
      String s[] = br.readLine().split(" ");
      String move_types[] = {"L", "R", "U", "D"};
      
      int dx[] = {0, 0, -1, 1};
      int dy[] = {-1, 1, 0, 0};
      
      for(int i = 0; i < s.length; i++) {
         for(int j = 0; j < move_types.length; j++) {
            if(s[i].equals(move_types[j])) {
               nx = x + dx[j];
               ny = y + dy[j];
            }
         }
         if(nx < 1 || ny < 1 || nx > N || ny > N) {
            continue;
         }
         x = nx;
         y = ny;
      }
      System.out.printf("%d, %d\n", x,  y);
   }

}
