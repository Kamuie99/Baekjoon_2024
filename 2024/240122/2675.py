T = int(input())

for test_case in range(1, T+1):
    a, b = map(str, input().split())
    a = int(a)
    for i in b:
        print(i*a, end="")
    print()