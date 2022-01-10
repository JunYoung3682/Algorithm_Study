import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int count = 0; // 3이 있을 때마다 세기
      
      for(int i = 0; i < N+1; i++) { // 시간
         for(int j = 0; j < 60; j++) { // 분
            for(int k = 0; k < 60; k++) { // 초
               if(Integer.toString(i).contains("3")) {
                  count++;
                  continue;
               }
               else if(Integer.toString(j).contains("3")) {
                  count++;
                  continue;
               }
               else if(Integer.toString(k).contains("3")) {
                  count++;
                  continue;
               }
            }      
         }
      }
      System.out.println(count);
   }

}
