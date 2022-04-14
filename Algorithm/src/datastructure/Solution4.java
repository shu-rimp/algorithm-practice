package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Programmers 베스트 앨범

public class Solution4 {
	
	
    public int[] solution(String[] genres, int[] plays) {
        
    	// 1. songs : 키=장르, 값=플레이 카운트 저장
    	// 2. playsIdx : 키=플레이횟수, 값=인덱스 번호 저장
    	// (2.는 answer에 노래의 고유번호를 return하기 위한 맵객체이다.)
        Map<String, LinkedList<Integer>> songs = new HashMap<>();
        Map<Integer, LinkedList<Integer>> playsIdx = new HashMap<>();
        
        // for1, for2 : 위에 선언했던 대로 값을 저장하는 코드.
        for(int i=0; i<genres.length; i++) {
        	
        	songs.put(genres[i], new LinkedList<>());
        	playsIdx.put(plays[i], new LinkedList<>());
        } // for 1
        
        for(int i=0; i<genres.length; i++) {
        	
        	songs.get(genres[i]).add(plays[i]);
        	playsIdx.get(plays[i]).add(i);
        } // for 2
        
        // songs의 값을 내림차순으로 정렬.
        Set<String> songNameSet = songs.keySet();
        songNameSet.forEach(t -> Collections.sort(songs.get(t), Collections.reverseOrder()));
        
        // 장르 별 총 재생횟수를 비교하기 위해, 장르 별로 플레이 횟수를 모두 더한 값을
        // 맵 객체로 저장한다.
        Map<String, Integer> playCount = new HashMap<>();
        
        for(String str : songs.keySet()) {
        	playCount.put(str, playCounter(songs.get(str)));
        } // enhanced for
        
        // 총 재생횟수를 더한 맵객체를 값을 기준으로 내림차순으로 정렬한다.
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(playCount.entrySet());
        entryList.sort(((o1, o2) -> playCount.get(o2.getKey()) - playCount.get(o1.getKey())));
        
        // answer의 크기를 결정하기 위한 코드.
        // 장르 별로 두 개씩 뽑기 때문에 장르마다 2씩 자리를 추가한다.
        // 노래가 하나일 경우엔 1 추가한다.
        int answerSize = 0;
        for(int i=0; i<entryList.size(); i++) {
        	String s = entryList.get(i).getKey();
        	
        	if ( songs.get(s).size() == 1 ) {
        		answerSize ++;
        		
        		continue;
        	} // if
        	
        	answerSize += 2;
        } // for
        
        int[] answer = new int[answerSize];
        
        // 정렬된 entryList에서 장르 이름을 뽑아
        // songs의 키로 넣어주고, 가장 첫번째 원소를 뽑는다.
        // 뽑은 원소(플레이 횟수)를 playsIdx의 키로 넣어주고, 가장 첫번째 원소를 뽑는다.
        // answer에 차례로 저장한다.
        // 두 개씩만 뽑으면 되니 두번씩 반복하고, 노래가 하나일 경우 한번만 저장하는 코드를
        // 넣어준다.(if문)
        int j = 0;
        
        for (int i=0; i<entryList.size(); i++) {
        	String s = entryList.get(i).getKey();
        	
        	if( songs.get(s).size() == 1) {
        		answer[j] = playsIdx.get(songs.get(s).pollFirst()).pollFirst();
        		
        		j ++;
        		
        		continue;
        	} // if
        	
        	int play1 = songs.get(s).pollFirst();
        	int play2 = songs.get(s).pollFirst();
        	
        	int idx1 = playsIdx.get(play1).pollFirst();
        	int idx2 = playsIdx.get(play2).pollFirst();
        	
        	answer[j] = idx1;
        	answer[j+1] = idx2;
        	
        	j += 2;
        } // for
        
        return answer;
    } // solution
    
    // 장르 별 재생횟수의 합계를 구하는 메소드.
    public static int playCounter(LinkedList<Integer> plays) {
    	int count = 0;
    	
    	for(int i : plays) {
    		count += i;
    	} // for
    	
    	return count;
    } // playCounter
    
} // end class
