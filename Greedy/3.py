#Baekjoon14659 한조서열정리하고옴ㅋㅋ

n = int(input())
count = 0
count_list = []
highest = 0
mount_list = list(map(int, input().split()))

for i in mount_list :
    if i < highest :
        count += 1

    else :
        highest = i    # 최대 봉우리 값을 i로 교체
        count_list.append(count) # count 값을 list에 추가
        count = 0    # count 초기화

count_list.append(count)    # highest값을 만나지 못하고 반복문이 끝났을 경우를 대비

print(max(count_list))
    