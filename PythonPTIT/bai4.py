def isPalindrome(st):
    return st == st[::-1]

st1 = 'HUY'
st2 = 'HHHH'
print(isPalindrome(st1))
print(isPalindrome(st2))