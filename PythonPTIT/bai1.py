from tkinter import *

master = Tk()
master.configure(background="silver")
master.geometry("265x225")
master.title("Máy tính")
equation = StringVar()
expression = ""




def press(num):
    global expression
    expression = expression + str(num)
    equation.set(expression)


def equalpress():
    try:
        global expression
        total = str(eval(expression))
        equation.set(total)
        file = open('ketqua.txt', 'a')
        file.write(str(total))
        file.write("\n")
        file.close()
        expression = ""
    except:
        equation.set("Error")
        expression = ""


def clear():
    global expression
    expression = ""
    equation.set(expression)


expression_field = Entry(master, textvariable=equation).grid(columnspan=50, ipadx=70)
# tạo các button
button1 = Button(master, text="1", width="8", height="2", command=lambda: press(1)).grid(row=1, column=1)
button2 = Button(master, text="2", width="8", height="2", command=lambda: press(2)).grid(row=1, column=2)
button3 = Button(master, text="3", width="8", height="2", command=lambda: press(3)).grid(row=1, column=3)
button4 = Button(master, text="4", width="8", height="2", command=lambda: press(4)).grid(row=2, column=1)
button5 = Button(master, text="5", width="8", height="2", command=lambda: press(5)).grid(row=2, column=2)
button6 = Button(master, text="6", width="8", height="2", command=lambda: press(6)).grid(row=2, column=3)
button7 = Button(master, text="7", width="8", height="2", command=lambda: press(7)).grid(row=3, column=1)
button8 = Button(master, text="8", width="8", height="2", command=lambda: press(8)).grid(row=3, column=2)
button9 = Button(master, text="9", width="8", height="2", command=lambda: press(9)).grid(row=3, column=3)
button0 = Button(master, text="0", width="8", height="2", command=lambda: press(0)).grid(row=4, column=2)
decimal = Button(master, text=".", width="8", height="2", command=lambda: press(".")).grid(row=4, column=1)
# tạo các phép tính và các phím chức năng
plus = Button(master, text="+", width="8", height="2", command=lambda: press("+")).grid(row=3, column=4)
minus = Button(master, text="-", width="8", height="2", command=lambda: press("-")).grid(row=4, column=4)
multiplier = Button(master, text="x", width="8", height="2", command=lambda: press("*")).grid(row=1, column=4)
divid = Button(master, text="÷", width="8", height="2", command=lambda: press("/")).grid(row=2, column=4)
equal = Button(master, text="=", background="gray", width="8", height="2", command=equalpress).grid(columnspan=50,
                                                                                                    ipadx=100)
Clear = Button(master, text="Clear", background="red", width="8", height="2", command=clear).grid(row=4, column=3)

master.mainloop()
