package com.springboot.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class PersonDto {
    private Long id;
    private String firstName;
    private String lastName;
    private List<String> address;

}

