n = int(input())
a = [int(i) for i in input().split()]
def nt(a):
    if a<2 : return False
    i=2
    while i<=a/2 :
        if(a%i==0):
            return False
        i+=1    
    return True
b = []
for i in range(n) :
    if(nt(a[i])) :
        b.append(a[i])
        a[i]=0
b.sort()
dem = 0
for i in range(n):
    if(a[i]==0):
        a[i]=b[dem]
        dem+=1
for i in range(n):
    print(a[i],end=" ")
print()