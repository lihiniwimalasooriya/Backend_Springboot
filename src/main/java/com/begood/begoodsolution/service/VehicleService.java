package com.begood.begoodsolution.service;

import com.begood.begoodsolution.model.Vehicle;
import java.util.List;

public interface VehicleService {
    public Vehicle saveVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicle();
    public void deleteVehicle(int id); 
}
