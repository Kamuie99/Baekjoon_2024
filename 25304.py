total = int(input())

T = int(input())

sum = 0
for test_case in range(1, T+1):
    a, b = map(int, input().split())
    sum += (a*b)

if total == sum:
    print('Yes')
else:
    print('No')