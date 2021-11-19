n,m = map(int, input().split())
a = []
check = 0
max = -10e9
min = 10e9
for i in range(n):
    a.append([int(j) for j in input().split()])
for i in range(n):
    for j in range(m):
        if a[i][j]>max:
            max = a[i][j]
        if a[i][j]<min:
            min = a[i][j]
kt = max - min
for i in range(n):
    for j in range(m):
        if(a[i][j]==kt):
            check = 1
if(check == 0) :
    print("NOT FOUND")
else:
    print(kt)
    for i in range(n):
        for j in range(m):
            if(a[i][j]==kt):
                print(f'Vi tri [{i}][{j}]')
