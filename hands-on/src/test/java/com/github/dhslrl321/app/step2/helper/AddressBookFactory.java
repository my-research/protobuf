package com.github.dhslrl321.app.step2.helper;

import com.github.dhslrl321.AddressBookProtos.Person;
import com.github.dhslrl321.AddressBookProtos.Person.PhoneNumber;
import com.github.dhslrl321.AddressBookProtos.Person.PhoneType;

import java.time.Instant;
import java.util.List;

public class AddressBookFactory {
    public Person person(String name, String email, PhoneNumber ... phone) {

        long id = Instant.now().toEpochMilli();

        return Person.newBuilder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .addAllPhones(List.of(phone))
                .build();
    }

    public PhoneNumber phone(String number, PhoneType type) {
        return PhoneNumber.newBuilder()
                .setNumber(number)
                .setType(type)
                .build();
    }
}
