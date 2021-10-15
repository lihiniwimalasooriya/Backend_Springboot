package com.begood.begoodsolution.controller;

import com.begood.begoodsolution.model.Vehicle;
import com.begood.begoodsolution.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public String addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.saveVehicle(vehicle);
        return "Add vehicle details successfully";
    }

    @GetMapping("/getAll")
    public List<Vehicle> list() {
        return vehicleService.getAllVehicle();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteVehicle(@PathVariable("id") int id) {
        vehicleService.deleteVehicle(id);
    }
}
