a, b, c = map(int, input().split())
#print(a, b, c)
d = (a if a<b else b) if ((a if a<b else b) < c) else c

print(d)