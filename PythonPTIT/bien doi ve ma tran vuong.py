n,m = map(int,input().split())
a = []
for i in range(n):
    a.append([int(j) for j in input().split()])
if(n>m):
    gt = n-m
    for i in range(n):
        if(i%2!=0 or i+1>gt*2):
            for j in range(m):
                print(a[i][j],end=" ")
            print()
else:
    gt = m-n
    for i in range(n):
        for j in range(m):
            if((j+1)%2!=0 or (j+1)>gt*2):
                print(a[i][j],end=" ")
        print()