t = int(input())
while t > 0:
    s = input()
    s1 = s[::-1]
    print(s)
    print(s1)
    check = True
    for i in range(0, len(s)):
        if abs(int(s[i] - s[i-1])) == abs(int(s1[i] - s1[i-1])):
            check = True
        else: 
            check = False
            break
    if check:
        print("YES")
    else: 
        print("NO")
    t -= 1