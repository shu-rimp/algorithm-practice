#Baekjoon10828 스택

stack = []
command = []

n = int(input())

for _ in range(n) :
    command.append(list(map(str, input().split())))

for i in command :
    if(i[0] == "push") :
        stack.append(i[1])
    elif(i[0] == "pop") :
        if stack :
            a = stack.pop()
            print(a)
        else :
            print(-1)
    elif(i[0] == "top") :
        if stack :
            print(stack[-1])
        else :
            print(-1)
    elif(i[0] == "size") :
        print(len(stack))
    elif(i[0] == "empty") :
        if stack :
            print(0)
        else :
            print(1)