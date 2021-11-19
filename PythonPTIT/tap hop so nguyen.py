n,m = map(int,input().split())
a = [int(i) for i in input().split()]
b = [int(i) for i in input().split()]
a.sort()
b.sort()
a = set(a)
b = set(b)
res1 = list(a&b)
res2 = list(a-b)
res3 = list(b-a)
res1.sort()
res2.sort()
res3.sort()
for i in res1:
    print(i,end=" ")
print()
for i in res2:
    print(i,end=" ")
print()
for i in res3:
    print(i,end=" ")
print()