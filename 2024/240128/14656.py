N = int(input())

student_arr = list(map(int, input().split()))

sort_arr = sorted(student_arr)

count = 0
for i in range(N):
    if student_arr[i] != sort_arr[i]:
        count += 1

print(count)