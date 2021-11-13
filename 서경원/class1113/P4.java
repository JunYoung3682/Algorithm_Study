package class1113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String st = br.readLine();
			boolean bo = true;
			if(st.length() == 1) {
			} else {
				for(int i = 0; i < (int)st.length()/2; i++) {
					if(st.charAt(i) != st.charAt(st.length()-i-1)) {
						bo = false;
					}
				}
			}
			if(st.equals("0")) {
				break;
			} else {
				if(bo) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}

}
