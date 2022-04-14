package implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Baekjoon17478 재귀함수가 뭔가요?

public class Solution {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String dash = "";
	static final String QUOTES = "\"";
	static final String LF = "\n";
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다." + LF);
		recursion(n);
		recursion2(n);
	} // main
	
	
	static void recursion(int n) throws Exception {
		
		bw.write(dash + QUOTES + "재귀함수가 뭔가요?" + QUOTES + LF);
		
		if(n == 0) {
			bw.write(dash + QUOTES + "재귀함수는 자기 자신을 호출하는 함수라네" + QUOTES + LF);
			bw.write(dash + "라고 답변하였지." + LF);
			
			bw.flush();
			
			return;
		} // if
		
		bw.write(dash + QUOTES + "잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." + LF);
		bw.write(dash + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." + LF);
		bw.write(dash + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어." + QUOTES + LF);
		
		bw.flush();
		dash += "____";
		
		recursion(n-1);
		
	} // recursion
	
	static void recursion2(int n) throws Exception {
		
		if(n == 0) {
			return;
		} // if
		
		dash = dash.substring(0, 4 * (n-1));
		bw.write(dash + "라고 답변하였지." + LF);
		
		bw.flush();
		
		recursion2(n-1);
	} // recursion2

} // end class
