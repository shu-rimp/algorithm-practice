package implementation;

// Programmers skill check level2-2
class Solution6 {
	
	static int[][] board;
	
	
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        board = new int[rows][columns];
        
        // 배열 초기화
        int k = 0;
        for(int i=0; i<rows; i++) {
        	for(int j=0; j<columns; j++) {
        		board[i][j] = ++k;
        	} // for
        } // for
        
        // 회전
        for(int i=0; i<queries.length; i++) {
        	int min = rotate(queries[i]);
        	
        	answer[i] = min;
        } // for
        
        return answer;
    } // solution
    
    private static int rotate(int[] query) {
    	
    	// 쿼리가 1부터 시작하기 때문에 1을 빼줌
    	int startR = query[0] - 1;
    	int startC = query[1] - 1;
    	int endR = query[2] - 1;
    	int endC = query[3] - 1;
    	
    	// 자리변경을 위해 임시변수 tmp에 시작넘버 저장
    	int tmp = board[startR][startC];
    	// 초기 min값 세팅
    	int min = tmp;
    	
    	// 빈 공간을 차례대로 메꾸는 개념
    	// 1. 시작행 중심 행 이동
    	for(int i=startR; i<endR; i++) {
    		board[i][startC] = board[i+1][startC];
    		
    		if(min > board[i][startC]) min = board[i][startC];
    	} // for
    	
    	// 2. 마지막열 중심 열 이동
    	for(int i=startC; i<endC; i++) {
    		board[endR][i] = board[endR][i+1];
    		
    		if(min > board[endR][i]) min = board[endR][i];
    	} // for
    	
    	// 3. 마지막행 중심 행 이동
    	for(int i=endR; i>startR; i--) {
    		board[i][endC] = board[i-1][endC];
    		
    		if(min > board[i][endC]) min = board[i][endC];
    	} // for
    	
    	// 4. 마지막열 중심 열 이동
    	for(int i=endC; i>startC; i--) {
    		board[startR][i] = board[startR][i-1];
    		
    		if(min > board[startR][i]) min = board[startR][i];
    	} // for
    	
    	// 5. 회전이 끝난 위치에 저장해뒀던 초기값 대입
    	board[startR][startC + 1] = tmp;
    	
    	return min;
    } // rotate
} // end class
