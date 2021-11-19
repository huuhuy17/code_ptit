def triMulti(x,y,z):
    """
    đây là hàm trả về tích của 3 số 
    parameter: x,y,z kiểu int
    return: tích 3 số truyền vào
    """
    s = x*y*z
    return s

# in ra kết quả hàm triMulti khi truyền vào 3 số 2,3,4
print(triMulti.__doc__)
print(triMulti(2,3,4))