package com.github.dhslrl321.app.step1;

import com.github.dhslrl321.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    @Test
    void name() {

        Person.Builder personBuilder = Person.newBuilder();

        Person actual = personBuilder
                .setId(1004)
                .setName("jang")
                .setAge(10)
                .build();

        System.out.println("actual = " + actual);

        assertThat(actual.getId()).isEqualTo(1004);
        assertThat(actual.getName()).isEqualTo("jang");
        assertThat(actual.getAge()).isEqualTo(10);
    }
}
