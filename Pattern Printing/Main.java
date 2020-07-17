n = int(input())
x = 10
for i in range(n):
  print('*' * (i * 2), end = '')
  for j in range(n - i):
  	print(x, end = '')
  	x += 10
  y = n - i - 1
  z = (((y * (y+1)) // 2) * 2 ) * 10
  t = x + z
  for k in range(n - i - 1):
    print(t, end = '')
    t += 10
  print(t // 10)
    