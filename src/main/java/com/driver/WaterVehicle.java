package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}


class boat implements WaterVehicle{
    String name;
    int capacity;

    public String getVehicleName(){
        return name;
    }

    public int getVehicleCapacity(){
        return capacity;
    }
}
