def nt(a):
        if a<2 : return False
        i=2
        while i<=a/2 :
            if(a%i==0):
                return False
            i+=1    
        return True
n = int(input())
a = [int(i) for i in input().split()]
b = dict.fromkeys(a)
check = 0
c = []
for i in b.keys():
    c.append(int(i))
l = len(c)
sum1 = 0
for i in range(0,l):
    sum2 = 0
    for j in range(i,l-1):
        sum2 += c[j+1]
    sum1 += c[i]
    if(nt(sum1) and nt(sum2)):
        print(i)
        check = 1
        break
if(check == 0) : 
    print("NOT FOUND")
