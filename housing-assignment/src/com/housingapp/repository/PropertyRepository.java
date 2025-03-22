package com.housingapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.housingapp.model.House;
import com.housingapp.model.Property;
import com.housingapp.model.SummerHouse;
import com.housingapp.model.Villa;

public class PropertyRepository {
    
    public List<House> getHouseList() {
        List<House> houses = new ArrayList<>();
        
        houses.add(new House(3000000, 120, 3, 1));
        houses.add(new House(3500000, 140, 3, 1));
        houses.add(new House(4000000, 160, 4, 1));
        
        return houses;
    }
    
    public List<Villa> getVillaList() {
        List<Villa> villas = new ArrayList<>();
        
        villas.add(new Villa(7000000, 250, 5, 2));
        villas.add(new Villa(8000000, 300, 6, 2));
        villas.add(new Villa(9000000, 350, 7, 3));
        
        return villas;
    }
    
    public List<SummerHouse> getSummerHouseList() {
        List<SummerHouse> summerHouses = new ArrayList<>();
        
        summerHouses.add(new SummerHouse(4500000, 180, 4, 1));
        summerHouses.add(new SummerHouse(5000000, 200, 4, 1));
        summerHouses.add(new SummerHouse(6500000, 220, 5, 2));
        
        return summerHouses;
    }
    
    public List<Property> getAllPropertyList() {
        List<Property> allProperties = new ArrayList<>();
        
        allProperties.addAll(getHouseList());
        allProperties.addAll(getVillaList());
        allProperties.addAll(getSummerHouseList());
        
        return allProperties;
    }
}
