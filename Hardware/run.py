from umqtt.robust import MQTTClient
import time
import machine as m

ubidotsToken = "BBFF-1hiiQrK8tqvkcrRaC2tfA6BkIHzEXu"
clientID = "value"
client = MQTTClient("clientID", "industrial.api.ubidots.com", 1883, user = ubidotsToken, password = ubidotsToken)
pin13 = m.Pin(13, m.Pin.IN, m.Pin.PULL_UP)

def publish():
    while True:
        client.connect()
        lat = 6.2
        lng = -75.56
        var = 1
        msg = b'{"location": {"value":%s, "context":{"lat":%s, "lng":%s}}}' % (var, lat, lng)
        print(msg)
        var = var + 1
        client.publish(b"/v1.6/devices/ESP32", msg)
        time.sleep(1)

publish()
