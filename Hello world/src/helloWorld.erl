% hello world program
-module(helloWorld). 
-export([start/0]). 

start() -> 
   io:fwrite("Hello, world!\n").