package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon1543 문서 검색

public class Solution2 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text = br.readLine();
		String word = br.readLine();
		
		br.close();
		
		String temp = "";
		int count = 0;
		
		for(int i=0; i<text.length(); i++) {
			
			temp += text.charAt(i);
			
			if(temp.contains(word)) {
				count++;
				
				temp = "";
			} // if
			
		} // for
		
		System.out.println(count);
		
	} // main

} // end class
