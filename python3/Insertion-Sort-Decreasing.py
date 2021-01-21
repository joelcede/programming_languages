"""Rewrite the INSERTION-SORT procedure to sort
into nonincreasing instead of nondecreasing order"""

array = [31,41,59,26,41,58]
lastArray = array[-1]
count1 = 0
count2 = 1
variable = 0

while True:
    if (array[count1] == lastArray):
        break
    count1 += 1

while (count2 < count1):
    count2 += 1

for i in range(count1+1):
    for j in range(count2+1):
        if (array[i] > array[j]):
            variable = array[i]
            array[i] = array[j]
            array[j] = variable

def orderMinToMaxArray():
    print(array)

orderMinToMaxArray()
