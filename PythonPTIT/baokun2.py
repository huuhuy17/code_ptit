import math
def isPrime(n):
    if n<2: return 0
    for i in range(2, int(math.sqrt(n)) + 1):
        if n%i == 0: return 0
    return 1

def main():
    F = []
    n = 9
    i = 2
    for j in range(1, 1000):
        if isPrime(i)==1 and j%i==0 and j%(i*i)==0:
            F.append(j)
        if len(F) == 30 + n:
            break
    print(F[30+n-1])
main()