package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// baekjoon1339 단어 수학

public class Solution2 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] word = new String[n];
		int[] alphaCount = new int[26];		// 알파벳 크기만큼의 배열 생성
		
		for(int i=0; i<word.length; i++) {
			word[i] = br.readLine();
		} // for
		
		br.close();
		
		for(int i=0; i<word.length; i++) {
			
			int temp = (int)Math.pow(10, word[i].length() - 1);	// 10의 거듭제곱
			
			for(int j=0; j<word[i].length(); j++) {
				alphaCount[word[i].charAt(j) - 65] += temp;
				
				temp /= 10;
			} // for
		} // for
		
		Arrays.sort(alphaCount);
		
		int num = 9;
		int answer = 0;
		for(int i=alphaCount.length - 1; i>=0; i--) {	// 오름차순 정렬이므로, 배열의 끝부터 반복 시작
			
			if(alphaCount[i] == 0) {	// 0 : 들어온 알파벳이 없음 -> break
				break;
			} // if
			
			answer += num * alphaCount[i];
			
			num--;
		} // for
		
		System.out.println(answer);
	} // main

} // end class
