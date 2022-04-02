#Baekjoon11399 ATM

n = int(input())
time = 0

time_array = list(map(int, input().split()))    # 공백을 기준으로 숫자를 받고 리스트로 저장
time_array.sort()     # 오름차순 정렬

for i in range(len(time_array)+1) : # +1 하는 이유 : 마지막 요소를 포함하기 위해
    time += sum(time_array[0:i])    # sum() : 합계를 구하는 함수

print(time)
