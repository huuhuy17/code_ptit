def mySort(arr):
    for i in range(0,len(arr)-1):
        for j in range(i+1, len(arr)):
            if arr[i] > arr[j]:
                arr[i], arr[j] =  arr[j], arr[i]
    return arr

arr = [4,6,7,1,5,3,8,9]
print(mySort(arr))