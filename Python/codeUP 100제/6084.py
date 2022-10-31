h, b, c, s = map(int, input().split())
save = (h * b * c * s)

print(round((save / 8 / 1024 / 1024),1), "MB")
