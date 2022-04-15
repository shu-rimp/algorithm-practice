package strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

// baekjoon15904 UCPC는 무엇의 약자일까?

public class Solution3 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		br.close();
		
		List<Character> list = new LinkedList<>();
		
		for(int i=0; i < input.length(); i++) {
			list.add(input.charAt(i));
		} // for
		
		int isvalid = 0;
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i) == 'U' & isvalid == 0) isvalid = 1;
			if(list.get(i) == 'C' & isvalid == 1) isvalid = 2;
			if(list.get(i) == 'P' & isvalid == 2) isvalid = 3;
			if(list.get(i) == 'C' & isvalid == 3) isvalid = 4;
			
		} // enhanced for
		
		if(isvalid == 4) {
			bw.write("I love UCPC\n");
			bw.flush();
		} else {
			bw.write("I hate UCPC\n");
			bw.flush();
		} // if-else
		
		bw.close();
		
	} // main

} // end class
