import numpy as np


class Matrix:
    def __init__(self, m, n, arr):
        self.m = m
        self.n = n
        self.arr = arr


if __name__ == '__main__':
    t = int(input())
    while t:
        m, n = map(int, input().split())
        arr = []
        for i in range(0, m):
            s = input().split()
            tmp = [int(x) for x in s]
            arr.append(tmp)

        matrix = Matrix(m, n, arr)
        a = np.array(arr)
        b = a.transpose()
        res = a.dot(b)
        for i in res:
            for j in i:
                print(j, end=" ")
            print()
        t -= 1
