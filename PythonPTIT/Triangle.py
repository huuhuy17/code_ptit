import math

from Point import Point


class Triangle:
    def __init__(self, x, y, z):
        self.a = x
        self.b = y
        self.c = z

    def chuVi(self):
        canh1 = self.a.distance(self.b)
        canh2 = self.b.distance(self.c)
        canh3 = self.c.distance(self.a)
        nua_chu_vi = (canh1 + canh2 + canh3) / 2
        chu_vi = math.sqrt(nua_chu_vi * (nua_chu_vi - canh1) * (nua_chu_vi - canh2) * (nua_chu_vi - canh3))
        return chu_vi


n = int(input())
while n > 0:
    a1, a2, b1, b2, c1, c2 = map(int, input().split())
    a = Point(a1, a2)
    b = Point(b1, b2)
    c = Point(c1, c2)
    d_a_b = a.distance(b)
    d_b_c = b.distance(c)
    d_a_c = c.distance(a)
    if d_a_b + d_b_c >= d_a_c and d_a_b + d_a_c >= d_b_c and d_b_c + d_a_c >= d_a_b:
        tri = Triangle(a, b, c)
        print(".3f" % tri.chuVi())
    else:
        print("INVALID")
    n -= 1
