n = input()
s = ""        
if len(n)%3==2: s="0"+n    
elif len(n)%3==1: s= "00"+n
else : s = n
s1=""
temp=""
for i in range(len(s)):
    if(i%3==2):
        temp+=s[i]
        if(temp=="000") :s1+="0"
        elif temp=="001" : s1+="1"
        elif temp=="010" : s1+="2"
        elif temp=="011" : s1+="3"
        elif temp=="100" : s1+="4"
        elif temp=="101" : s1+="5"
        elif temp=="110" : s1+="6"
        elif temp=="111" : s1+="7"
        temp=""
    else : temp+=s[i]
print(s1)