@echo off
javac -d dist clock/main/*.java
java -cp dist clock.main.Main
