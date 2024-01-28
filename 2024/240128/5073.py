while True:
    triange_arr = list(map(int, input().split()))
    triange_arr.sort()
    one = triange_arr[0]
    two = triange_arr[1]
    max_one = triange_arr[2]
    if one == 0 and two == 0 and max_one == 0:
        break
    else:
        if one + two > max_one:
            if one == two == max_one:
                print('Equilateral')
            elif max_one == two or one == two:
                print('Isosceles')
            else:
                print('Scalene')
        else:
            print('Invalid')