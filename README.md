# CharCount
REST API that counts characters in line

## API Methods Description

- Get frequency of occurance of each character in a line (/charNumber/get)<br>

  <strong>Request parameters:</strong><br>
  inputLine - String<br>
  
  <strong>Allowed characters:</strong><br>
  A-Z a-z 0-9 - . _ ~ ( ) ' ! * : @ , ;<br>

  Usage of other characters may produce Bad Request 400 Error
  due to the RFC 3986 specification

## Request example
(Testing was performed with Postman)

URL should look like this:<br>
http://localhost:8080/charNumber/get?inputLine=bAbAAc

Output should be like this:<br>
"A": 3, "b": 2, "c": 1.
