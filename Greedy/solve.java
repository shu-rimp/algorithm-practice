import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class solve {
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] time = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		} // for

		Arrays.sort(time, (o1, o2) -> {
			
			// 끝나는 시간을 기준으로 오름차순 정렬을 수행하되,
			// 끝나는 시간이 같다면 시작시간을 기준으로 오름차순 정렬 수행하도록 compare메소드 재정의
			if(o1[1] == o2[1]) {			
				return o1[0] - o2[0];
			} // if
			
			return o1[1] - o2[1];
		});
		
		int count = 0;
		int endTime = 0;
		
		for(int i=0; i<n; i++) {
			
			if(endTime <= time[i][0]) {
				endTime = time[i][1];
				count++;
			} // if
		} // for
		
		System.out.println(count);
		
	} // main

} // end class
