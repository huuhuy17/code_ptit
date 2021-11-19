msv = 9
for i in range(1,100 + msv):
    if i%4 == 0 and i%2==0:
        print("FizzBuzz")
    elif i%4==0:
        print("Buzz")
    elif i%2==0:
        print("Fizz")