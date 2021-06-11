package com.teste;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void checkEquality() {
        Person person= new Person("Barrack", "Obama");
        //Person personClone = person;//passa
        Person personClone = new Person("Barrack", "Obama");//falha

        assertThat(person).isEqualTo(personClone);
    }
}
