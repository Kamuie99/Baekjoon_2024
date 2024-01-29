N, M = map(int, input().split())

result = {}
for i in range(1, N+1):
    result[f'{i}'] = i

for test_case in range(1, M+1):
    a, b = map(int, input().split())
    result[f'{a}'], result[f'{b}'] = result[f'{b}'], result[f'{a}']
    
result_arr = list(result.values())

for value in result_arr:
    print(value, end=' ')