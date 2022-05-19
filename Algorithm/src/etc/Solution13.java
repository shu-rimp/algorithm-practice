package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// baekjoon 18870 좌표압축

public class Solution13 {
	
	static int i = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> xy = new ArrayList<>();		// 원본배열
		List<Integer> newxy = new ArrayList<>();	// 정렬배열
		Map<Integer, Integer> zip = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			xy.add(Integer.parseInt(st.nextToken()));
		} // for
		
		// 배열 복사
		xy.forEach((t) -> {
			newxy.add(t);
		});
		
		Collections.sort(newxy);
		
		// 압축 배열에 인덱스 저장
		newxy.forEach((t) -> {
			if(!zip.containsKey(t)) {
				zip.put(t, i);
				
				i++;
			} // if
		});
		
		// 원본배열에서 키 찾기
		xy.forEach((t) -> sb.append(zip.get(t)).append(" "));
		
		System.out.println(sb.toString());
	} // main

} // end class
