if __name__ == '__main__':
    t = int(input())
    while t:
        s = input()
        he_so_3 = ['0', '1', '2']
        if any(char not in he_so_3 for char in s):
            print("NO")
        else:
            print("YES")
        t -= 1
