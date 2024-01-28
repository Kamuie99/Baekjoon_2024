score_arr = []
for i in range(5):
    score_arr.append(int(input()))

new_score = []

for score in score_arr:
    if score < 40:
        new_score.append(40)
    else:
        new_score.append(score)

print(sum(new_score) // 5)