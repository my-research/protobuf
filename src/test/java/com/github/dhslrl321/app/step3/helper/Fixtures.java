package com.github.dhslrl321.app.step3.helper;

import com.github.dhslrl321.AddressBookProtos;
import com.github.dhslrl321.app.step2.helper.AddressBookFactory;

public class Fixtures {

    static AddressBookFactory factory = new AddressBookFactory();

    public static AddressBookProtos.AddressBook anyAddressBook() {
        AddressBookProtos.Person.PhoneNumber mobile = factory.phone("010-1234-1234", AddressBookProtos.Person.PhoneType.MOBILE);
        AddressBookProtos.Person.PhoneNumber home = factory.phone("010-1234-1234", AddressBookProtos.Person.PhoneType.HOME);

        AddressBookProtos.Person jang = factory.person("jang", "jang@gmail.com", mobile, home);

        return AddressBookProtos.AddressBook.newBuilder()
                .addPeople(jang)
                .build();
    }
}
