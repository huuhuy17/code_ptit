def hand_ling(s):
    s=str(s)
    res=""
    sum=0
    for i in range(0,len(s)):
        sum=(sum+ord((s[i]))-65)%26
    for i in range(0,len(s)):
        res+=chr((sum+ord((s[i]))-65)%26+65)
    return res
test=int(input())
while(test>0):
    test-=1
    s=input()
    res1=""
    res2=""
    for i in range(0,len(s)//2):
        res1+=s[i]
    for i in range(len(s)//2,len(s)):
        res2+=s[i]
    res1=hand_ling(res1)
    res2=hand_ling(res2)
    res=""
    for i in range(0,len(res1)):
        res+=chr((ord(res1[i])+ord(res2[i])-130)%26+65)
    print(res)