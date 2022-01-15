
class SoPhuc:
    def __init__(self, thuc, ao):
        self.ao = ao
        self.thuc = thuc

    def __str__(self):
        a = abs(self.thuc)
        b = abs(self.ao)
        if self.ao > 0:
            return "{} + {}i".format(self.thuc, self.ao)
        else:
            return "{} - {}i".format(self.thuc, b)


def add(s1: SoPhuc, s2: SoPhuc):
    a = s1.thuc + s2.thuc
    b = s1.ao + s2.ao
    return SoPhuc(a, b)


def multiplication(s1: SoPhuc, s2: SoPhuc):
    a = s1.thuc * s2.thuc - s1.ao * s2.ao
    b = s1.ao * s2.thuc + s1.thuc * s2.ao
    return SoPhuc(a, b)


if __name__ == '__main__':
    n = int(input())
    while n > 0:
        x, y, z, t = map(int, input().split())
        a = SoPhuc(x, y)
        b = SoPhuc(z, t)
        c = add(a, b)
        d = multiplication(c, c)
        c = multiplication(c, a)
        print(c.__str__() + ", " + d.__str__())
        n -= 1
