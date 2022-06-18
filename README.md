## make shared lib and use in java

### 1) download jna.jar

### 2) struct java folders
com -> sun ->jna ->exmaple
com과 같은 위치에 jna.jar를 위치시킨다.

### 3) make shared lib
```
add_library(jnalsw SHARED calculator.cpp)
```
SHARED 를 이용하여 shared lib를 만들고 

install 했을시 위치는 so 파일은 /usr/local/lib/

header 파일은 /usr/local/include/ 로 CMakeLists에서 install설정들을 해준다.

### 4) java
jna에서 Library interface를 만들고 Native.load를 통해 shared lib를 불러온다.


구현되어있는 method를 interface에 초기화해주고 main에서 사용하면 된다.

### 5) command
1.make lib
```
cd build
cmake ..
make
sudo make install
```
2.java compile
```
javac -classpath .:jna.jar -g com/sun/jna/examples/CPPLibtest.java
java -classpath .:jna.jar com.sun.jna.examples.CPPLibtest
```
