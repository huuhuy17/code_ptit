t = int(input())
while t>0 :
    s = input()
    s1 = ""
    s2 = ""
    sum = 0
    for i in s:
        if '0' <= i and i <= '9':
            s1 += i
        else :
            s2 += i
    for i in range(len(s1)):
        sum += int(s1[i])
    s2 = list(s2)
    s2.sort()
    s2.append(sum)
    for i in range(len(s2)):
        print(s2[i],end="")
    print() 
    t -= 1