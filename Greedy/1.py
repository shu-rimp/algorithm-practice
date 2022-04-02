#Backjoon11047 동전 0

n, k = map(int, input().split())    # 공백을 기준으로 정수 n, k값을 받음

count = 0
coin_array = []    # 동전의 종류를 받는 리스트

for _ in range(n) :
    coin_array.append(int(input()))

coin_array.sort(reverse = True)    # 내림차순으로 정렬

for i in coin_array :    # 큰 값부터 차례대로 나누어 count에 추가한다.
    count += k // i
    k %= i

print(count)
    