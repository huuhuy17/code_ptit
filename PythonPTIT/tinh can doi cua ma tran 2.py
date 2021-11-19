n = int(input())
a = []
sum,sum1,sum2=0,0,0
for i in range(n):
    a.append([int(j) for j in input().split()])
for i in range(n):
    for j in range(n):
        if(j<n-i-1):
            sum1 += int(a[i][j])
for i in range(n):
    for j in range(n):
        if(j!=n-i-1):
            sum+=int(a[i][j])
sum2 = sum-sum1
k = int(input())
gt = abs(sum1-sum2)
if(gt > k):
    print("NO")
    print(gt)
else:
    print("YES")
    print(gt)
