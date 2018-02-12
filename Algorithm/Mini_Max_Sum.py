#!/bin/python3

import sys

def miniMaxSum(arr):
    arr.sort()
    min = 0
    max = 0
    for i in range(0, len(arr)-1) :
        min += arr[i]
    for i in range(len(arr)-1, 0, -1) :
        max += arr[i]
    print(min, max)

if __name__ == "__main__":
    arr = list(map(int, input().strip().split(' ')))
    miniMaxSum(arr)
