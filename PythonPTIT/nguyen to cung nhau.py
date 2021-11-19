n,k = map(int,input().split())
def uc(a,b):
        if b==0 : return a
        return uc(b,a%b)
a = 10**(k-1)
b = 10**(k)
s = ""
for i in range(a,b):
    if uc(i,n) == 1 :
        s += str(i) + " "
l = int(len(s.split())/10)
s= s.split()
c=0
d=10
dem = l
while l>0 :
    for i in range(c,d):
        print(s[i],end=" ")
    print()
    l-=1
    c=c+10
    d=d+10
for i in range(10*dem,len(s)):
    print(s[i],end=" ")
print()