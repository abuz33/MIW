/**
 * Created by abuzer.alaca on 27/12/2021
 **/


package com.spring.rc.api;

import com.spring.rc.model.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/test")
public class RestClientController {
    private static final String URL = "http://localhost:8080/person";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<PersonDto>> getPersonList() {
        ResponseEntity<List> result = restTemplate.getForEntity(URL, List.class);
        List<PersonDto> dtos = result.getBody();
        System.out.println(dtos.get(1));
        return ResponseEntity.ok(dtos);
    }

    @PostMapping
    public ResponseEntity<PersonDto> save(@RequestBody PersonDto personDto) {
        System.out.println(personDto);
        ResponseEntity<PersonDto> result = restTemplate.postForEntity(URL, personDto, PersonDto.class);
        PersonDto responseBody = result.getBody();
        return responseBody != null ? ResponseEntity.ok(responseBody) : ResponseEntity.badRequest().build();
    }
}
