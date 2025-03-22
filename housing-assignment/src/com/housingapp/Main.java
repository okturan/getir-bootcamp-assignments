package com.housingapp;

import java.util.List;

import com.housingapp.model.Property;
import com.housingapp.service.PropertyService;
import com.housingapp.util.CurrencyFormatter;

public class Main {
    public static void main(String[] args) {
        PropertyService service = new PropertyService();
        
        // Print total prices
        System.out.println("===== TOTAL PRICES =====");
        System.out.println("Total price of all Houses:\t\t₺" + CurrencyFormatter.formatCurrency(service.getTotalPriceOfHouses()));
        System.out.println("Total price of all Villas:\t\t₺" + CurrencyFormatter.formatCurrency(service.getTotalPriceOfVillas()));
        System.out.println("Total price of all Summer Houses:\t₺" + CurrencyFormatter.formatCurrency(service.getTotalPriceOfSummerHouses()));
        System.out.println("Total price of all types of properties:\t₺" + CurrencyFormatter.formatCurrency(service.getTotalPriceOfAllProperties()));
        System.out.println();
        
        // Print average square meters
        System.out.println("===== AVERAGE SQUARE METERS =====");
        System.out.printf("Average square meters of Houses:\t\t  %.2f m²\n", service.getAverageSquareMetersOfHouses());
        System.out.printf("Average square meters of Villas:\t\t  %.2f m²\n", service.getAverageSquareMetersOfVillas());
        System.out.printf("Average square meters of Summer Houses:\t\t  %.2f m²\n", service.getAverageSquareMetersOfSummerHouses());
        System.out.printf("Average square meters of all types of properties: %.2f m²\n", service.getAverageSquareMetersOfAllProperties());
        System.out.println();
        
        // Filter properties by room and living room count
        System.out.println("===== FILTERED PROPERTIES =====");
        
        List<Property> filteredProperties1 = service.filterPropertiesByRoomAndLivingRoom(3, 1);
        System.out.println("Properties with 3 rooms and 1 living room:");
        printPropertyList(filteredProperties1);
        
        List<Property> filteredProperties2 = service.filterPropertiesByRoomAndLivingRoom(4, 1);
        System.out.println("\nProperties with 4 rooms and 1 living room:");
        printPropertyList(filteredProperties2);
        
        List<Property> filteredProperties3 = service.filterPropertiesByRoomAndLivingRoom(5, 2);
        System.out.println("\nProperties with 5 rooms and 2 living rooms:");
        printPropertyList(filteredProperties3);

        List<Property> filteredProperties4 = service.filterPropertiesByRoomAndLivingRoom(10, 5);
        System.out.println("\nProperties with 10 rooms and 5 living rooms:");
        printPropertyList(filteredProperties4);
    }
    
    // Helper method to print a list of properties
    private static void printPropertyList(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("\t#No properties found with these criteria#");
        } else {
            for (Property property : properties) {
                System.out.println("\t" + property);
            }
        }
    }
}
