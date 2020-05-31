package com.zman.varint;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;

public class VarIntTest {

    @Test
    public void test(){
        int origin = 1234774;

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        VarInt.writeVarInt(origin, byteBuffer);

        byteBuffer.flip();

        int fin = VarInt.readVarint(byteBuffer);

        Assert.assertEquals(origin, fin);
    }


}
