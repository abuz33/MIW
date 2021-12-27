/**
 * Created by abuzer.alaca on 27/12/2021
 **/

package com.spring.graphql.repo;

import com.spring.graphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> getByTypeLike(String type);

//    List<Vehicle> getByModelCodeOrBrandName(String type);
}
