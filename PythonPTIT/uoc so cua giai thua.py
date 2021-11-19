t = int(input())
while(t>0):
    n,p = map(int,input().split())
    dem = 0
    x = 1
    while n/(p**x) > 1:
        dem += int(n/(p**x))
        x+=1
    print(dem)
    t-=1
