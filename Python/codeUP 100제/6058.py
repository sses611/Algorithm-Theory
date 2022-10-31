# 2개의 정수값이 입력될 때,
# 그 불 값(True/False) 이 모두 False 일 때에만 True 를 출력하는 프로그램을 작성해보자.


a, b = map(int, input().split())
a = bool(a) #0 : false 
b = bool(b) #0 : false

print(a, b) 
#0 , 0 a = b
#0, 10 -> false, true
#10, 0 -> true, false
print(a and b)

# print(True and True)
# print(True and False)
# print(False and False)
# print(False and True)