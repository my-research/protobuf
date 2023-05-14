package com.github.dhslrl321.app.step2;

import com.github.dhslrl321.AddressBookProtos.AddressBook;
import com.github.dhslrl321.AddressBookProtos.Person;
import com.github.dhslrl321.AddressBookProtos.Person.PhoneNumber;
import com.github.dhslrl321.app.step2.helper.AddressBookFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * messages are all immutable
 */
public class AddressBookTest {

    AddressBookFactory factory = new AddressBookFactory();

    @Test
    @DisplayName("중첩 객체에 대한 proto")
    void name() {

        PhoneNumber mobile = factory.phone("010-1234-1234", Person.PhoneType.MOBILE);
        PhoneNumber home = factory.phone("010-1234-1234", Person.PhoneType.HOME);

        Person jang = factory.person("jang", "jang@gmail.com", mobile, home);

        AddressBook actual = AddressBook.newBuilder()
                .addPeople(jang)
                .build();

        System.out.println("addressBook = " + actual);
    }
}
