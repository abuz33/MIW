/**
 * Created by abuzer.alaca on 27/12/2021
 **/


package com.spring.graphql.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.graphql.dto.VehicleDTO;
import com.spring.graphql.entity.Vehicle;
import com.spring.graphql.repo.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver {
    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDTO vehicleDTO) {
        return vehicleRepository.save(dtoToEntity(vehicleDTO));
    }

    private Vehicle dtoToEntity(VehicleDTO vehicleDTO) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName(vehicleDTO.getBrandName());
        vehicle.setModelCode(vehicleDTO.getModelCode());
        vehicle.setLaunchDate(new Date());
        vehicle.setType(vehicleDTO.getType());
        return vehicle;
    }
}
