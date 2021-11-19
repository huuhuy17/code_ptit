t = int(input())
while t>0 :
    n = int(input())
    a = [int(i) for i in input().split()]
    count = {}
    for i in a :
        if i in count:
            count[i]+=1
        else : count[i]=1
    for i in sorted(count, key=count.get, reverse=False):
       if count[i] % 2 != 0:
           print(i)
           break
    t-=1
