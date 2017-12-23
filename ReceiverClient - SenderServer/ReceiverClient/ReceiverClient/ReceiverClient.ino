#include <ESP8266WiFi.h>

char*        wifiName = "x";     // Wifi Name
char*        wifiPass = "y";     // Wifi Password

const uint16_t  port      = 8080;
const char *    serverIP  = "192.168.1.55"; // ip or dns

WiFiClient      client;
  
void setup() 
{
  Serial.begin(115200);
  delay(10);

  ConnectToWifi();
  
}

void loop() 
{
  ConnectToServer();
  //String sendingData = "I am a Client and my IP: ";
  String receivedData = "";
  //SendDataToServer(sendingData);
  receivedData = GetDataFromServer();
  Serial.print("Server> ");
  Serial.println(receivedData);
  CloseClient();
  
}

void CloseClient()
{
}

String GetDataFromServer()
{
  return client.readStringUntil('>');
}

void SendDataToServer(String data)
{
  client.print(data);
}

void ConnectToServer()
{
  Serial.print("Connecting to ");
  Serial.println(serverIP);

  if (!client.connect(serverIP, port)) 
  {
        Serial.println("connection failed");
        Serial.println("wait 5 sec...");
        delay(5000);
        return;
  }
  else
  {
    Serial.println("Connection Succes");
    Serial.println("");
  }
}


void ConnectToWifi()
{
  Serial.print("Connecting to ");
  Serial.println(wifiName);
  
  WiFi.begin(wifiName, wifiPass);

  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }

  Serial.println("");
  Serial.println("WiFi connected");  
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
}

