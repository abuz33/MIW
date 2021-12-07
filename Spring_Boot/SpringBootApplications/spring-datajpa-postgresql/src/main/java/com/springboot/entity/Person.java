package com.springboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Person {
    @Id
    @SequenceGenerator(name = "seq_person", allocationSize = 1)
    @GeneratedValue(generator = "seq_person", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name", length = 100)
    private String firstName;
    @Column(name = "lastname", length = 100)
    private String lastName;

    @OneToMany
    @JoinColumn(name = "person_address_id")
    private List<Address> addresses;

}
