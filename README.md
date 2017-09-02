compiling like this works:
```
fregec -fp build -d build src/main/frege/de/example/MyError.fr
javac -d build -cp fregec.jar:build src/main/java/de/example/MyException.java
fregec -fp build -d build src/main/frege/de/example/Main.fr
```
