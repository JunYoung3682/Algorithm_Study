import java.io.IOException;
import java.util.Scanner;

public class main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String n = sc.next(); // 문자열 입력
      
      int x = n.charAt(0) - 96; // 현재 나이트의 x 위치
      int y = n.charAt(1)-48; // 현재 나이트의 y 위치
      int nx = 0,ny =0;
      
      int dx[] = { 2, 2, -2, -2,-1, 1, -1, 1};
      int dy[] = {-1, 1, -1,  1, 2, 2, -2,-2};
      
      int count=0;
      
         for(int i = 0; i < dy.length; i++) {
        	 if(x + dx[i] < 1 || x + dx[i] > 8 || y + dy[i] < 1 || y + dy[i] > 8) {
        		 continue;
        	 } else {
        		 count++;
        	 }
         
      }
      System.out.print(count);
   }

}
