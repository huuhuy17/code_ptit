class ThiSinh:
    def __init__(self, hoten, ngaysinh, diem1, diem2, diem3):
        self.hoten = hoten
        self.ngaysinh = ngaysinh
        self.diem1 = diem1
        self.diem2 = diem2
        self.diem3 = diem3

    def __str__(self):
        tongdiem = self.diem1 + self.diem2 + self.diem3
        return "{} {} {}".format(self.hoten, self.ngaysinh, "%.1f" % tongdiem)


if __name__ == '__main__':
    hoten = input()
    ngaysinh = input()
    diem1 = float(input())
    diem2 = float(input())
    diem3 = float(input())
    t = ThiSinh(hoten, ngaysinh, diem1, diem2, diem3)
    print(t.__str__())

