def nt(a):
    if a < 2: return False
    i = 2
    while i <= a / 2:
        if a % i == 0:
            return False
        i += 1
    return True


n, m = map(int, input().split())

a = []
check = 0
max = -10e9
for i in range(n):
    a.append([int(j) for j in input().split()])
for i in range(n):
    for j in range(m):
        if nt(a[i][j]):
            if a[i][j] > max:
                max = a[i][j]
                check = 1
if check == 0:
    print("NOT FOUND")
else:
    print(max)
    for i in range(n):
        for j in range(m):
            if a[i][j] == max:
                print(f'Vi tri [{i}][{j}]')
