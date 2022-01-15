
class Rectangle:
    def __init__(self, h, w, c):
        self.h = h
        self.w = w
        self.c = c

    def chuVi(self):
        return (self.h + self.w) * 2

    def dienTich(self):
        return self.h * self.w

    def chuanHoa(self):
        t = self.c.lower()
        t = t[0].upper() + t[1:]
        return t


if __name__ == '__main__':
    arr = input().split()
    h = int(arr[0])
    w = int(arr[1])
    c = arr[2]
    if h > 0 and w > 0:
        r = Rectangle(h, w, c)
        print(r.chuVi(), r.dienTich(), r.chuanHoa())
    else:
        print("INVALID")

