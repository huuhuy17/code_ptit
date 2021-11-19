n,m = map(int,input().split())
a = [int(i) for i in input().split()]
a1 = set(a)
a1 = list(a1)
a1.sort()
a2 = []
max = -10e9
max1 = -10e9
check = 0
dem = 0
for i in a1:
    a2.append(a.count(i))
    if max < a.count(i):
        max = a.count(i)
for i in range(len(a2)):
    if(a2[i]!=max and a2[i]>max1 ):
        max1 = a2[i]
        check = 1
        dem = i
if check == 0: print("NONE")
else : print(a1[dem])