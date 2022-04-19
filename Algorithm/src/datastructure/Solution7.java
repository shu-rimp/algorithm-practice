package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Programmers 오픈채팅방

public class Solution7 {

	
    public String[] solution(String[] record) {
        String[] answer = {};
        
        List<String> result = new ArrayList<>();
        Map<String, String> userId = new HashMap<>();
        
        String[] split;
        for(int i=0; i<record.length; i++) {
        	split = record[i].split(" ");
        	
        	if(split.length == 3) {
        		userId.put(split[1], split[2]);
        	} // if
        } // for
        
        for(int i=0; i<record.length; i++) {
        	split = record[i].split(" ");
        	
        	switch(split[0]) {
        	
	        	case "Enter" -> result.add(userId.get(split[1]) + "님이 들어왔습니다.");
	        	case "Leave" -> result.add(userId.get(split[1]) + "님이 나갔습니다.");
        	} // switch
        } // for
        
        answer = result.toArray(answer);
        return answer;
    } // solution

} // end class
