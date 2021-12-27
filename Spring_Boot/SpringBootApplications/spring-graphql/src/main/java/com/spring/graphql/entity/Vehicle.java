/**
 * Created by abuzer.alaca on 27/12/2021
 **/


package com.spring.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vehicle")
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "vehicle_type", length = 100)
    private String type;

    @Column(name = "model_code", length = 100)
    private String modelCode;

    @Column(name = "brand_name", length = 100)
    private String brandName;

    @Column(name = "launch_date", length = 100)
    private Date launchDate;

}
