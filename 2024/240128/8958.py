T = int(input())

for test_case in range(1, T+1):
    arr = input()
    count = 0
    sum = 0
    for i in range(len(arr)):
        if arr[i] =='O':
            count += 1
            sum += count
        else:
            count = 0
    print(sum)
