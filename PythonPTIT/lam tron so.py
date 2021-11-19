t = int(input())
while (t>0) :
    a = input()
    dai = len(a)
    b = int(a)
    if a=="5" : print(a)
    else :   
        for i in range(0,dai-1):
            if b % 10**(i+1) == 5*(10**i) : b = b+10**i
            b=round(b,-1-i)
        print(b)    
    t=t-1
