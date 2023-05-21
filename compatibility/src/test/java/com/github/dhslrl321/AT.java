package com.github.dhslrl321;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Test;

public class AT {
    @Test
    void name() throws InvalidProtocolBufferException {

        Personal jang = Personal.newBuilder()
                .setId(123)
                .setName("jang")
                .build();

        ByteString bytes = jang.toByteString();

        System.out.println("bytes = " + bytes);
        // reader
        Personal personal = Personal.parseFrom(bytes);

        System.out.println("personal = " + personal);
    }
}
