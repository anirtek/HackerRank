#!/bin/python3

import sys

def birthdayCakeCandles(n, ar):
    maxCount = 0
    max = -1
    ar.sort()
    for each in range(n-1, -1, -1) :
        if(ar[each] >= max) :
            max = ar[each]
            maxCount += 1
    return maxCount
            

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = birthdayCakeCandles(n, ar)
print(result)
