# ax = int(input())
# ay = int(input())
# bx = int(input())
# by = int(input())
# cx = int(input())   
# cy = int(input())
# dx = 0
# dy = 0
# if(ax==bx):
#     if(ay==by):
#         dx = cx
#         dy = cy
#     if(ay==cy):
#         dx=cx
#         dy=by
#     if(by==cy):
#         dx=cx
#         dy=ay
# if(ax==cx):
#     if(ay==by):
#         dx = bx
#         dy = cy
#     if(ay==cy):
#         dx=bx
#         dy=by
#     if(by==cy):
#         dx=bx
#         dy=ay
# if(bx==cx):
#     if(ay==by):
#         dx = ax
#         dy = cy
#     if(ay==cy):
#         dx=ax
#         dy=by
#     if(by==cy):
#         dx=ax
#         dy=ay
# print(dx)
# print(dy)


from _typeshed import Self


class User:
    first_name = ''
    last_name = ''

    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def description_user():
        print("Đây lớp User")


    def welcome_user(self):
        print("Tên của người dùng là", self.first_name + " " + self.last_name)