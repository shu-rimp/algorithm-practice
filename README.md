<img src="https://img.shields.io/badge/python-3776AB?style=for-the-badge&logo=python&logoColor=white"><br>
# Algorithm_Practice
--------
유형별 알고리즘 문제풀이 저장소입니다.   
백준, 프로그래머스, 리트코드, 해커랭크 등 알고리즘 사이트의 문제풀이를 올립니다.

## Greedy ##

- 백준11047 동전 0 [문제](https://www.acmicpc.net/problem/11047)&nbsp;|&nbsp;[풀이](/Greedy/1.py)
- 백준11399 ATM [문제](https://www.acmicpc.net/problem/11399)&nbsp;|&nbsp;[풀이](/Greedy/2.py)
- 백준14659 한조서열정리하고옴ㅋㅋ [문제](https://www.acmicpc.net/problem/14659)&nbsp;|&nbsp;[풀이](/Greedy/3.py)
  > 간단해 보였지만 이중 for문으로 배열을 순회하도록 작성했더니 시간초과 에러가 났다.       
  > highest 값을 변경하는 방식으로 접근해야 한다.

## DataStructure ##

- 백준10828 스택 [문제](https://www.acmicpc.net/problem/10828)&nbsp;|&nbsp;[풀이](/DataStructure/1.py)
  > python에서는 stack을 따로 제공하지 않고, list로 구현한다.    
  > push = append() 메소드   
  > pop = pop() 메소드(제거만 하므로, 출력문을 따로 적어주어야한다.)   
  > top = 인덱스[-1]을 이용   
  > isempty() = python에서 if [배열]을 할 경우, 배열에 원소가 들어있으면 true를 반환하는 것을 이용.
- 백준10845 큐 [문제](https://www.acmicpc.net/problem/10845)&nbsp;|&nbsp;[풀이](/DataStructure/2.py)
  > collections 모듈의 deque 이용
- LeetCode Find Pivot Index [문제](https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/)&nbsp;|&nbsp;[풀이](/DataStructure/3.py)
  > 배열을 순회하며 인덱스 값을 기준으로 왼쪽과 오른쪽의 합이 같으면 인덱스값을 반환하도록 작성했다.
- LeetCode Two Sum [문제](https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/)&nbsp;|&nbsp;[풀이](/DataStructure/4.py)