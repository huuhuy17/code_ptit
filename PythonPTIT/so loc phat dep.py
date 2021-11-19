s = input()
check = 1
dem1 = 0
dem2 = 0
if(int(s[0])!=6): check = 0
else:
    for i in range(1,len(s)):
        if(int(s[i])!=6 and int(s[i])!=8): 
            check = 0
            break
        if(i<len(s)-2):
            if(int(s[i])==int(s[i+1])==int(s[i+2])==8):
                check = 0 
                break
if(check == 0): print("NO")
else: print("YES")