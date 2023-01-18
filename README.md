<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/>

<div align="center">
  <h1>Algorithm_Practice</h1><hr>
  🍀목표 : 하루 1문제 이상 풀기🍀<br>
  유형별 알고리즘 문제풀이 저장소입니다.<br>   
  백준, 프로그래머스, 리트코드, 해커랭크 등 알고리즘 사이트의 문제풀이를 올립니다.<br><br>
  🏆난이도🏆<br>
  백준 : Silver ~ Gold<br>
  프로그래머스 : level1 ~ level3<br><hr>
</div>

[Greedy](#greedy) | [Data Structure](#datastructure) | [Strings](#strings) | [Implementation](#implementation) | [DFS BFS](#dfs-bfs) | [Search](#search) | [DP](#dynamic-programming) | [Codeforces](#codeforces)<hr>


## Greedy ##
[top](#algorithm_practice)

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
- Programmers 체육복 [문제](https://programmers.co.kr/learn/courses/30/lessons/42862)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Solution2.java) 
  > 총 학생 수에서 lost배열의 길이만큼 뺀 값을 answer로 지정 후 숫자를 늘려나간다.                             
  > 해시셋을 생성해서 reserve배열 원소들을 추가한다.                                    
  > 여벌이 있고 동시에 잃어버린 학생을 제외하기 위해 해시셋에 lost원소가 있는지 찾고,                                  
  > 있다면 셋에서 제거, lost배열 원소를 -1로 대입한다.(if문 영향을 받지 않게하기위함)                                    
  > 이 때 answer는 처음에 모든 lost학생 수만큼 빼줬기 때문에 1 증가시킨다.                                    
  > 다시 lost배열을 순회하며, 해당 요소의 앞, 뒤(+-1)값이 셋과 일치하면                                
  > answer를 1증가, set에서 제거한다.                                                  
  > 순회가 끝나면 answer를 반환한다.                                  
  > +) 처음에 해시셋 대신 어레이리스트를 사용했는데, remove메소드를 사용할 때                                 
  > 해당 값을 찾아서 지우는게 아닌 인덱스값으로 제거해서 런타임에러가 났다.                           
  > +) 테스트 케이스 중 정렬이 안된채로 입력이 들어오는 경우가 있기 때문에                                  
  > lost배열을 오름차순 정렬한 후 진행했다.                               
- Programmers 단속카메라 [문제](https://programmers.co.kr/learn/courses/30/lessons/42884)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Solution3.java) 
  > 고속도로에서 나간 지점(routes[n][1])을 기준으로 오름차순 정렬 후,                                     
  > 직전 차량의 나간지점과 다음 차량의 진입지점을 비교해나가면 된다.                                  
  > 나간지점이 진입지점보다 작을경우, 두 차량은 겹치지 않기 때문에                            
  > 카메라를 한 대 추가해야한다.(answer++)                            
  > 끝값과 시작값을 비교해야한다는 접근법이 백준 '회의실 배정'문제와 유사하다.                       
  > 어떤 값을 기준으로 정렬해야 하는지가 포인트인 문제.                         
- 백준 1715 카드 정렬하기 [문제](https://www.acmicpc.net/problem/1715)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Solution4.java) 
  > 그리디 문제임과 동시에 우선순위 큐를 이용하는 자료구조 문제이기도 하다.                        
  > 묶음의 최소 비교수는 작은 묶음 순서대로 합치면 된다.                          
  > 카드묶음을 오름차순 정렬하기 위해 주어진 원소들을 우선순위 큐에 넣는다.                        
  > 큐에서 두 묶음을 꺼내 합한 수를 정답변수에 더하고, 그 값을 다시 큐에 집어넣는다.                      
  > 이 과정을 큐의 사이즈가 1이 될 때까지 반복한다.                   
  > 해당 문제의 n값 범위가 100,000이어서, int로 선언하면 정답이 int범위를 초과할 수 있다.                
  > 따라서 long타입으로 선언해야한다.                      
- 백준 2839 설탕 배달 [문제](https://www.acmicpc.net/problem/2839)&nbsp;|&nbsp;[풀이](Algorithm/src/greedy/Solution5.java)
  > 최소 봉지갯수는 최대한 많이 5킬로그램에 담는 경우이다.                             
  > 먼저 갯수를 세기 위한 카운트변수를 만든다.                               
  > 주어진 수가 5로나누어 떨어지면 카운트에 추가하고 출력한다.                            
  > 나누어 떨어지지 않으면 3킬로그램에 담아야하니 3을 뺀다.                   
  > 이 과정을 반복한다.                     
  > 만약 주어진 수(n)이 음수가 될 때까지 반복문을 탈출하지 못한다면                      
  > 3과 5로 만들 수 없다는 뜻이므로 -1을 출력한다.                            

## DataStructure ##
[top](#algorithm_practice)

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
  > ~~문제에 나와있는 모든 요구조건을 충족하는데 일부 테스트 케이스가 통과가 안된다. (2022.04.12)~~                   
  > 2022.04.13 해결                     
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
  > plus) forEach()메소드에서 지역변수를 사용할 때,                       
  > 람다식 내부는 익명구현객체이므로 지역변수와 파라미터로 사용하는 변수를 구분하지 못한다.                                     
  > (지역변수를 상수적으로 사용하라는 컴파일 오류가 발생)                      
  > 해결방법은 지역변수를 클래스의 필드로 선언하면 된다.               
- 백준 10773 제로 [문제](https://www.acmicpc.net/problem/10773)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution10.java)
  > 스택에 수를 차례로 담고 0이 나올 경우 pop, 스택에 남아있는 수들을 모두 더해 결과값으로 출력한다.
- 백준 9012 괄호 [문제](https://www.acmicpc.net/problem/9012)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution11.java)
  > 스택을 생성하고 조건을 부여했다.                  
  > (1) 스택이 비어있으면 push                        
  > (2) 스택에서 peek한 값이 '('이고, 비교할 값이 ')'이면 pop               
  > (3) (2)의 조건을 충족하지 못하면 push                 
  > 반복문 이후에 스택이 비어있으면 올바른 괄호 문자열이다.        
- Programmers 주식가격 [문제](https://programmers.co.kr/learn/courses/30/lessons/42584)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution12.java)
  > 이중for문을 사용했고, inner for문의 시작인덱스는 outer for문의 i+1(i의 다음 인덱스)부터 비교하도록 지정했다.              
  > second를 1씩 증가시키다가 비교대상이 더 작을 경우에 break하고 answer 배열에 담는다.                   
  > 이후 second 초기화, 반복               
  > 스택/큐 문제집에 있는 문제인데, 굳이 사용할 필요를 못느껴 기본타입 배열을 사용했다.
- Programmers 프린터 [문제](https://programmers.co.kr/learn/courses/30/lessons/42587)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution13.java)
  > 우선순위 큐를 이용하는 문제.                
  > 우선순위 큐는 큐에 정렬이 추가된 자료구조이다. 이 문제에선 내림차순 정렬을 사용한 우선순위 큐를 사용했다.                 
  > (1) 큐에서 peek한 값과 priorities 배열의 원소를 비교한다.                               
  > (2) 그 값이 같다면 poll하고 answer카운트를 1 증가한다.                                    
  > (3) 값이 같으면서 인덱스(for문의 i)와 location이 일치하면 answer를 리턴한다.                     
- Programmers 기능개발 [문제](https://programmers.co.kr/learn/courses/30/lessons/42586)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution14.java)
  > 큐를 이용하는 문제.               
  > (1) 각 작업이 끝나는 날짜를 미리 계산해서 큐에 저장한다.                                    
  > (2) 첫번째 값을 꺼내 임시변수 tmp에 저장하고, peek한 값이 tmp보다 클 때까지 카운트를 증가시키고, 값을 poll한다.                              
  > (3) 큐가 빌 때까지 1, 2를 반복한다.                
- Programmers 이중우선순위큐 [문제](https://programmers.co.kr/learn/courses/30/lessons/42628)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution17.java) 
  > 2개의 우선순위큐를 생성한다. 하나는 오름차순, 하나는 내림차순으로 정렬한다.                         
  > I로 시작하는 연산이 있으면 두 큐에 모두 추가한다.                          
  > 최댓값을 제거하는 D1을 만나면 maxQ에서 poll하여 원소를 제거한다.                         
  > 두가지 큐에 모두 원소를 추가했기 때문에 minQ에도 해당 원소를 찾아 제거한다.(remove()메소드 사용)                       
  > D -1도 마찬가지로 minQ에서 poll하고 동일한 값을 maxQ에서도 제거한다.                              
  > 연산을 마친 후 큐가 비어있지 않으면 minQ와 maxQ에서 poll한값을 answer에 저장 후 리턴한다.
- Programmers 더 맵게 [문제](https://programmers.co.kr/learn/courses/30/lessons/42626)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution18.java)
  > 오름차순 우선순위큐를 생성하고 스코빌 지수를 큐에 넣는다.                       
  > 첫번째 원소가 K이상이 될 때까지 새로운 음식 공식을 적용한다.                       
  > 한번의 연산이 끝날 때마다 answer를 증가한다.                             
  > 만약 큐에 원소가 한 개 남았는데 K를 넘지 못한다면                             
  > 모든 음식의 스코빌 지수를 K이상으로 만들 수 없다는 뜻이므로 -1을 리턴한다.                  
- 백준 5430 AC [문제](https://www.acmicpc.net/problem/5430)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution21.java)          
  > Collections의 reverse()메소드를 사용하면 무조건 시간초과가 난다.                                               
  > 이 문제는 양방향에서 접근 가능한 덱(deque)를 이용하는 문제로,                              
  > 굳이 배열을 뒤집을 필요 없이 boolean변수를 만들고 reverse가 true면 pollLast(),                              
  > 정방향이면 pollFirst()하면 된다.                               
  > 로직은 간단하나 입출력이 매우 불친절하고 예외처리할 것이 많아서 여기에 시간을 더 쏟은 문제.                            
  > (1) 에러 출력시 즉시 해당 테스트 케이스를 종료하고 에러문구는 케이스당 한번만 출력. 라벨링을 이용했다.                        
  > (2) 배열형식으로 출력할 때 마지막 원소는 반점을 붙이지 않고 출력                             
  > (3) 답이 빈배열을 반환할 경우 [] 이렇게 빈배열로 출력해야함                        
- 백준 17219 비밀번호 찾기 [문제](https://www.acmicpc.net/problem/17219)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution22.java) 
  > 해시맵에 공백으로 구분해서 키값을 입력한 후 해당 키에 맞는 값을 반환한다.                           
- 백준 1927 최소 힙 [문제](https://www.acmicpc.net/problem/1927)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution23.java), 11279 최대 힙 [문제](https://www.acmicpc.net/problem/11279)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution24.java) 
  > 우선순위큐를 생성하고 하나씩 큐에 집어넣는다.                         
  > (최소 힙 문제는 오름차순, 최대 힙 문제는 내림차순으로 생성)                         
  > 큐가 비어있는데 0이 들어올경우 0을 출력하고, 그 외에는 poll()하여 최소/최대값을 출력한다.   
- 백준 1991 트리 순회 [문제](https://www.acmicpc.net/problem/1991)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution25.java)        
  > 이진 트리를 전위, 중위, 후위 순회한 순서를 각각 출력하는 문제                          
  > Node클래스에 char타입 root필드를 만들고, Node타입 left, right필드를 만든다.                                 
  > 입력받은 노드갯수만큼의 크기로 Node타입 배열을 만들고, 알파벳 순서대로 노드객체를 초기화한다.                                   
  > char타입 노드를 정수변환(-'A')한 값을 노드배열의 인덱스로 탐색하고, 노드에 해당하는 left, right필드를 각각 초기화해준다.                                       
  > 이 때 입력으로 '.'이 들어올경우 null로 초기화한다.                                         
  > 전위(root-left-right), 중위(left-root-right), 후위(left-right-root) 순서대로 탐색하는 메소드를 각각 생성한다.                                  
  > 재귀를 이용하고, 각 탐색순서에 맞게 코드의 순서를 조정한다.                                         
  > 탐색결과를 stringbuilder에 담아 출력했다.                                   
- 백준 1021 회전하는 큐 [문제](https://www.acmicpc.net/problem/1021)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution19.java) 
  > 양방향에서 접근하는 덱을 이용하는 문제                             
  > 원래는 Deque 인터페이스를 사용했으나, 문제에서 인덱스 값을 찾아야 하기 때문에                              
  > LinkedList 구현클래스의 indexOf 메소드를 이용했다.                                
  > 찾는 수를 1번연산을 수행할 수 있을 때까지 이동시키는 것                              
  > (수를 뽑는 연산은 오직 1번만 가능)이 최종 목표이다.                          
  > 최솟값을 구하기 위해 중간 인덱스 값을 구해야 한다.                              
  > 중간 인덱스를 기준으로 왼쪽에 있으면 2번 연산,                                 
  > 오른쪽에 있으면 3번 연산을 수가 맨 앞에 위치할 때까지 반복한다.                                                 
  > 찾는 수를 큐에 저장해서 큐가 빌 때까지 반복했다.                                  
  > 한번 수를 찾고나면 덱의 사이즈와 타겟 인덱스, 중간인덱스값이 모두 바뀌므로 새롭게 저장한 후 카운트를 센다.                                      
- Programmers 햄버거 만들기 [문제](https://school.programmers.co.kr/learn/courses/30/lessons/133502)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution27.kt)
  > 배열을 문자열로 변환 후 햄버거를 만들 수 있을 때까지 비교하며 반복한다.                   
  > 완성된 햄버거는 문자열에서 제거한다.             
  > 문자열로 풀 경우 시간초과에 매우 유의해야한다.                 
  > 문자열을 스트링빌더로 생성하고,                 
  > 제거한 문자열을 재할당하는 대신 빌더 자체에서 delete했다.            
  > 또한 replace, remove, indexOf 대신 substring을 이용했다.                      
  > 동일한 결과여도 로직에 따라 시간차이가 많이 났다.                                     

## Strings ##
[top](#algorithm_practice)

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
- Programmers 신규 아이디 추천 [문제](https://programmers.co.kr/learn/courses/30/lessons/72410)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution6.java)
  > 단순히 문제에서 요구하는 대로 차근차근 구현하기만 하면 되는 문제.             
  > 스택을 사용하면 편할것 같아 스택으로 풀었다.              
  > 1단계에서 특수문자를 변환할 때 정규식을 이용한 풀이가 많았다. 아직 정규식을 몰라서 배열에 허용되지 않는 특수문자들을 담고 replaceAll을 사용했다. 
- Programmers [1차]뉴스 클러스터링 [문제](https://programmers.co.kr/learn/courses/30/lessons/17677)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution7.java) 
  > 문자열을 다중집합으로 만들고, 영어가 아닌 문자가 포함된 원소들을 제거해준 뒤 유사도를 계산하면 된다. ascii코드값을 이용했다.                
  > 교집합, 합집합은 원소의 갯수만 구하면 되어 따로 집합을 만들 필요가 없다.                    
  > 대소문자만 다르고 같은 문자열이 들어올 경우 유사도가 1이므로 계산할 필요 없이 그대로 리턴해주면 된다.(문제에서는 65536)          
- Programmers 문자열 압축 [문제](https://programmers.co.kr/learn/courses/30/lessons/60057)&nbsp;|&nbsp;[풀이](Algorithm/src/strings/Solution8.java)
  > 자른 문자열을 비교해가는 zipStr메소드를 만들고, 매개변수로 길이(amount)를 지정했다.                                   
  > 초기값으로 0부터 amount까지 자른 문자열을 저장하고, s의 길이만큼 반복하며 비교한다.                               
  > 이 때 반복문의 증감식은 amount를 더해준다.                                     
  > 문자열이 동일하면 zipCount값을 증가하다가 다르면 비교문자열(compare)를 해당 문자열로 대입하고,                                    
  > zipCount값과 기존 자른문자열을 StringBuilder에 저장한다.                              
  > s의 길이가 amount로 나누어 떨어지지 않으면 반복문의 증감식(i + amount)에서 인덱스에러가 난다.                                
  > i + amount값이 s길이를 초과하면 반복문을 탈출하는 조건을 걸어주고,                             
  > 남은 문자열은 저장해뒀다가 가장 마지막에 추가해준다.                             
  > 테스트 케이스 중, 길이가 1인 문자열이 들어오는 경우가 있다.                              
  > 이를 대비해 문자열의 길이가 1이면 바로 1을 리턴하는 조건을 걸어주었다.

## Implementation ##
[top](#algorithm_practice)

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
- Programmers 스킬체크 level2-1 [풀이](Algorithm/src/implementation/Solution5.java)
  > 이전에 풀었던 [가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746) 문제와 동일한 문제가 나왔다.
  > 정수를 문자열 취급해 사전 내림차순으로 정렬하되, 3, 30과 같은 숫자처럼 예외가 있기 때문에 두 문자열씩 묶어 비교해야 한다.
- Programmers 스킬체크 level2-2 [풀이](Algorithm/src/implementation/Solution6.java)
  > 2차원 배열을 이용해 행렬을 회전하는 문제.                       
  > 1차원 배열에서 값을 바꾸는 원리와 동일하다. 바꾸기 위해 원래 값을 임시변수에 저장하고,                         
  > 배열의 이동을 마치면 빈 자리에 저장해두었던 값을 넣어주면 된다.                     
  > 테두리만 회전시키면 되므로 주어진 쿼리의 시작 행/열, 끝 행/열 기준으로 값을 대입해나가면된다.                   
  > 시작 값을 임시변수에 저장하고, 빈 자리부터 시계방향으로 한칸씩 당겨왔다.                     
  > 쿼리 하나당 총 4번의 이동이 일어나고, 그때마다 최소값을 비교해 min에 저장한다.                       
  > 회전을 모두 마치면 min값을 리턴하고, 그 값을 answer배열에 담아 리턴하면 된다.                         
  > 해당 사이트의 [행렬 테두리 회전하기](https://programmers.co.kr/learn/courses/30/lessons/77485) 문제와 동일하다.
- 백준 17427 약수의 합 2 [문제](https://www.acmicpc.net/problem/17427)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution18.java) 
  > 일반적인 약수의 합을 구하는 방식으로 접근하면 시간초과가 난다.                  
  > 1부터 n까지의 약수를 모두 나열하면, 1이나오는 갯수는 n, 2가 나오는 갯수는 (n / 2) * 2, 3이 나오는 갯수는 (n / 3) * 3,                  
  > 이렇게 n까지 증가하는 규칙을 확인할 수 있다.                              
  > 그대로 공식화해서 모두 더한 값을 출력한다.        
- 백준 8979 올림픽 [문제](https://www.acmicpc.net/problem/8979)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution7.java)
  > CompareTo 메소드를 재정렬해야하는 문제.                                   
  > 국가별 이름, 금은동 메달 수, 순위를 저장할 클래스를 만들고, Comparable 인터페이스를 구현하고 메소드를 오버라이드한다.                                 
  > 메달의 수가 같을 경우 하위메달 수를 비교해가며 정렬한다.                                  
  > 입력받은 정보를 Nation객체에 저장 후 ArrayList에 추가한다.                                       
  > 두개씩 비교하며 순위를 정한다. 만약 금은동 메달 수가 모두 같으면 다음 국가의 순위에 이전 국가의 순위를 대입한다.                                       
  > 같지 않다면 다음 국가의 순위는 (이전 국가들의 합 + 1)로 정한다.                                    
  > 여기서는 for문이 1부터 순서대로 돌아가기 때문에 i+1로 지정하였다.                                     
- 백준 3048 개미 [문제](https://www.acmicpc.net/problem/3048)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution8.java)
  > 개미의 그룹번호와 순서(알파벳)을 저장하는 Ant클래스를 만든다.                         
  > 그룹은 항상 두개이므로, 임의로 1, 2로 지정했다.                             
  > 문제에서 주어진 순서대로 입력받아 ant객체를 생성하고, ArrayList에 추가했다.                              
  > 시간이 0이될 때까지 리스트를 순회한다.                                  
  > 개미 두개씩 뽑아 비교한다. 만약 이전개미의 그룹과 다음개미의 그룹이 다르면 순서를 바꿔준다.                               
  > 1초에 한번씩만 개미를 뛰어넘으므로, for문의 i를 1 증가해 건너뛰어준다.                             
  > 또한 개미는 전진만 하므로, 그룹 하나를 기준으로 잡는 조건을 추가해야한다.                            
  > 이 조건을 추가하지 않을 시 그룹이 다를 때마다 변경이 일어나 개미가 뒤로 갈 수 있다.       
- Programmers [3차] 파일명 정렬 [문제](https://school.programmers.co.kr/learn/courses/30/lessons/17686)&nbsp;|&nbsp;[풀이](Algorithm/src/datastructure/Solution26.java)
  > Comparable 인터페이스를 구현해야하는 정렬문제                         
  > head, number, tails를 저장하는 Files 클래스를 만들고 compareTo 메소드를 오버라이딩하여 조건에 맞게 정렬한다.          
  > 이 때 head는 대소문자를 구분하지 않으므로 모두 소문자(or 대문자)처리 후 비교한다.                
  > 후에 원본String값을 그대로 반환해야하기 때문에 number의 경우 numberInt필드에 정수변환한 number를 저장하고,                      
  > 원본 number대신 numberInt를 사용하여 정렬한다.                         
  > 문자열을 받아서 정규표현식을 이용해 split후 head, number값을 얻는다.                        
  > tail은 head와 number 뒤 나머지 모든 문자열이므로 둘의 length를 더한 값을 substring의 beginning값으로 지정한다.                          
  > Files객체를 생성한후 Files타입 배열에 순서대로 저장한다.                        
  > Arrays.sort로 재정렬한 메소드를 사용해 정렬 후 원상복구한 문자열을 반환하기 위해                         
  > 배열을 순회하며 필드값들을 연결시킨 후 answer배열에 추가한다.                           
  > +) toString 메소드를 오버라이딩하면 메소드 호출로 간단하게 필드들을 연결할 수 있다.
- Programmers 개인정보 수집 유효기간 [문제](https://school.programmers.co.kr/learn/courses/30/lessons/150370)&nbsp;|&nbsp;[풀이](Algorithm/src/implementation/Solution9.java)
  > <b>"한 달은 모두 28일로 가정한다"</b> 가 중요한 문제            
  > date객체로 날짜 계산을 했다가 저 조건을 뒤늦게 보고 시간을 날려버렸다.                   
  > 단순하게 주어진 날짜를 28을 곱하여 일 수로 환산한 후,           
  > 타겟 날짜와 비교하여 만료된 유저번호만 리턴한다.                       
  > 굳이 클래스 생성 -> 저장 -> 비교의 과정을 거치지 않고                   
  > 바로 배열순회하며 비교하는게 더 깔끔했을 듯 하다.

## DFS BFS ##
[top](#algorithm_practice)

- Programmers 타겟 넘버 [문제](https://programmers.co.kr/learn/courses/30/lessons/43165)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution.java)
  > 인터넷을 참고한 풀이.             
  > 재귀함수를 이용해 모든 경우의 수를 탐색한다.                  
  > numbers의 인덱스를 1씩 증가시키면서 인덱스에 해당하는 값을 sum에 누적시키고,                      
  > 그 값이 target과 일치하면 answer값을 1씩 증가시킨다.                            
  > 합을 계산하는 dfs와 뺄셈을 계산하는 dfs를 각각 호출한다.
- BFS 알고리즘에 대한 이해
  > [인접행렬로 구현한 BFS](Algorithm/src/dfs_bfs/Bfs.java)&nbsp;|&nbsp;[인접리스트로 구현한 BFS](Algorithm/src/dfs_bfs/BfsAdjList.java)                          
  > BFS는 큐로 구현하고, DFS와 달리 재귀적으로 동작하지 않는다.                             
  > 2차원 배열(인접행렬)과 인접리스트로 구현하는 2가지의 방법이 있다.                              
  > 그래프 내에 적은 수의 간선을 가진다면 인접리스트를 사용하는 것이 유리하다.(인접 행렬의 경우 메모리 낭비가 크기 때문)                             
  > 방문여부를 알 수 있는 boolean타입 배열을 같이 선언해야 한다.                           
  > 시작 노드를 큐에 저장한 후, 큐에서 꺼내(poll) 해당 노드에 연결되어있는 노드들의 방문여부를 체크한다.                             
  > 만약 방문이 안된 노드라면, 방문처리 후 큐에 집어넣는다.                                 
  > 이 과정을 큐가 빌 때까지 반복하면 bfs탐색이 완료된다.              
- DFS 알고리즘에 대한 이해
  > [재귀(recursion)로 구현한 DFS](Algorithm/src/dfs_bfs/Dfs.java)                             
  > DFS는 연결노드를 따라서 계속 파고들어간 후,                             
  > 더이상 연결된 노드가 없다면 노드를 찾을 때까지 이전 노드로 되돌아간다.                      
  > 일반적으로 DFS는 재귀로 구현하고, stack으로 구현하는 방식도 있다.                     
  > 처음 노드를 방문하면 그 노드에 연결된 노드들을 탐색한다.                         
  > 만약 방문하지 않은 노드가 있다면 dfs를 다시 호출한다.                         
- 백준 2178 미로 탐색 [문제](https://www.acmicpc.net/problem/2178)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution4.java)     
  > bfs문제                
  > 상, 하, 좌, 우로 이동이 가능한지 체크하고, 이동이 가능하면 해당 좌표를 큐에 추가하고 방문처리한다.               
  > 이동할 때 칸 수를 세야하므로, 이전 좌표에서 1씩 증가하면서 이동한다.                
  > 만약 새로운 좌표 값이 0 미만이거나, 그래프 크기를 초과한다면 continue해준다.                  
- 백준 2606 바이러스 [문제](https://www.acmicpc.net/problem/2606)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution5.java)      
  > 연결정보를 그래프에 저장한 후 bfs 탐색한다.                              
  > 새 노드를 방문할 때마다 카운트 횟수를 1 증가시킨다.                    
- 백준 2667 단지번호붙이기 [문제](https://www.acmicpc.net/problem/2667)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution6.java)    
  > 이차원 배열을 차례로 순회하다가                   
  > 집이 존재하고(1), 방문한 적이 없으면(false) bfs를 호출한다.                      
  > 미로 탐색 문제와 마찬가지로 상, 하, 좌, 우로 이동이 가능한지 체크하고 방문한다.                     
  > bfs함수를 작성할 때 단지 내 집의 갯수를 반환하도록 카운트 변수를 추가했다.                     
  > 반환된 카운트를 arraylist에 담고 모든 탐색이 끝나면 리스트를 오름차순 정렬 후 출력한다.                      
  > 총 단지 수는 리스트의 사이즈를 출력한다.
- 백준 7569 토마토 [문제](https://www.acmicpc.net/problem/7569)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution7.java)  
  > 3차원 배열에 bfs를 적용하는 문제                          
  > 이동방향이 상, 하, 좌, 우, 위, 아래 총 6가지이다.                             
  > 배열을 순회하면서 익은토마토(1)가 있는 좌표를 찾아 큐에 추가한다.                         
  > 큐에서 빼낸 좌표의 인근(상, 하, 좌, 우, 위, 아래)에 안익은 토마토가 있는지 확인하고,                         
  > 있으면 해당 좌표를 큐에 추가하고 이전 좌표값에서 1씩 증가시킨다.                             
  > 큐가 빌 때까지 해당 과정을 반복한다.                       
  > 모든 토마토가 익을 때의 일수를 반환해야하기 때문에 탐색을 마친 배열에서 최대값을 찾아 리턴한다.                           
  > 만약 안익은 토마토(0)가 하나라도 있으면 -1을 반환한다.                       
  > 첫째날은 제외하기 때문에 result에서 -1한 값이 정답이다.                         
- 백준 1012 유기농 배추 [문제](https://www.acmicpc.net/problem/1012)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution8.java) 
  > 2차원 배열을 만들고 배추가 있는 곳을 1로 초기화한다.                  
  > 방문여부를 표시하는 boolean배열을 만들고 그래프를 순회한다.                    
  > 배추가 있고(1), 아직 방문하지 않은 좌표에 대해 bfs 탐색을 수행한다.                   
  > 한번의 탐색이 끝날 때마다 카운트 횟수를 증가시킨다.                        
  > 하나의 테스트 케이스가 끝날 때마다 카운트를 출력한다.
- 백준 5014 스타트링크 [문제](https://www.acmicpc.net/problem/5014)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution9.java) 
  > 좌우 이동이 없고 상하로만 이동하기 때문에 1차원 배열로 풀 수 있다.                        
  > 엘리베이터의 층수가 1부터 시작하기 때문에 건물높이+1만큼의 배열을 생성한다.                          
  > bfs를 호출하고, 올라갔을 때와 내려갔을 때를 각각 탐색한다.                           
  > 건물범위를 벗어나지 않고 방문하지 않은 층(0)은 큐에 추가하고 횟수를 세기 위해 직전 배열의 값에서 1씩 증가한다.                       
  > 큐에서 poll한 값이 목적지층과 같으면 리턴한다. 이 때 시작층에서는 버튼을 누르지 않기 때문에 -1해준다.                       
  > 목적지층과 일치하지 않으면 -1을 리턴하고 "use the stairs"를 출력한다.             
- 백준 1697 숨바꼭질 [문제](https://www.acmicpc.net/problem/1697)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution10.java)          
  > N, K의 범위가 0부터 100,000이기 때문에 최댓값+1만큼의 배열을 생성했다.               
  > bfs탐색을 사용하고, x+1, x-1, 2x의 경우를 각각 탐색한다.               
  > 배열의 범위에 있고 아직 방문하지 않은 위치(0)이라면 큐에 추가한다.                  
  > 방문처리를 할 때 초를 세기 위해 직전 위치의 값+1을 한다.                   
  > 동생의 위치와 현재위치가 같다면 해당 위치의 값을 리턴한다.                      
  > 시작 위치는 초를 세지 않기 때문에 -1한 값이 정답이다.                        
- 백준 2468 안전 영역 [문제](https://www.acmicpc.net/problem/2468)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution11.java) 
  > 유기농 배추 문제와 같은 방식으로 영역의 갯수를 세는 문제이다.                 
  > 단, 각 높이별로 물에 잠겼을 때의 모든 경우의 수를 비교해야 한다.                    
  > 높이정보를 저장하기 위한 set을 만들고, 배열을 순회하며 높이를 저장한다.                   
  > set을 사용한 이유는 중복을 제거하기 위함.                     
  > 문제조건에 "아무 지점도 잠기지 않을 수 있다"가 있기 때문에 처음에 0을 add해주고 시작.                    
  > 각 높이를 순회하면서 좌표가 해당 높이보다 크고 방문하지 않았을 때(false) bfs를 호출한다.               
  > bfs탐색이 끝나면 안전영역을 카운트한다.                  
  > 높이 하나에 대한 탐색이 끝나면 안전영역 카운트와 boolean배열을 초기화해준다.                  
  > 안전영역의 최대값을 비교해서 출력한다.                     
- Programmers 네트워크 [문제](https://programmers.co.kr/learn/courses/30/lessons/43162)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution12.java) 
  > bfs탐색으로 풀었다.                           
  > 컴퓨터의 갯수 = 노드의 갯수라고 생각한다.                           
  > 방문여부를 확인하기 위해 노드 갯수 크기의 boolean배열을 생성한다.                     
  > 노드갯수만큼 반복하며, 아직 방문하지 않은 노드에 대해 bfs탐색을 수행한다.                       
  > bfs내부에서 노드를 방문하면 연결된 노드들을 탐색한다.                        
  > 만약 연결된 노드가 있고(1), 방문하지 않았다면(false) 큐에 추가하고 방문처리한다.                            
  > 탐색이 끝나면 answer를 증가한다.                  
- 백준 2573 빙산 [문제](https://www.acmicpc.net/problem/2573)&nbsp;|&nbsp;[풀이](Algorithm/src/dfs_bfs/Solution13.java)
  > 문제를 해결하는 과정을 크게 쪼개서 생각했다.                                 
  > (1)빙산을 녹인다.                            
  > (2)녹인 빙산에서 bfs탐색한다.                             
  > (3)한번의 bfs탐색이 끝나면 area갯수를 증가한다.                         
  > (4)1, 2, 3과정을 area갯수가 2이상이 될 때까지 무한반복한다.                        
  > (5)while문에서 한번의 사이클이 끝나면 year를 1 증가하고, area와 visited를 초기화 해준다.                             
  > (6)탈출조건에 부합하면 year출력                                 
  > (7)만약 빙산이 모두 녹았다면(모두 0) 0을 출력                             
  > melt메소드에서는 0이 아닌 모든 좌표를 큐에 먼저 집어넣고 탐색했다.                             
  > 또한 필드의 visited와는 다른 독립적인 boolean배열이 필요하기 때문에 메소드 안에서 새 배열을 생성했다.                            
  > 나는 모두 bfs탐색으로 풀었지만, 녹이는 과정은 bfs, 영역탐색은 dfs로 푸는 방식이 가장 많았다.

## Search ##
[top](#algorithm_practice)

- Programmers x만큼 간격이 있는 n개의 숫자 [문제](https://programmers.co.kr/learn/courses/30/lessons/12954)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution.java)
  > 주의할 점 : 변수를 선언할 때 long타입으로 맞춰줘야 사이트 테스트를 통과할 수 있다.
- 백준 1339 단어 수학 [문제](https://www.acmicpc.net/problem/1339)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution2.java)
  > 문제유형 : 브루트포스 알고리즘              
  > 알파벳 갯수만큼의 배열을 만들고, 문자열의 자릿수만큼 10의 거듭제곱 값을 해당 알파벳 자리에 더한다.(charAt()과 ascii코드값 이용)                       
  > 완성된 배열을 정렬하고 배열의 끝에서부터 차례대로 9~1을 곱한 값을 더하면 문제의 답을 구할 수 있다.                 
- 백준 2630 색종이 만들기 [문제](https://www.acmicpc.net/problem/2630)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution7.java)
  > 문제유형 : 분할탐색                     
  > 분할탐색이란, 해결이 안되는 문제를 해결이 될 때까지 분할해서 탐색하는 것이다.                     
  > 재귀에 대한 이해가 필요하다. 해당 문제는 다음과 같은 과정을 거쳐 해결했다.                     
  > (1) 먼저 모든 색이 같은지를 따져보고, 같으면 white/blue에 더한다.                 
  > (2) 같지 않으면 4등분하고, 각각 1을 수행한다.                   
  > (3) 모든 색종이가 완성될 때까지 1, 2를 반복한다.(재귀)                      
  > 4등분 했을 때 각각의 인덱스 값은 x, y좌표에서 4분면을 나누는 방식을 사용했다.
- 백준 1992 쿼드트리 [문제](https://www.acmicpc.net/problem/1992)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution8.java)
  > 문제유형 : 분할탐색                    
  > 위의 색종이 만들기 문제와 완전히 동일하게 풀이하면 된다.                    
  > 출력방식에만 차이가 있다. 색종이는 횟수를, 이 문제는 결과 그대로를 출력하면 된다.                        
  > 압축의 depth대로 괄호를 지정하려면 재귀함수 호출 전과 호출 후에 각각 여는 괄호와 닫는 괄호를 넣어주면 된다.    
- 백준 1780 종이의 개수 [문제](https://www.acmicpc.net/problem/1780)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution9.java)   
  > 문제유형 : 분할탐색                     
  > 색종이 만들기, 쿼드트리와 동일하게 풀면 된다.                
  > 단, 이 문제에서는 9등분하기 때문에 재귀를 호출할 때 9개의 영역으로 나누어 호출해야한다.       
- Programmers 모의고사 [문제](https://programmers.co.kr/learn/courses/30/lessons/42840)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution11.java)                   
  > 난이도 있는 문제는 아니지만 요구사항 대로 작성하다보니 전혀 예상치 못하게 코드량이 많아졌다..                              
  > 배열의 사이즈를 정하기 위한 반복문, 답을 구한 후에 answer에 담기 위해 한번 더 반복문을 돌리는 등                                             
  > 불필요한 코드들을 많이 작성한 것 같아 아쉬운 문제.              
- 백준 11659 구간 합 구하기 4 [문제](https://www.acmicpc.net/problem/11659)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution12.java)
  > 누적합을 이용하지 않으면 시간초과가 나는 문제.                        
  > 배열을 초기화할 때 누적합을 계산한 값을 담아야 한다. 이때 0번째 인덱스는 건너뛰고 1번째 인덱스부터 저장                        
  > 세번째 줄부터 (시작, 끝) 구간이 정해지면 배열의 끝인덱스에서 시작 - 1 인덱스를 뺀 값을 반환                       
  > 시작값을 포함하기 위해 시작 - 1을 해줘야한다.
- 백준 18870 좌표 압축 [문제](https://www.acmicpc.net/problem/18870)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution13.java)
  > 문제유형: 정렬                  
  > (1) 나중에 원본리스트를 키로 가져와야하기 때문에 리스트를 복사한다.                   
  > (2) 압축좌표값을 저장할 해시맵을 생성한다.                   
  > (2) 복사한 리스트를 오름차순 정렬하고, 해당 키가 이미 맵에 있는지 확인 후 없으면 맵에 저장한다. value는 0부터 증가시킨다.
  > (3) 원본 리스트를 순회하며 해당 요소의 키값을 stringbuilder에 담아 출력한다.         
- Programmers 쿼드압축 후 개수 세기 [문제](https://programmers.co.kr/learn/courses/30/lessons/68936)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution14.java)  
  > 쿼드트리 압축방식으로 압축한다.                  
  > 배열의 모든 원소를 비교하며 동일하면 0, 1에 따라 answer배열에 1씩 증가하고,                          
  > 다르면 크기를 4분할한 후 다시 체크한다.(재귀호출)            
- 백준 1436 영화감독 숌 [문제](https://www.acmicpc.net/problem/1436)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution15.java) 
  > 문제유형: 부르트포스                            
  > 숫자를 계속 증가시키다 666이 포함되어있으면 카운트한다.                               
  > contains()메소드를 이용하기 위해 문자열로 변환했다.                             
  > 카운트가 입력받은 n과 같으면 출력하고 반복문을 탈출한다.  
- 백준 1920 수 찾기 [문제](https://www.acmicpc.net/problem/1920)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution16.java)                      
  > 문제유형: 이분탐색                               
  > 이분탐색이란 반으로 나눠서 탐색하는 알고리즘이다.                                
  > 작동원리는 up/down게임과 유사하다. 찾으려는 값을 중간값과 비교해서 작은지, 큰지 판별해나가면 된다.                           
  > 이를 구현하기 위해 소스배열은 정렬되어있어야한다.                            
  > 중간인덱스를 구한 후 찾는 값을 중간인덱스값과 비교한다.                         
  > 작으면 끝인덱스를 중간 - 1                     
  > 크면 시작인덱스를 중간 + 1                       
  > 일치하면 탐색이 종료된다.                       
  > +- 1을 해주는 이유는 중간값이 이미 일치하지 않아 제외하고 탐색하기 위함이다.                       
  > 이 문제는 값이 있으면 1, 없으면 0을 반환하도록 되어있기 때문에                        
  > 메소드에서 boolean값을 반환하도록 했고,                      
  > 반환값이 true이면 1, false이면 0을 출력했다.                  
- 백준 10816숫자 카드 2 [문제](https://www.acmicpc.net/problem/10816)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution17.java)   
  > 문제유형: 이분탐색                        
  > lowerbound / upperbound의 개념이 필요하다.                                
  > 이분탐색으로 찾고자하는 원소의 상한선과 하한선 인덱스를 구한다.                                                           
  > 상한인덱스 - 하한인덱스의 값이 중복원소의 갯수가 된다.                             
  > 하한인덱스는 해당원소가 시작되는 인덱스이고(포함),                     
  > 상한인덱스는 해당원소가 아닌 첫 인덱스(포함x)이므로                        
  > 둘의 조건식을 다르게 지정해야한다.                          

## Dynamic Programming ##  
[top](#algorithm_practice)

- [DP 알고리즘에 대한 이해](Algorithm/src/dp/WhatIsDP.java)
  > DP 알고리즘 -> "규칙성"을 떠올리자.                   
  > 문제를 작은 단위로 쪼개서 규칙을 찾아내고, 그 규칙을 이용해 전체 문제를 해결하는 방식이다.                     
  > Top-down방식과 Bottom-up방식이 있다.                     
  > 피보나치 수열을 구하는 것을 예로 들어,                   
  > Top-down방식과 Bottom-up방식으로 각각 구현했다.                     
  >                             
  > (1)Bottom-up 방식 = Tabulation                       
	> 가장 낮은 단계에서 시작해서 위로 올라가는 방식                             
	> 반복문을 사용해서 구현한다.                                       
	> 피보나치 수열에서 가장 낮은 단계는 F(0) = 0 과 F(1) = 1 임                                       
	> 이 두개를 이용해 F(2)를 만들고, 이 결과는 F(3)을 만들 때 이용된다.                     
  > 이 과정을 반복하면 F(n)의 피보나치 수열을 구할 수 있다.                 
  > 일반적으로 bottom-up방식이 더 빠르게 동작한다.                   
  >                  
  > (2)Top-down 방식 = Memorization                
	> 재귀를 이용해 가장 낮은단계가 될 때까지 들어가서 찾는 방식이다.               
	> 이 때, 단순히 모든 노드에 대해 탐색할 경우 불필요한 값까지 반복하게되어 엄청나게 비효율적이므로,                
	> 한번 구한 값은 저장해나가면서(memorization) 탐색한다.                    
	> 일반적으로 HashMap을 사용해 저장한다.                 
	> Bottom-up 방식에 비해 하위문제들을 해결하기 위한 논리적 정렬단계가 필요하지 않으므로                 
	> 구현이 더 쉽다는 장점이 있다.                 

## Codeforces ##
[top](#algorithm_practice)

- Codeforces Round #784 (Div. 4) (3solved, result : 2 out of 8)
  - A [문제](https://codeforces.com/contest/1669/problem/A)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution4.java)               
  - B [문제](https://codeforces.com/contest/1669/problem/B)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution5.java)&nbsp;|&nbsp;[재풀이](Algorithm/src/etc/Solution5_2.java)
    > 배열을 정렬 후 다른 정수 값이 나올 때마다 카운트 변수를 초기화해준다.                   
    > 3 이상이 되면 해당 수를 바로 프린트 해주고 빠져나오게 했다.                   
    > 3개 이상의 값이 아예 없을 경우 -1을 프린트해주기 위해 boolean변수를 만들었다.                       
    > 반복문 이후에도 boolean이 true면 -1을 프린트해준다.                      
    > ~~contest 당시에는 통과되었으나 끝난 후 테스트케이스가 더 추가되면서 타임아웃으로 인해 오답처리 되었다.(1000ms 초과)~~
    > 
    > 재풀이 완료(2022.06.03) (249ms)                                             
    > 해시맵을 생성한다. 키: 요소 / 값: 카운트                    
    > 해당하는 키가 맵에 이미 있으면 해당하는 값을 받아온다.                     
    > 1 증가하고 다시 맵에 추가한다.                       
    > 맵 초기화가 끝난 후 값이 3이상인 키를 찾아 출력한다.                  
    > 만약 3이상인 값이 없을 경우를 구분하기 위해 boolean변수를 만들었다.                  
    > notIn이 true면 -1을 출력한다.                           
  - C [문제](https://codeforces.com/contest/1669/problem/C)&nbsp;|&nbsp;[풀이](Algorithm/src/etc/Solution6.java)
    > 배열의 짝수번째요소, 홀수번째요소들이 각각 모두 홀수거나 짝수일 경우 YES가 된다.                  
    > boolean변수를 4개 만들어 짝수번째 요소의 홀/짝, 홀수번쨰 요소의 홀/짝을 비교해 YES가 되는 모든 경우의 수를 조건식으로 나열하는 코드를 작성했다.             
    > 개인적으로 정말 무식하게 풀었다고 생각한다... 더 좋은 풀이법이 생각나면 추가해야겠다.
