# 공백을 기준으로 값을 나누어 배열에 할당
input_arr = list(map(int, input().split()))
# 오름차순으로 정렬
input_arr.sort()
# 0이 아닌 값을 세는 count 변수 생성
count = 0
# 배열 안의 수들을 순회하면서 0이하인 수들을 count
for number in input_arr:
    if number <= 0:
        count += 1
# 오름차순 정렬 되어 있기 때문에, 양수를 만나면 즉시 종료
    else:
        break
# 배열의 총 길이 - count 수를 하면 양수 개수만 남음
result = len(input_arr) - count
# 해당 양수 개수 리턴
print(result)