laps = int(input("How many laps? "))
pace = input ("Fast or slow? ")
for x in range(0, 3):
    print(x)
for x in range(0, laps):
    print("Lap done!")
for x in range(0, 5):
    print("-", end="")
print()
if pace == "Fast":
    for x in range(0, laps):
        print("Zoom!")
    else:
        print("Take your time.")

length = input ("Please enter line length: ")
print(length)
g = input ("Do you want a horizontal or vertical line? ")
for x in range(0,4):
    print(x, end=", ")
print (4)

length = input ("Please enter line length: ")
print(length)
h = input ("Do you want a horizontal or vertical line? ")
for v in range(0,4):
    print(v)
print (4)

