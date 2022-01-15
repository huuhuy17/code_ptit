import math


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self, Point):
        d = math.sqrt((self.x - Point.x) ** 2 + (self.y - Point.y) ** 2)
        return "%.4f" % d


if __name__ == '__main__':
    n = int(input())
    while n > 0:
        x, y, z, t = map(int, input().split())
        a = Point(x, y)
        b = Point(z, t)
        print(a.distance(b))
        n -= 1
