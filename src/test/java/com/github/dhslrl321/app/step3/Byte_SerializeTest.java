package com.github.dhslrl321.app.step3;

import com.github.dhslrl321.AddressBookProtos;
import com.github.dhslrl321.AddressBookProtos.AddressBook;
import com.github.dhslrl321.app.step3.helper.Fixtures;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Byte_SerializeTest {

    @Test
    @DisplayName("byte 를 통해 s/d 를 수행한다")
    void name() throws Exception {
        AddressBook addressBook = Fixtures.anyAddressBook();

        AddressBook actual = AddressBook.parseFrom(addressBook.toByteArray());

        assertThat(actual).isEqualTo(addressBook);
    }
}
