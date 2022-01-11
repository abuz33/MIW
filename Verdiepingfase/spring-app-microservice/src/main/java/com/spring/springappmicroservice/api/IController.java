/**
 * Created by abuzer.alaca on 31/12/2021
 **/

package com.spring.springappmicroservice.api;

import com.spring.springappmicroservice.entity.Account;
import org.springframework.http.ResponseEntity;

public interface IController<T> {
    ResponseEntity<T> get(String id);

    ResponseEntity<T> save(T t);

    ResponseEntity<T> update(T t);

    void delete(String id);

    ResponseEntity<T> pagination();
}
