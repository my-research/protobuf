package com.github.dhslrl321.app.step3;

import com.github.dhslrl321.AddressBookProtos.AddressBook;
import com.github.dhslrl321.app.step3.helper.Fixtures;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Byte_SerializeTest {

    @Test
    @DisplayName("byte 를 통해 s/d 를 수행한다")
    void name() throws Exception {
        AddressBook addressBook = Fixtures.anyAddressBook();

        AddressBook actual = AddressBook.parseFrom(addressBook.toByteArray());

        System.out.println("actual = " + actual);

        assertThat(actual).isEqualTo(addressBook);
    }
}
