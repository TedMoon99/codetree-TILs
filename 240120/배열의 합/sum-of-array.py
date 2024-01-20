# 입력 받기
A = [
    sum(list(map(int, input().split())))
    for _ in range(4)
]
for i in range(len(A)):
    print(A[i])