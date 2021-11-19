while 1:
    n = int(input())
    if n == 0 : 
        break
    max = 0
    min = 1e99
    for i in range(n):
        x = int(input())
        if x!=min and x !=max:
            if(x<min) : min = x
            if(x>max) : max = x
    if(max == min): print("BANG NHAU")
    else: print(min,max)