package strings;

import java.util.ArrayList;
import java.util.List;

// Programmers [1차]뉴스 클러스터링
class Solution7 {
	
	
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // 두 문자열이 같으면 유사도 = 1
        if(str1.equals(str2)) return 65536;
        
        String[] strSet1 = getStrSet(str1);
        String[] strSet2 = getStrSet(str2);
        
        List<String> newstr1 = getNewStrSet(strSet1);
        List<String> newstr2 = getNewStrSet(strSet2);
        
        int cross = 0;	// 교집합 원소개수
        int union = 0;	// 합집합 원소개수
        for(int i=0; i<newstr1.size(); i++) {
        	if(newstr2.contains(newstr1.get(i))) {
        		cross++;
        		
        		newstr2.remove(newstr1.get(i));
        	} // if
        } // for
        
        // for에서 중복을 이미 remove 했기 때문에 교집합 갯수 뺄 필요 X
        union = newstr1.size() + newstr2.size();	
        
        double jakads = (double)cross / union;
        answer = (int)(jakads * 65536);
        
        return answer;
    } // solution
    
    private static String[] getStrSet(String str) {
    	String[] strSet = new String[str.length() - 1];
    	
    	 for(int i=0; i<str.length() - 1; i++) {
         	String sub = str.substring(i, i+2);
         	strSet[i] = sub;
         } // for
         
         for(int i=0; i<strSet.length; i++) {
         	for(char ch : strSet[i].toCharArray()) {
         		if( !(97 <= ch && ch <= 122) ) {
         			strSet[i] = "";
         			
         			break;
         		} // if
         	} // enhanced for
         } // for
         
         return strSet;
    } // getStrSet
    
    private static List<String> getNewStrSet(String[] strSet) {
    	List<String> newstr = new ArrayList<>();
    	
    	for(int i=0; i<strSet.length; i++) {
        	if(strSet[i] == "") {
        		continue;
        	} // if
        	
        	newstr.add(strSet[i]);
        } // for
    	
    	return newstr;
    } // getNewStrSet
} // end class
