b = []
n = int(input())
for i in range(n):
    b.append([int(j) for j in input().split()])
a=[]
a.append(int(b[0][1]+b[0][2]-b[1][2])/2)
for i in range(1,n):
    a.append(b[0][i]-a[0])
for i in a:
    print(int(i),end=" ")