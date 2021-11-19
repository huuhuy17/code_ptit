def sumOfDigits(s):
    sum = 0
    for i in range(len(s)):
        sum += int(s[i])
    return sum

def sumOfDigits2(s):
    sum = 0
    for i in range(1, len(s)):
        sum += int(s[i])
    return sum

s = input()
count = 0
if(s[0] == '-'):
    i = 0
    while(len(s) > 1):
        if(i == 0): s = str(sumOfDigits2(s) + (ord('-') - ord('0')))
        else: s = str(sumOfDigits(s))
        i += 1
        count += 1
else:
    while(len(s) > 1):
        s = str(sumOfDigits(s))
        count += 1
print(count)