package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Baekjoon9012 괄호

public class Solution11 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			Stack<Character> vps = new Stack<>();
			String str = br.readLine();
			char[] vpsArr = str.toCharArray();
			
			for(int j=0; j<vpsArr.length; j++) {
				
				if(vps.isEmpty()) {
					vps.push(vpsArr[j]);
					
					continue;
				} // if
				
				if(vps.peek() == '(' && vpsArr[j] == ')') {
					vps.pop();
				} else {
					vps.push(vpsArr[j]);
				} // if-else
				
			} // for
			
			if(vps.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			} // if-else
			
		} // for
	} // main
} // end class
