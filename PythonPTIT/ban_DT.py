
class KhachHang():
    def __init__(self, ngay, ten, sdt):
        self.ngay = ngay[5:]
        self.ten = ten
        self.sdt = sdt
        self.tendem = ten.split()[-2]

    def __str__(self):
        return self.ten + ": " + self.sdt + " " + self.ngay


if __name__ == '__main__':
    l = []
    with open("SOTAY.txt") as fileobject:
        l = fileobject.readlines()
        l = [i[:-1] for i in l]

    ds_KH = []
    start, end = 0, 0
    for i in range(1, len(l)):
        if l[i][:4] == "Ngay":
            end = i
            ngay = l[start]
            for j in range(start + 1, end, 2):
                a = KhachHang(ngay, l[j], l[j+1])
                ds_KH.append(a)
            start = end

    ngay = l[start]
    for j in range(start + 1, len(l), 2):
        a = KhachHang(ngay, l[j], l[j+1])
        ds_KH.append(a)

    for i in range(len(ds_KH)-1):
        for j in range(i+1, len(ds_KH)):
            if ds_KH[i].ten > ds_KH[j].ten:
                tmp = ds_KH[i]
                ds_KH[i] = ds_KH[j]
                ds_KH[j] = tmp
            elif ds_KH[i].ten == ds_KH[j].ten:
                if ds_KH[i].tendem > ds_KH[j].tendem:
                    tmp = ds_KH[i]
                    ds_KH[i] = ds_KH[j]
                    ds_KH[j] = tmp

    with open("DIENTHOAI.txt", 'w') as fileobject:
        for i in ds_KH:
            s = i.__str__() + "\n"
            fileobject.write(s)


