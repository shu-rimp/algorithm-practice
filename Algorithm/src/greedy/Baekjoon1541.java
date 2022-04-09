package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1541 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// "-"를 기준으로 분리
		StringTokenizer stBysub = new StringTokenizer(br.readLine(), "-");
		
		int add = 0;
		// 문제조건에서 5자리 이상의 숫자는 없다는 것을 이용
		int result = 100000;
		
		while(stBysub.hasMoreTokens()) {	// hasMoreTokens() : 토큰이 있으면 true 반환
			add = 0;		// add 값 초기화
			
			// 나뉜 토큰에서 "+"를 기준으로 분리
			StringTokenizer stByadd = new StringTokenizer(stBysub.nextToken(), "+");
			
			// +로 연결된 정수값 모두 더함
			while(stByadd.hasMoreTokens()) {
				add += Integer.parseInt(stByadd.nextToken());
			} // while
			
			if(result == 100000) {
				result = add;	// 초기값을 설정
			} else {
				result -= add;	// 초기값 이후에는 더한 값들을 뺀다.
			} // if-else
			
		} // while
		
		System.out.println(result);
		
	} // main

} // end class
