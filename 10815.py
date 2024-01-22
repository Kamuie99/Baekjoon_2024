N = int(input())
cards = list(map(int, input().split()))
M = int(input())
checks = list(map(int, input().split()))

_dict = {}
for num in range(len(cards)):
    _dict[cards[num]] = 0

for i in range(M):
    if checks[i] not in _dict:
        print(0, end = " ")
    else:
        print(1, end = " ")