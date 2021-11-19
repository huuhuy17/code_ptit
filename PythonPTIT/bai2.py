import math
def isPrime(n):
    if n<2: return 0
    for i in range(2, int(math.sqrt(n)) + 1):
        if n%i == 0: return 0
    return 1

def primeList(arr):
    res = []
    for i in arr:
        if isPrime(i):
            res.append(i)
    return res

arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
print(primeList(arr))