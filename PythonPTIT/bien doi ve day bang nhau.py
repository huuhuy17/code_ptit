n = int(input())
a = [int(i) for i in input().split()]
b = list(a)
a.sort()
dem1 = 0
gt1 = a[int(n/2)-1]
dem2 = 0
gt2 = a[int(n/2)]
kt1,kt2=0,0
for i in range(n):
    if(b[i]==gt1):
        kt1=i
    if(b[i]==gt2):
        kt2=i
for i in range(n):
    dem1+=abs(gt1-a[i])
    dem2+=abs(gt2-a[i])
if dem1 == dem2 and kt1 < kt2:
        print(dem1,b[kt1])
else:
    print(dem2,b[kt2])