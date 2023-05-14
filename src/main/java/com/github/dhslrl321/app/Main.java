package com.github.dhslrl321.app;


import com.github.dhslrl321.Person;

import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        Person jang = Person.newBuilder().setId(Instant.now().toEpochMilli()).setAge(10).setName("jang").build();

        System.out.println("jang = " + jang);
    }

}
