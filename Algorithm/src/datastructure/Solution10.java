package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Baekjoon10773 제로

public class Solution10 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> num = new Stack<>();
		int sum = 0;
		
		num.push(0);	// EmptyStackException 방지
		
		for(int i=0; i<k; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				num.pop();
			} else {
				num.push(n);
			} // if-else
		} // for
		
		for(int i : num) {
			sum += i;
		} // enhanced for
		
		System.out.println(sum);
	} // main

} // end class
