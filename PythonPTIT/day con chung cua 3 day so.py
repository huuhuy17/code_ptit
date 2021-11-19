t = int(input())
while(t>0):
    def kt():
        n,m,k = [int(i) for i in input().split()]
        a = [int(i) for i in input().split()]
        b = [int(i) for i in input().split()]
        c = [int(i) for i in input().split()]
        check, c1,c2,c3 = 0,0,0,0
        while c1<n and c2<m and c3<k :
            if a[c1] == b[c2] == c[c3]:
                print(a[c1],end=" ")
                check = 1
                c1,c2,c3 = c1+1,c2+1,c3+1
            elif a[c1] < b[c2] : c1+=1
            elif b[c2] < c[c3] : c2+=1
            else: c3+=1
        if check == 0 : print("NO")
        print()
    kt()
    t-=1

