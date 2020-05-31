from firebase import firebase
import pyautogui

FIREBASE_HOST = "https://tremor-therapy.firebaseio.com"
FIREBASE_AUTH = "Pf0iWPaFO2NrPCXTpGsmj87nXDRlmz3rHEdBhKvd"
email = 'rafirasheed.tc99@gmail.com'
authentication = firebase.FirebaseAuthentication(FIREBASE_AUTH, email, extra={'id': 123})

firebase = firebase.FirebaseApplication(FIREBASE_HOST, authentication=authentication)
while True:
    result = firebase.get('/Push/Int/''','')
    if result == 1:
        pyautogui.press('D')
    if result == 2:
        pyautogui.press('A')
    if result == 3:
        pyautogui.press('W')
    if result == 4:
        pyautogui.press('W')
        


