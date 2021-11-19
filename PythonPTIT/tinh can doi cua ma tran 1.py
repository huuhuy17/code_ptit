n = int(input())
a = []
sum1,sum2=0,0
for i in range(n):
    a.append([int(j) for j in input().split()])
for i in range(n):
    for j in range(i,n):
        if(i!=j):
            sum1 += int(a[i][j])
for i in range(n):
    for j in range(0,i):
        if(i!=j):
            sum2 += int(a[i][j])
gt = abs(sum1-sum2)
k = int(input())
if(gt > k):
    print("NO")
    print(gt)
else:
    print("YES")
    print(gt)