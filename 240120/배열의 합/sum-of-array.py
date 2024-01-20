# 입력 받기
A = []
for _ in range(4):
    A.append(list(map(int, input().split())))

total = [0,0,0,0]
for i in range(len(A)):
    total[i] = (sum(A[i]))

for i in range(len(total)):
    print(total[i])