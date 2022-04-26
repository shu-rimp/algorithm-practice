package datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Programmers 위장

class Solution9 {
	
	int answer = 1;
	
	
    public int solution(String[][] clothes) {
        
        Map<String, Set<String>> cloth = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
        	cloth.put(clothes[i][1], new HashSet<>());
        } // for : 옷의 종류를 키로 담는다.
        
        for(int i=0; i<clothes.length; i++) {
        	cloth.get(clothes[i][1]).add(clothes[i][0]);
        } // for : 종류에 해당하는 이름을 값으로 담는다.
        
        Set<String> keySet = cloth.keySet();
        keySet.forEach((k) -> answer *= cloth.get(k).size() + 1);	// 옷을 선택하지 않았을 경우의 수 1을 더해줌
        
        return answer - 1;	// 모든 옷을 안입었을 경우의 수를 빼줌
    } // solution
} // end class
