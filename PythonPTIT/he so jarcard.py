if __name__ == '__main__':
    x1 = input()
    y1 = input()
    s1 = x1.lower()
    s2 = y1.lower()
    x = set()
    y = set()
    cha = [' ', '.', ',', '?']
    for char in s1:
        if char not in cha:
            x.add(char)
    for char in s2:
        if char not in cha:
            y.add(char)

    a = list(set(x) | set(y))
    b = list(set(x) & set(y))
    print("%.2f" % (abs(len(b)) / abs(len(a))))
