package com.housingapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.housingapp.model.House;
import com.housingapp.model.Property;
import com.housingapp.model.SummerHouse;
import com.housingapp.model.Villa;
import com.housingapp.repository.PropertyRepository;

public class PropertyService {
    private PropertyRepository repository;
    
    public PropertyService() {
        this.repository = new PropertyRepository();
    }
    
    public int getTotalPriceOfHouses() {
        return repository.getHouseList().stream()
                .mapToInt(Property::getPrice)
                .sum();
    }
    
    public int getTotalPriceOfVillas() {
        return repository.getVillaList().stream()
                .mapToInt(Property::getPrice)
                .sum();
    }
    
    public int getTotalPriceOfSummerHouses() {
        return repository.getSummerHouseList().stream()
                .mapToInt(Property::getPrice)
                .sum();
    }
    
    public int getTotalPriceOfAllProperties() {
        return repository.getAllPropertyList().stream()
                .mapToInt(Property::getPrice)
                .sum();
    }
    
    public double getAverageSquareMetersOfHouses() {
        List<House> houses = repository.getHouseList();
        return houses.stream()
                .mapToInt(Property::getSquareMeters)
                .average()
                .orElse(0);
    }
    
    public double getAverageSquareMetersOfVillas() {
        List<Villa> villas = repository.getVillaList();
        return villas.stream()
                .mapToInt(Property::getSquareMeters)
                .average()
                .orElse(0);
    }
    
    public double getAverageSquareMetersOfSummerHouses() {
        List<SummerHouse> summerHouses = repository.getSummerHouseList();
        return summerHouses.stream()
                .mapToInt(Property::getSquareMeters)
                .average()
                .orElse(0);
    }
    
    public double getAverageSquareMetersOfAllProperties() {
        List<Property> allProperties = repository.getAllPropertyList();
        return allProperties.stream()
                .mapToInt(Property::getSquareMeters)
                .average()
                .orElse(0);
    }
    
    // Filters and returns all types of properties based on the number of rooms and living rooms
    public List<Property> filterPropertiesByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms) {
        return repository.getAllPropertyList().stream()
                .filter(property -> property.getNumberOfRooms() == numberOfRooms && 
                                 property.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
}
