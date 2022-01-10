package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		int person[] = new int[N]; // 각 사람이 인출하는데 걸리는 시간
		int time[] = new int[N]; // 사람별 누적 시간
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			person[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(person);
		time[0] = person[0];
		
		for(int i = 1; i < N; i++) {
			time[i] += time[i-1] + person[i];
		}
		for(int i = 0; i < N; i++) {
			sum += time[i];
		}
		
		System.out.println(sum);
	}

}
