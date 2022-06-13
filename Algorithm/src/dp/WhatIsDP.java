package dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WhatIsDP {
	
	/*
	 * DP문제를 보면 "규칙성"을 떠올리자
	 * 문제를 작은 단위로 쪼개서 규칙을 찾아내고,
	 * 그 규칙을 이용해 전체 문제를 해결하는 방식이다.
	 * 
	 * Top-down 방식과 Bottom-up 방식이 있다.
	 */

	public static void main(String[] args) {
		
		// 피보나치 수열으로 DP 이해하기
		
		/*
		 * 1. Bottom-up 방식 = Tabulation
		 * 가장 낮은 단계에서 시작해서 위로 올라가는 방식
		 * 반복문을 사용해서 구현한다.
		 * 
		 * 피보나치 수열에서 가장 낮은 단계는 F(0) = 0 과 F(1) = 1 임
		 * 이 두개를 이용해 F(2)를 만들고, 이 결과는 F(3)을 만들 때 이용된다.
		 * 이 과정을 반복하면 F(n)의 피보나치 수열을 구할 수 있다.
		 * 
		 * 일반적으로 bottom-up방식이 더 빠르게 동작한다.
		 */
		
		// bottom-up 방식으로 0~50까지의 피보나치 수열 구하기
		long[] F = new long[50];
		F[0] = 0;
		F[1] = 1;
		
		for(int i=2; i<F.length; i++) {
			F[i] = F[i-1] + F[i-2];
		} // for
		
		// 1. Bottom-up방식으로 구한 피보나치 수열 출력
		System.out.println(Arrays.toString(F));
		
		// 2. Top-down방식으로 구현한 함수 실행
		// 출력: 55
		System.out.println(F(10));
		
		// memo에 저장된 값 확인
		// 출력: {2=1, 3=2, 4=3, 5=5, 6=8, 7=13, 8=21, 9=34, 10=55}
		System.out.println(memo.toString());
	} // main
	
	/*
	 * 2. Top-down 방식 = Memorization
	 * 재귀를 이용해 가장 낮은단계가 될 때까지 들어가서 찾는 방식이다.
	 * 이 때, 단순히 모든 노드에 대해 탐색할 경우 불필요한 값까지 반복하게되어 엄청나게 비효율적이므로,
	 * 한번 구한 값은 저장해나가면서(memorization) 탐색한다.
	 * 일반적으로 HashMap을 사용해 저장한다.
	 * 
	 * Bottom-up 방식에 비해 하위문제들을 해결하기 위한 논리적 정렬단계가 필요하지 않으므로
	 * 구현이 더 쉽다는 장점이 있다.
	 */
	
	// 일반적으로 필드는 클래스 상단부에 기재하나 설명을 위해 하단에 기재
	// 값을 저장할 해시맵 생성
	static Map<Integer, Integer> memo = new HashMap<>();
	
	static int F(int i) {
		
		// 끝 값(0 또는 1)에 도달하면 i를 리턴한다.
		if(i == 0 || i == 1) {
			return i;
		} // if
		
		// 해당 키를 기억한적이 없으면 맵에 추가
		// value값으로는 피보나치 수열을 계산한 값을 저장
		if(!memo.containsKey(i)) {
			memo.put(i, F(i-1) + F(i-2));
		} // if
		
		// 값을 리턴
		return memo.get(i);
	} // F
} // end class
