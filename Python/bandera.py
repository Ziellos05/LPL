import math

x = int(input())
y = int(input())

for i in range(0, x):
    for j in range(0, y):
        if j == int((y / 2)) or i == int((x / 2)):
            print("+", end="")
        else:
            print("0", end="")
    if i <= x-2:
        print()