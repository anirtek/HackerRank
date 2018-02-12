#!/bin/python3

import sys
import re

def timeConversion(s):
    d = {"01": "13", "02": "14", "03": "15", "04": "16", "05": "17", "06": "18", "07": "19", "08": "20", "09": "21", "10": "22", "11": "23"}
    if "PM" in s :
        times = s.replace("PM","").split(":")
        if(times[0] != "12") :
            return d.get(times[0])+":"+times[1]+":"+times[2]
        else :
            return times[0]+":"+times[1]+":"+times[2]
    else :
        times = s.replace("AM","").split(":")
        if(times[0] == "12") :
            times[0] = "00"
        s = times[0]+":"+times[1]+":"+times[2]
        return s

s = input().strip()
result = timeConversion(s)
print(result)
