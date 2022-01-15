import math


def object(tu, mau):
    return PS(tu, mau)


class PS:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def pstg(self):
        tmp = math.gcd(self.x, self.y)
        self.x = self.x / tmp
        self.y = self.y / tmp

    def add(self, PS):
        mauso = self.y * PS.y
        tuso = self.x * PS.y + self.y * PS.x
        return object(tuso, mauso)

    def __str__(self):
        return "{}/{}".format(int(self.x), int(self.y))


x, y, z, t = map(int, input().split())
a = PS(x, y)
b = PS(z, t)
res = a.add(b)
res.pstg()
print(res)
