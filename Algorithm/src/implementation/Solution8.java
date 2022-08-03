package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// baekjoon3048 개미

public class Solution8 {
	
	static class Ant {
		
		private int group;
		private char order;
		
		public Ant(int group, char order) {
			this.group = group;
			this.order = order;
		} // constructor
	} // end class:Ant
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		String ant1 = br.readLine();
		String ant2 = br.readLine();
		
		int time = Integer.parseInt(br.readLine());
		
		List<Ant> ants = new ArrayList<>();
		for(int i=ant1.length() - 1; i>=0; i--) {
			ants.add(new Ant(1, ant1.charAt(i)));
		} // for
		
		for(int i=0; i<ant2.length(); i++) {
			ants.add(new Ant(2, ant2.charAt(i)));
		} // for
		
		while(time-- > 0) {
			for(int i=1; i<ants.size(); i++) {
				Ant originAnt = ants.get(i-1);
				Ant nextAnt = ants.get(i);
				
				// 한쪽 방향에서만 고려하도록 조건 추가
				if(originAnt.group != 2 && originAnt.group != nextAnt.group) {
					// 그룹이 다르면 개미의 순서를 바꿔줌
					ants.set(i-1, nextAnt);
					ants.set(i, originAnt);
					
					// 변경 후엔 다시 변경이 일어나면 안되므로 건너뛰기
					i++;
				} // if
			} // for
			
		} // while
		
		ants.stream().
			map(t -> t.order).
			forEach(System.out::print);
	} // main
} // end class
