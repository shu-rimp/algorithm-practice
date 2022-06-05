package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// baekjoon1920 수 찾기

public class Solution16 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 입력받고 배열 초기화
		int n = Integer.parseInt(br.readLine());
		int[] source = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			source[i] = Integer.parseInt(st.nextToken());
		} // for
		Arrays.sort(source); // 이분탐색은 정렬 해야 가능
		
		int m = Integer.parseInt(br.readLine());
		int[] find = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			find[i] = Integer.parseInt(st.nextToken());
		} // for
		
		// find배열을 순회하며 이분탐색한다.
		for(int num : find) {
			if(binarySearch(source, num)) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			} // if-else
		} // for
		
		System.out.println(sb.toString());
	} // main
	
	static boolean binarySearch(int[] source, int find) {
		int start = 0;
		int end = source.length - 1;
		
		// 시작값이 끝값보다 크기 전까지만 반복
		while(start <= end) {
			
			int mid = (start + end) / 2;	// 반으로 나눠서 탐색
			
			if(find < source[mid]) {
				end = mid - 1;	// 작을경우(왼편) 끝값을 조정
			} else if (find > source[mid]) {
				start = mid + 1;	// 클 경우(오른편) 시작값을 조정
			} else {
				return true;	// 일치한다 = 찾는 값이다
			} // else
		} // while
		
		return false;
	} // binarySearch
} // end class
