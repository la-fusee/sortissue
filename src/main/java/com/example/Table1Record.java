package com.example;

import io.micronaut.data.annotation.EmbeddedId;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@MappedEntity
@Serdeable
@Table(
        name = "TABLE1"
)
public record Table1Record(

        @EmbeddedId
        Table1Key key,

        @Column(name="FLD1")
        BigDecimal fld1,
        @Column(name="FLD2")
        String     fld2

) {
}
