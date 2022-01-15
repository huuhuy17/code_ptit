class HoaDon:
    def __init__(self, ma, hoten, old, new):
        if ma < 10:
            self.ma = "KH0" + str(ma)
        else:
            self.ma = "KH" + str(ma)
        self.hoten = hoten
        self.old = old
        self.new = new

    def __str__(self):
        return "{} {} {}".format(self.ma, self.hoten, "%d" % self.tinhTien())

    def tinhTien(self):
        tien_nuoc = 0
        so_m3 = self.new - self.old
        if so_m3 <= 50:
            tien_nuoc = (so_m3 * 100) * 1.02
        elif 51 < so_m3 <= 100:
            tien_nuoc = (50 * 100 + (so_m3 - 50) * 150) * 1.03
        elif so_m3 > 100:
            tien_nuoc = (50 * 100 + 50 * 150 + ((so_m3 - 100) * 200)) * 1.05
        return tien_nuoc


if __name__ == '__main__':
    n = int(input())
    i = 1
    lst = []
    while i <= n:
        hoten = input()
        old = int(input())
        new = int(input())
        hoadon = HoaDon(i, hoten, old, new)
        lst.append(hoadon)
        i += 1

    for a in range(0, len(lst)):
        for b in range(a+1, len(lst)):
            if lst[a].tinhTien() < lst[b].tinhTien():
                tmp = lst[a]
                lst[a] = lst[b]
                lst[b] = tmp

    for tmp in lst:
        print(tmp.__str__())

