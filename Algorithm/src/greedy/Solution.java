package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// baekjoon1026 보물

public class Solution {
	
	
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;
		
		int n = Integer.parseInt(br.readLine());
		
		int[]a = new int[n];
		List<Integer> b = new LinkedList<>();
		
		st1 = new StringTokenizer(br.readLine(), " ");
		st2 = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st1.nextToken());
			b.add(Integer.parseInt(st2.nextToken()));
		} // for
		
		Arrays.sort(a);
		
		int max;
		int result = 0;
		
		for(int a1 : a) {
			
			max = Collections.max(b);
			result += a1 * max;
			b.remove(b.indexOf(max));
		} // for
		
		System.out.println(result);
	} // main

} // end class
