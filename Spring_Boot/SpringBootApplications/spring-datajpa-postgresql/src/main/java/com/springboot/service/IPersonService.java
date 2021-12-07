package com.springboot.service;

import com.springboot.dto.PersonDto;
import com.springboot.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonService {
    PersonDto save(PersonDto personDto);

    void delete();

    List<PersonDto> getAll();

    Page<Person> getAll(Pageable pageable);
}
