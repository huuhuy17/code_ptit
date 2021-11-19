t = int(input())
dem = 1
while(t>0):
    s1 = input()
    s2 = input()
    l = len(s1)
    print(f"Test {dem}: ",end=" ")
    s1=list(s1)
    s2=list(s2)
    s1.sort()
    s2.sort()
    check = 1
    for i in range(l):
        if(s1[i]!=s2[i]) : check = 0
    if(check==0) : 
        print("NO")
    else : print("YES")
    t-=1
    dem+=1
