<img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white"/> <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/>

<div align="center">
  <h1>Algorithm_Practice</h1><hr>
  🍀목표 : 하루 1문제 이상 풀기🍀<br>
  유형별 알고리즘 문제풀이 저장소입니다.<br>   
  백준, 프로그래머스, 리트코드, 해커랭크 등 알고리즘 사이트의 문제풀이를 올립니다.<br><hr>
</div>

## Greedy ##

- 백준11047 동전 0 [문제](https://www.acmicpc.net/problem/11047)&nbsp;|&nbsp;[풀이](/Greedy/1.py)
- 백준11399 ATM [문제](https://www.acmicpc.net/problem/11399)&nbsp;|&nbsp;[풀이](/Greedy/2.py)
- 백준14659 한조서열정리하고옴ㅋㅋ [문제](https://www.acmicpc.net/problem/14659)&nbsp;|&nbsp;[풀이](/Greedy/3.py)
  > 간단해 보였지만 이중 for문으로 배열을 순회하도록 작성했더니 시간초과 에러가 났다.       
  > highest 값을 변경하는 방식으로 접근해야 한다.
- 백준 1931 회의실 배정 [문제](https://www.acmicpc.net/problem/1931)&nbsp;|&nbsp;[풀이](/Greedy/solve.java)
  > 회의실의 종료시간을 기준으로 오름차순 정렬해야한다는 것과, 이전회의의 종료시간과 다음회의의 시작시간을 비교해야한다는 것까지는 접근했으나, 어떻게 구성해야 하는지 아직 어려움이 있어 인터넷을 참고했다.              
  > 참고로 bufferedReader를 사용했을 때와 Scanner를 사용했을 때 두배 차이의 시간이 났다. 많은 수를 입력받을 때는 bufferedReader를 사용하는 것이 좋을 것 같다. 이 문제를 통해 StringTokenizer의 사용법도 익혔다.
- 백준 1541 잃어버린 괄호 [문제](https://www.acmicpc.net/problem/1541)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Baekjoon1541.java)
  > 최소값이 나오려면 최대한 많은 덧셈을 한 후 차례대로 뺄셈을 하면 된다.            
  > 먼저 -를 기준으로 분리 후 +기호로 연결된 모든 정수를 더한 후 차례로 빼는 풀이를 했다.               
  > 첫번째 숫자의 기준점을 0으로 해서 틀렸는데, 문제의 조건을 이용해 6자리 이상의 정수로 설정하니 해결되었다.
- 백준 1026 보물 [문제](https://www.acmicpc.net/problem/1026)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Solution.java)
  > B의 최대값과 A의 최소값을 곱하도록 만들었다.                                                         
  > A를 오름차순 정렬 후 A를 순회하면서, B에서 최대값(Collections.max() 이용)을 찾아 곱하고 B의 요소를 제거하는 방식으로 접근했다.

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
- Programmers 로또의 최고 순위와 최저 순위 [문제](https://programmers.co.kr/learn/courses/30/lessons/77484#fnref1)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution2.java)
  > 지워진 숫자와 고정된 당첨 번호를 각각 카운트 후, 최고순위는 지워진 숫자가 모두 당첨번호일 때, 최저순위는 지워진 숫자가 모두 당첨번호가 아닌 경우로 나눠     
  > 그대로 순위를 출력하면 되는 문제.
- Programmers 전화번호 목록 [문제](https://programmers.co.kr/learn/courses/30/lessons/42577)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution3.java)
  > 간단해 보였지만 효율성 테스트에서 발목이 잡혀 고민했던 문제.          
  > 배열을 정렬하는 것이 포인트였다.          
  > 문자열의 정렬은 사전 순 대로 정렬되는 것을 힌트삼아 일단 배열을 정렬 후, 배열의 끝에서부터 indexOf()메소드로 비교해나갔다.           
  > 첫글자 기준으로 정렬되기 때문에 이중 for문으로 배열을 각각 순회할 필요가 없어진다.   
- Programmers 베스트앨범 [문제](https://programmers.co.kr/learn/courses/30/lessons/42579)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution4.java)
  > ~~문제에 나와있는 모든 요구조건을 충족하는데 일부 테스트 케이스가 통과가 안된다. (2022-04-12)~~
  > 2022-04-13 해결                     
  > 원인 : line 36 songs의 값을 내림차순으로 정렬할 때, songs.get()메소드의 키값을 genres의 요소로 넣었기 때문              
  > 해결방법 : songs의 keySet만 따로 뽑아내 get메소드의 키로 넣어준 후 정렬.(forEach() 사용)                       
- 백준11652 카드 [문제](https://www.acmicpc.net/problem/11652)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution5.java)
  > 주어진 정수의 범위가 int를 초과하므로, long으로 선언해야 한다.                     
  > 마지막 정수가 가장 많이 나올경우를 생각해 반복문 이후에 비교하는 코드를 한번 더 넣어주어야 함.                            
  > 변수의 초기화 조건과 반례를 찾아내는 것이 조금 까다로웠던 문제.    
- Programmers 크레인 인형뽑기 게임 [문제](https://programmers.co.kr/learn/courses/30/lessons/64061)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution6.java)
  > 스택의 특징을 적극이용하는 문제.                    
  > 0이 아닐경우 해당 값과 스택에 들어있는 값을 비교해 같으면 pop, 다르면 push해주었다.                 
  > 비어있는 스택에서 peek할 경우 EmptyStackException이 발생하기 때문에 예외처리를 해주어야 한다.                    
  > 이 문제에선 스택에 0이 들어올 일이 없으므로, 초기값으로 0을 넣어주는 것으로 예외를 처리했다. 
- Programmers 오픈채팅방 [문제](https://programmers.co.kr/learn/courses/30/lessons/42888)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution7.java)
  > 해시맵의 특징(같은 키를 가지는 값이 들어오면 나중에 들어오는 값으로 대체됨)을 이용하면 change는 따로 신경쓰지 않아도 된다.                                    
  > 해시맵에 record 순서대로 key = id, value = 닉네임으로 받고, leave와 enter에 맞게 메시지를 출력했다.               
- Programmers 가장 큰 수 [문제](https://programmers.co.kr/learn/courses/30/lessons/42746)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution8.java)    
  > '전화번호 목록' 문제와 마찬가지로, 정수를 사전 역순으로 정렬하는 것이 포인트인 문제.                      
  > 단, 조건이 한 가지 더 있는데, 입출력 예시 중 3, 30과 같은 숫자가 들어오면 330이 아닌 303으로 정렬되어서 Comparator를 사용해 따로 정렬해주어야한다.              
  > Comparator 사용시 요소 하나를 비교하는 것이 아닌 두 개를 더한 값을 비교하면 해결할 수 있다.                  
  > (문자열에서의 + 연산자는 문자연결 연산자임을 이용)          
- Programmers 위장 [문제](https://programmers.co.kr/learn/courses/30/lessons/42578)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution9.java)
  > 해시를 사용하면 간단하게 해결할 수 있는 문제.                                    
  > 접근 자체는 어렵지 않으나 조합 공식에 대한 사전지식이 없으면 조합을 계산하는 식을 찾기 힘든 문제다...                 
  > 종류별 옷 개수를 각각 answer에 곱해주는데, 이 때 해당 종류의 옷을 선택하지 않을 경우의 수 1을 포함해 개수+1을 곱해주어야 한다.                   
  > 마지막으로 모든 옷을 입지 않았을 경우 1을 뺀 값을 return한다.                      
  > 나는 해시맵의 value로 String타입 Set을 지정했지만, 문제에서 이름이 중요하지 않고 구분만 하면 되므로,                    
  > 굳이 set에 담지 않고 Integer로 숫자만 표시하는 방법을 택한 사람들이 많았다.
                                                                                    
## Strings ##

- HackerRank Anagrams [문제](https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true)&nbsp;|&nbsp;[풀이](/Strings/1.java)
  > 컬렉션 Arrays를 import 하지 못하게 되어있다.      
  > ascii 코드값을 이용해 a-z 크기의 배열을 만들고 해당하는 알파벳 수를 카운팅하여 저장, 두 배열의 요소를 비교하도록 만들었다.
- 백준 20291 파일 정리 [문제](https://www.acmicpc.net/problem/20291)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution.java)
  > String Tokenizer를 이용해 .을 기준으로 분리 후,                   
  > 사전순으로 출력하기 위해 배열을 정렬하고 카운트 해주었다.
- 백준 1543 문서 검색 [문제](https://www.acmicpc.net/problem/1543)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution2.java)
  > 문자열에서 주어진 단어를 포함하는 갯수를 찾는 문제.                      
  > 빈 문자열을 하나 생성하고 charAt()메소드를 사용해 문자를 하나하나 담다가, 해당 단어를 포함하면 카운트하고 문자열을 초기화 해주었다.
- 백준 15904 UCPC는 무엇의 약자일까? [문제](https://www.acmicpc.net/problem/15904)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution3.java)
  > 문자열을 쪼개서 리스트에 담고, 리스트를 순회하면서 차례대로 U, C, P, C를 찾아냈다.                                  
  > isValid라는 int타입 변수를 선언하고 값을 변경하면서, 문자가 일치하고 동시에 isValid 값이 일치하는 문자가 있는지 찾았다.                     
  > 이는 UCPC라는 문자 순서가 바뀌면 안되기 때문에 추가로 조건을 만든 것이다.                                      
- 백준 5525 IOIOI [문제](https://www.acmicpc.net/problem/5525)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution4.java)
  > 문자열 Pn은 재귀함수를 이용해 만들었다.                      
  > 이 문제는 로직에는 문제가 없으나, 시간복잡도 때문에 50점으로 나온다.                          
  > 문자열을 비교하기 위해 배열에서 한칸한칸 옮겨가며 비교하는 방식으로 할 경우 정답처리되지 않는다고 한다.                          
  > 정답처리되기 위해선 KMP알고리즘을 이용해야 한다고 한다.                                   
  > KMP알고리즘이란 접두사(prefix)와 접미사(suffix)가 같은 부분 문자열 중 최대 길이를 찾고,                               
  > 다음 문자열을 비교할 때 그 접미사의 다음순서부터 비교하면 되어                                      
  > 훨씬 빠르게 문자열을 찾을 수 있는 알고리즘이라고 한다.                              
  > 나중에 KMP알고리즘을 이용해 다시 풀어봐야겠다.                                  
- Programmers 숫자 문자열과 영단어 [문제](https://programmers.co.kr/learn/courses/30/lessons/81301)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution5.java)&nbsp;|&nbsp;[다른사람의 풀이](Algorithm/src/strings/Solution5_1.java)
  > 문자열을 charAt()으로 하나씩 담고 switch expression을 이용, 영단어가 완성되거나 숫자가 들어오면 해당하는 숫자로 반환해주었다.                         
  > 두 번째 풀이는 다른사람의 풀이인데, replaceAll()을 사용한 것이 인상깊었다.                

## Implementation ##

- 백준 17478 재귀함수가 뭔가요? [문제](https://www.acmicpc.net/problem/17478)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution.java)
  > 재귀함수(자기자신을 호출하는 함수)를 이용하는 문제.               
  > 재귀함수를 처음 이용해본 문제. Dashline의 길이 때문에 함수를 두개로 나눠서 풀었지만,                         
  > 대시가 없을 경우엔 write 중간에 함수를 호출하는 방법으로 작성하면 간단하게 작성가능하다.                                    
  > void타입 함수에서 리턴 값 없이 return만 작성하면 함수를 호출했던 곳으로 돌아간다.
- Programmers 음양 더하기 [문제](https://programmers.co.kr/learn/courses/30/lessons/76501)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution2.java)
- Programmers K번째수 [문제](https://programmers.co.kr/learn/courses/30/lessons/42748)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution3.java)
  > 문제에서 요구하는 그대로 구현하면 된다.                   
  > Arrays.copyOfRange 메소드를 사용하면 간단하게 배열을 슬라이싱할 수 있다.                
- Programmers 없는 숫자 더하기 [문제](https://programmers.co.kr/learn/courses/30/lessons/86051)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution4.java)
  > indexOf()메소드를 이용하기 위해 주어진 배열을 list에 담고 비교했다.                   
  > 0~9까지의 배열을 만들고, indexOf를 이용해 비교해나가며 그 값이 -1이면 answer에 더해주었다.                   

## DFS / BFS ##

- Programmers 타겟 넘버 [문제](https://programmers.co.kr/learn/courses/30/lessons/43165)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution.java)
  > 인터넷을 참고한 풀이.             
  > 재귀함수를 이용해 모든 경우의 수를 탐색한다.                  
  > numbers의 인덱스를 1씩 증가시키면서 인덱스에 해당하는 값을 sum에 누적시키고,                      
  > 그 값이 target과 일치하면 answer값을 1씩 증가시킨다.                            
  > 합을 계산하는 dfs와 뺄셈을 계산하는 dfs를 각각 호출한다.

## ETC ##

- Programmers x만큼 간격이 있는 n개의 숫자 [문제](https://programmers.co.kr/learn/courses/30/lessons/12954)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution.java)
  > 주의할 점 : 변수를 선언할 때 long타입으로 맞춰줘야 사이트 테스트를 통과할 수 있다.
- 백준 1339 단어 수학 [문제](https://www.acmicpc.net/problem/1339)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution2.java)
  > 문제유형 : 브루트포스 알고리즘              
  > 알파벳 갯수만큼의 배열을 만들고, 문자열의 자릿수만큼 10의 거듭제곱 값을 해당 알파벳 자리에 더한다.(charAt()과 ascii코드값 이용)                       
  > 완성된 배열을 정렬하고 배열의 끝에서부터 차례대로 9~1을 곱한 값을 더하면 문제의 답을 구할 수 있다.                 

## Codeforces ##

- Codeforces Round #784 (Div. 4) (3solved, result : 2 out of 8)
  - A [문제](https://codeforces.com/contest/1669/problem/A)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution4.java)               
  - B [문제](https://codeforces.com/contest/1669/problem/B)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution5.java) 
    > 배열을 정렬 후 다른 정수 값이 나올 때마다 카운트 변수를 초기화해주면서, 3 이상이 되면 해당 수를 바로 프린트 해주고 빠져나오게 했다.                  
    > 3개 이상의 값이 아예 없을 경우 -1을 프린트해주기 위해 boolean변수를 만들어 반복문 이후에도 boolean이 true면 -1을 프린트해준다.                    
    > contest 당시에는 통과되었으나 끝난 후 테스트케이스가 더 추가되면서 타임아웃으로 인해 오답처리 되었다.                          
  - C [문제](https://codeforces.com/contest/1669/problem/C)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution6.java)
    > 배열의 짝수번째요소, 홀수번째요소들이 각각 모두 홀수거나 짝수일 경우 YES가 된다.                  
    > boolean변수를 4개 만들어 짝수번째 요소의 홀/짝, 홀수번쨰 요소의 홀/짝을 비교해 YES가 되는 모든 경우의 수를 조건식으로 나열하는 코드를 작성했다.             
    > 개인적으로 정말 무식하게 풀었다고 생각한다... 더 좋은 풀이법이 생각나면 추가해야겠다.
