from operator import truediv


a, b = map(int, input().split())
a = bool(a) #0 : false 
b = bool(b) #0 : false

print(a, b) 
#0 , 0 a=b
#0, 10 -> false
#10, 0 -> false

print(True and True)
print(True and False)
print(False and False)
print(False and True) 
print((not(a) and not(b)) or (a and b))
# not a  = true
# not b = false
# a and b false