n = int(input())
arr = []
arrOdd = []
arrEven = []
while(n > 0):
    data = input()
    base = data.split()
    for i in range(len(base)):
        arr.append(int(base[i]))
        if(int(base[i]) % 2 == 0): arrEven.append(int(base[i]))
        else: arrOdd.append(int(base[i]))
    n -= len(base)
arrEven.sort()
arrOdd.sort()
arrOdd = arrOdd[::-1]
i = 0
j = 0
for index in range(len(arr)):
    if((arr[index] % 2) != 0):
        print(arrOdd[j], end = " ")
        j += 1
    else:
        print(arrEven[i], end = " ")    
        i += 1
print()