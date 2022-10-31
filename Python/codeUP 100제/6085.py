w, h, b = map(int, input().split())

img = w * h * b
storage = img / 8 / 1024 / 1024

print("%.2f"%storage, "MB")