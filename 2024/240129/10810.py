N, M = map(int, input().split())

result = {}

for test_case in range(1, M+1):
    a, b, c = map(int, input().split())
    for j in range(a, b+1):
        result[f'{j}'] = c

for i in range(1, N+1):
    print(result.setdefault(f'{i}', 0), end=' ')