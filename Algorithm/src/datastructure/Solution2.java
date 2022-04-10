package datastructure;


// 프로그래머스 로또의 최고 순위와 최저 순위
// 접근 방법 :
// 1. 지워진 숫자를 제외하고 당첨번호와 일치하는 숫자를 센다.
// 2. 0이 포함된 갯수를 센다.
// 최대 순위는 지워진 번호(0)이 모두 당첨일 경우
// 최저 순위는 지워진 번호(0)이 모두 당첨번호가 아닌 경우

public class Solution2 {
	
    public int[] solution(int[] lottos, int[] win_nums) {
    	
    	int[] answer = new int[2];
    	
    	// 무조건 일치하는 고정 숫자 count
    	int fixedCount = 0;
    	// 0의 갯수를 count
    	int zeroCount = 0;
    	
    	for(int i=0; i<lottos.length; i++) {
    		
    		if(lottos[i] == 0) {
    			zeroCount++;
    			
    			continue;
    		} // if
    		
    		for(int j=0; j<lottos.length; j++) {
    			
    			if(lottos[i] == win_nums[j]) {
    				fixedCount++;
    			} // if
    		} // inner for
    	} // outer for
        
        int maxRank = Solution2.getRank(fixedCount+zeroCount);
        int minRank = Solution2.getRank(fixedCount);
    	
    	answer[0] = maxRank;
    	answer[1] = minRank;
    	
        return answer;
    } // solution
    
    // 번호가 일치하는 갯수대로 순위를 출력하는 메소드
    public static int getRank(int count) {
    	
    	int result = switch(count) {
    		case 6 -> 1;
    		case 5 -> 2;
    		case 4 -> 3;
    		case 3 -> 4;
    		case 2 -> 5;
    		default -> 6;
    	};
    	
    	return result;
    } // getRank

} // end class
