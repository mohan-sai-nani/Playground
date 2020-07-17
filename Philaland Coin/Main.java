t = []
for _ in range(int(input())):
  t.append(int(input()))
for i in t:
  c = 0
  while i >= 1:
    i /= 2
    c += 1
  print(c)