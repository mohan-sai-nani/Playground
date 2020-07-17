n = int(input())
fives = int((n - 4) / 5)
if (n - fives * 5) % 2 == 0:
  ones = 2
else:
  ones = 1
twos = int((n - fives * 5 - ones) / 2)
print(ones + twos + fives, fives, twos, ones)