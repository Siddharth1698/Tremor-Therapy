# Tremor-Therapy

**Overview**

Tremor Therapy is an interactive game using developed for helping children and teens with their therapy process for Tremors(Shaky Hands). It is intended to give the teraphist or doctor complete analytics about the ppatients by managing them remotely. Please feel free to start this repo and PR for better changes.


**Motivation**

We were motivated to build this project by the increasing discompforatablility of therapist and doctors of not able to treat their patients because of the cureent locdown and COVID-19 safety measures. Thousands of children undergoing issue after accidents, brain surgery, parkinson's disease , etc.. are stranded with no help to continue their recovery exercises. After some research we found that gaming are the most effective way of improving children and teens recovery as it makes the process fun and enjoyable.Thus, We wanted to thus build a gaming system that has some hardware at users(patients) end which can be used by the patient for gaming. The intelligent iot device gets the data realtime and helps the patient place games. This data can be further collected and provided to the doctor/therapist for personal analysis.


**Interfaces**

1)Patient(User): Game developed - game files
2)Doctor/Therapist: Android App for personal patients info and their daily gaming statistics - android files


**In this project**

1)design:contains all design related files wrt ui/ux

2)android:contains files related to android application on doctors phone.

3)game:game files of the project

4)hardware:complete work done wrt iot device.


**Software Used**

1)For developing this application we used Godot gaming engine which runs under GDScript language. Here is the documentation and installation link for Godot : https://docs.godotengine.org/en/stable/index.html  and used firebase api for auth purpose.

2)For android app we used firebase as backend and java language for developing the application.


**Hardware Used**

1)NodeMcu - ESP8266
2)MPU6050 - Sensor


**How to deploy?**

1)Download Godot.

2)Go to firebase console and create an project. Use the generated API and navigate to game -> static -> firebase.gd and paste the API in the space given.

3)Run the game files directly using the godot engine and play.

4)For demo you can create an account by registering on main page. But we restrict that this feature is completely available for the doctor only.


**How the game Works?**

1.We first have to login using a username and password:
![login](screenshots/login.png)


**FEEL FREE TO FORK THIS PROJECT AND USE IT FOR YOUR MEDICAL PURPOSES**



