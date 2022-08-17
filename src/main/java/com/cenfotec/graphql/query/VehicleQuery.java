package com.cenfotec.graphql.query;

import com.cenfotec.graphql.entities.Vehicle;
import com.cenfotec.graphql.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VehicleQuery implements GraphQLQueryResolver {
    @Autowired
    private VehicleService vehicleService;
    public List<Vehicle> getVehicles(int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(int id) {
        return this.vehicleService.getVehicle(id);
    }

}
