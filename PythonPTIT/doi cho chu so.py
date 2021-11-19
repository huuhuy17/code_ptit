t=int(input())
while t>0:
    t-=1
    s=input()
    d=0
    g=""
    for i in range(len(s)-2,-1,-1):
        max="/"
        check=0
        for j in range(i+1,len(s),1):
            if s[i]>s[j] and max<s[j]:
                max=s[j]
                check=j
        if check!=0:
            h=list(s)
            h[i]=s[check]
            h[check]=s[i]
            g=''.join(h)
            d=1
            break
    if d==0 or g[0]=='0': print("-1")
    else: print(g)