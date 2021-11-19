def tinh(n,b):
    res=""
    temp=n
    while(temp>0):
        du = temp%b
        if du >= 10:
            res+=str(chr(du+55))
        else : res+=str(du)
        temp=int(temp/b)
    print("".join(reversed(res)))
t = int(input())
while(t>0):
    n,b = map(int,input().split())
    tinh(n,b)
    t-=1
