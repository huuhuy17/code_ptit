import math

t = int(input())
sum = 0
while t > 0:
    x = int(input())
    
    n = x
    i = 2
    while n > 0:
        while n % i == 0:
            n /= i
            sum += i
        i += 1
    t -= 1

print(sum)