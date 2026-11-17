letter = input("Pick a letter: ")
size = int(input("How many? "))

for x in range(0, size):
    print(letter, end="")
print()

for row in range(0, 2):
    for x in range(0, 6):
        print("=", end="")
    print()