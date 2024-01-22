T = int(input())
check_enter = input()

gomgom = set()
count = 0
for test_case in range(1, T):
    check_str = input()
    if check_str != 'ENTER':
        if check_str not in gomgom:
            count += 1
            gomgom.add(check_str)
        else:
            continue
    elif check_str == 'ENTER':
        gomgom.clear()    

print(count)
