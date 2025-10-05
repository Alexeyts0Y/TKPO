package com.example;

import com.example.adapter.adapter_impl.GasCylinderAdapter;
import com.example.adapter.interfaces.IGasCylinder;
import com.example.facade.facade_impl.TravelFacade;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Демонстрация адаптера ===");
        IGasCylinder cylinder = new GasCylinderAdapter(0.05, 0.1, 0.032);
        System.out.println(cylinder.Passport());
        
        System.out.printf("Давление при 20°C: %.2f Па%n", 
                         ((GasCylinderAdapter)cylinder).GetPressure(20));
        System.out.printf("Изменение давления от 20°C до 30°C: %.2f Па%n", 
                         cylinder.GetDp(20, 30));
        
        cylinder.ModifVolume(0.01);
        System.out.println("После увеличения объема на 0.01 м3:");
        System.out.println(cylinder.Passport());

        System.out.println("\n=== Демонстрация фасада ===");
        TravelFacade facade = new TravelFacade();
        
        facade.createBeachHoliday(10, "Турция", 4, "всё включено");
        facade.createExcursion(7, "Италия", 3, "трехразовый");
        facade.createSkiing(14, "Франция", 4, "двухразовый");
        
        System.out.printf("Стоимость пляжного отдыха: %.2f Руб.%n", facade.getBeachCost());
        System.out.printf("Стоимость экскурсии: %.2f Руб.%n", facade.getExcursionCost());
        System.out.printf("Стоимость горнолыжного тура: %.2f Руб.%n", facade.getSkiingCost());
    }
}