# 그 불 값(True/False) 이 서로 다를 때에만 True 를 출력하는 프로그램을 작성해보자.
a, b = map(int, input().split())
a = bool(a)
b = bool(b)

print(a, b)

print(a and (not b)) # 0 : false , 10 true-> false  --> false
print((not(a) and b)) # 0 : false -> ture , 10 true  -> true
print((a and (not b)) or (not(a) and b))

# print(a and not(b))
# print((not a) and b)

# print(True and True)
# print(True and False)
# print(False and False)
# print(False and True) 