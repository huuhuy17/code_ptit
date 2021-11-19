import math
n = int(input())
a = []
hang = [0]*n
cot = [0]*n
dem = 0
for i in range(n):
    txt = input()
    for j in range(n):
        if(txt[j]=='C'):
            hang[i]+=1
            cot[j]+=1
for i in hang:
    if i>=2 :
        dem += math.comb(i,2)
for i in cot:
    if i>=2 :
        dem += math.comb(i,2)
print(dem)