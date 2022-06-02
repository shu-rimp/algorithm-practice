package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// codeforces #784(Div.4) B.Triple

public class Solution5_2 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());	// test case
		
		for(int i=0; i<n; i++) {
			
			int length = Integer.parseInt(br.readLine());	// 배열의 길이
			Map<Integer, Integer> tree = new HashMap<>();	// 키: 원소 / 값: 카운트
			boolean notIn = true;	// 3회 이상인 원소가 없을 때
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<length; j++) {
				int count = 1;
				
				int key = Integer.parseInt(st.nextToken());
				// 맵에 키가 이미 있는경우,
				// 키에 해당하는 값을 받아서 1 증가한 후 다시 맵에 넣어줌
				if(tree.containsKey(key)) {
					count = tree.get(key);
					count++;
				} // if
				
				tree.put(key, count);
			} // for
			
			// 카운트가 3 이상인 키를 찾는다.
			for(int keys : tree.keySet()) {
				if(tree.get(keys) >= 3) {
					sb.append(keys).append("\n");
					notIn = false;
					
					break;
				} // if
			} // for
			
			// 3 이상인 원소가 없으면 -1출력
			if(notIn) {
				sb.append(-1).append("\n");
			} // if
			
		} // for
		
		System.out.println(sb.toString());
	} // main
} // end class
