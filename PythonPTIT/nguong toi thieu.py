s = input()
n = int(input())
check = 0
a = []
l = len(s)
if(l%2!=0):
    l = l - 1
for i in range(0,l,2):
    a.append(s[i]+s[i+1])
a.sort()
b = dict.fromkeys(a)
for i in b:
    if(a.count(i)>= n):
        print(int(i),a.count(i))
        check = 1
if(check == 0) : 
    print("NOT FOUND")