a, m, d, n = map(int, input().split())

for i in range(n-1):
  a = a * m + d
  # 1 -2 1 8
  # -1 -2 
print(a)