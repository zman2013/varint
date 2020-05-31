[![Travis Build](https://api.travis-ci.org/zman2013/varint.svg?branch=master)](https://api.travis-ci.org/zman2013/varint.svg?branch=master)
[![Coverage Status](https://coveralls.io/repos/github/zman2013/varint/badge.svg?branch=master)](https://coveralls.io/github/zman2013/varint?branch=master)


# varint
A java implementation of the varint

## Getting started
### Setting up the dependency
* Gradle
```groovy
implementation "com.zmannotes:varint:1.0.0"
```
* Maven
```xml
<dependency>
    <groupId>com.zmannotes</groupId>
    <artifactId>varint</artifactId>
    <version>1.0.0</version>
</dependency>
```
### example
```java
    int origin = 1234774;

    ByteBuffer byteBuffer = ByteBuffer.allocate(10);
    VarInt.writeVarInt(origin, byteBuffer);

    byteBuffer.flip();

    int fin = VarInt.readVarint(byteBuffer);

    Assert.assertEquals(origin, fin);
```