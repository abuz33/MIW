package com.springboot.service;

import com.springboot.dto.PersonDto;
import com.springboot.entity.Address;
import com.springboot.entity.Person;
import com.springboot.repo.AddressRepo;
import com.springboot.repo.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class PersonService implements IPersonService {
    private final PersonRepo personRepo;
    private final AddressRepo addressRepo;

    @PostConstruct
    public void add() {
        Person person = new Person();
        person.setFirstName("Abuzer");
        person.setLastName("ALACA");
        Person personDb = personRepo.save(person);
        List<Address> list = new ArrayList<>();
        Address adres1 = new Address();
        adres1.setAddress("EchterNachlaan 236");
        adres1.setAddressType(Address.AddressType.OTHER);
        adres1.setPerson(personDb);
        list.add(adres1);
        Address adres2 = new Address();
        adres2.setAddress("Ag 2");
        adres2.setAddressType(Address.AddressType.OTHER);
        adres2.setPerson(personDb);
        list.add(adres2);
        addressRepo.saveAll(list);
    }

    @Override
    @Transactional
    public PersonDto save(PersonDto personDto) {
        if (personDto.getFirstName().equals("")) throw new IllegalCallerException("");
        Person person = new Person();
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        Person personDb = personRepo.save(person);
        List<Address> list = new ArrayList<>();
        personDto.getAddress().forEach(adr -> {
            Address adres = new Address();
            adres.setAddress(adr);
            adres.setAddressType(Address.AddressType.OTHER);
            adres.setPerson(personDb);
            list.add(adres);
        });
        addressRepo.saveAll(list);
        personDto.setId(personDb.getId());
        return personDto;
    }

    @Override
    public void delete() {

    }

    @Override
    public List<PersonDto> getAll() {
        List<Person> persons = personRepo.findAll();
        List<PersonDto> list = new ArrayList<>();
        persons.forEach(it -> {
            PersonDto personDto = new PersonDto();
            personDto.setId(it.getId());
            personDto.setFirstName(it.getFirstName());
            personDto.setLastName(it.getLastName());
            personDto.setAddress(it.getAddresses().stream().map(Address::getAddress).collect(Collectors.toList()));
            list.add(personDto);
        });
        return list;
    }

    @Override
    public Page<Person> getAll(Pageable pageable) {
        return null;
    }
}
