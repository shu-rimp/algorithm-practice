package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// baekjoon10816 숫자 카드 2

public class Solution17 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 입력 받고 배열 초기화
		int n = Integer.parseInt(br.readLine());
		int[] cards = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		} // for
		Arrays.sort(cards);
		
		int m = Integer.parseInt(br.readLine());
		
		// 상한인덱스 - 하한인덱스 = 중복의 갯수
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int find = Integer.parseInt(st.nextToken());
			int answer = upperBound(cards, find) - lowerBound(cards, find);
			
			sb.append(answer).append(" ");
		} // for
		
		System.out.println(sb.toString());
	} // main
	
	static int upperBound(int[] arr, int find) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			
			if(find < arr[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			} // if-else
		} // while
		
		return start;
	} // upperBound
	
	static int lowerBound(int[] arr, int find) {
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			
			if(find <= arr[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			} // if-else
		} // while
		
		return start;
	} // lowerBound
} // end class
