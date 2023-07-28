package com.example;

import io.micronaut.data.annotation.Embeddable;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;

import java.math.BigDecimal;

@Embeddable
@Serdeable
public record Table1Key(

        @Column(name="KEY1")
        BigDecimal key1,
        @Column(name="KEY2")
        BigDecimal key2

) {
}
