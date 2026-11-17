import random

scores = []
scores.append(90)
scores.append(75)
print(scores)

words = []
for i in range(0, 3):
    words.append("potato")

rolls = []
rolls.append(random.randint(1, 6))
print(rolls)

for i in range(0, len(words)):
    print(words[i])

print("Scores: ", end="")
print(scores[0], end="")
for i in range(1, len(scores)):
    print(", " + str(scores[i]), end="")
print()