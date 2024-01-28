before = 0
while True:
    num = round(float(input()), 2)
    if num == 999:
        break
    if before!=0:
        print(f'{num-before:.2f}')
        before = num
    else:
        before = num