def gcd(a, b):
    if(b == 0): return a
    else: return gcd(b, a%b)
a,b=map(int,input().split())
for i in range(a, b+1):
    for j in range(i+1, b+1):
        if(gcd(i, j) == 1):
            for l in range(j+1, b+1):
                if(gcd(j, l) == 1 and gcd(l, i) == 1):
                    print("(" + str(i) + ", " + str(j) + ", " + str(l) + ")")