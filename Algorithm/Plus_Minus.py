#!/bin/python3

import sys

def plusMinus(arr):
    positives = 0
    negatives = 0
    zeroes = 0
    for each in arr:
        if each > 0:
            positives += 1
        elif each < 0:
            negatives += 1
        elif each == 0:
            zeroes +=1
    print("%.6f" % (positives / len(arr)))
    print("%.6f" % (negatives / len(arr)))
    print("%.6f" % (zeroes / len(arr)))

if __name__ == "__main__":
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    plusMinus(arr)
