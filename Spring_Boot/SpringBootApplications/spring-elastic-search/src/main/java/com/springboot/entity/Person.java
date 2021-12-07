package com.springboot.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "persons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {
    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "lastName", type = FieldType.Text)
    private String lastName;

    @Field(name = "address", type = FieldType.Text)
    private String address;

    @Field(name = "dateOfBirth", type = FieldType.Text)
    private Date dateOfBirth;
}
