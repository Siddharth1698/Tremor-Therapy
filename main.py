# main.py

import machine
import time

pin = machine.Pin(2, machine.Pin.OUT)
print("hi")
for i in range(10):

	pin.value(1)
	time.sleep(0.5)
	pin.value(0)

	time.sleep(0.5)