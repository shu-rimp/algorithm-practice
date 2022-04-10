package datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// 프로그래머스 신고 결과 받기

public class Solution {
	
	// 메일 발송 조건 : 내가 신고한 유저가 정지되었을 때.
    public int[] solution(String[] id_list, String[] report, int k) {
    	
    	int[] answer = new int[id_list.length];
    	
    	// ID별로 신고한 사람의 id list를 받는 map객체 생성
    	// 중복을 제거하기 위해 hashSet 사용.
    	Map<String, HashSet<String>> reporterID = new HashMap<>();
    	
    	// ID_list의 인덱스를 이용하기 위한 map객체.
    	Map<String, Integer> mailCounter = new HashMap<>();
    	
    	for(int i=0; i<id_list.length; i++) {
    		
    		reporterID.put(id_list[i], new HashSet<>());
    		
    		// id_list의 인덱스 번호를 저장한다.
    		mailCounter.put(id_list[i], i);
    		
    	} // for
    	
    	for(String id : report) {
    		
    		String[] str = id.split(" ");
    		String reporter = str[0];
    		String reported = str[1];
    		
    		// reported를 key로 갖는 value에 reporter를 저장.
    		reporterID.get(reported).add(reporter);
    		
    	} // enhanced for
    	
    	for(int i=0; i<id_list.length; i++) {
    		HashSet<String> count = reporterID.get(id_list[i]);
    		
    		// 해당 유저를 신고한 사람이 k이상일 때,
    		if(count.size() >= k) {
    			
    			for(String name : count) {
    				
    				// mailCounter를 이용, 해당 이름이 들어있는 인덱스번호에 1씩 증가.
    				answer[mailCounter.get(name)]++;
    			} // enhanced for
    			
    		} // if
    		
    	} // for
    	
        return answer;
    } // solution

} // end class

