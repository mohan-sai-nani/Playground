import math
n = int(input())
li = []
for i in range(1, int(math.sqrt(n)) + 1):
  if n % i == 0:
    li.append(i)
    li.append(n//i)
li = list(set(li))
li.sort()
print(*li)