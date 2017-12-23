# JavaServer-NodeMCUclient

in this project, i write server side with Java using Eclipce Oxygen and clients with ArduinoIDE, 
i am using nodemcu 12e for clients. 
communucation protocol is tcp/ip. this is the intro to work and connect java servers and nodemcu clients.


-23.12.2017-
today i write some project to communicate server and client in same wifi.

1. sender.server and receiver.client: 
  in this project, server is only sending data once a second to client. client just listening to server. 
  you can see data flow on arduino serial monitor.

2. receiver.server and sender.client: 
  in this project, clients are only sending data once a second to client. server just listening to clients. 
  you can see data flow on eclipce console.


-22.12.2017-
this repository contains a server written with java and a client running on nodemcu 12e written with arduino ide.

i am working on a network it has 10 client(or more) in local. clients running on nodemcu and server on a desktop pc.  
maybe in future days server run on a rasperrypi.

clients and server must be connected same wifi(modem).




--- big note ---
22.12.2017: i didn't use git before so this is my first repository.
22.12.2017: i am sorry about my dirty english.
