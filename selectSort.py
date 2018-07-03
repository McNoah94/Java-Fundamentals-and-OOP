arr = [1,3,5,-13,8,200,-1,2,4,7,6,25]
def bubbleSwap(arr):
    for j in range (0,len(arr)-1):
        for i in range(0,len(arr)-j-1):
            if arr[i]>arr[i+1]:
                arr[i], arr[i+1] = arr[i+1],arr[i]
    return arr
# print(bubbleSwap(arr))
def selectSort(arr):
    for i in range(0, len(arr)-1):
        mini = arr[i]
        count = 0
        for j in range(i, len(arr)):
            if arr[j] < mini:
                mini = arr[j]
                count = j
        arr[i], arr[count] = arr[count], arr[i]
    return arr
print(selectSort(arr))