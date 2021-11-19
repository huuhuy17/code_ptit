n,m = map(int,input().split())
a = [int(i) for i in input().split()]
b = [int(i) for i in input().split()]
a = set(a)
b = set(b)
a = list(a)
b = list(b)
check = 1
for i in range(len(a)):
    if(a[i]!=b[i]):
        check = 0
        break
if(check == 0): print("NO")
else : print("YES")