package com.example;

import com.example.controller.EngineController;
import com.example.model.EngineModel;
import com.example.view.EngineView;

public class Main {

    public static void main(String[] args) {
        // Создаем модель двигателя
        EngineModel engine = new EngineModel();
        engine.setType("Бензиновый");
        engine.setPower(150.0);

        // Создаем два представления для одной модели
        EngineView view1 = new EngineView(engine);
        EngineView view2 = new EngineView(engine);

        // Выводим начальное состояние
        System.out.println("Начальное состояние:");
        view1.printDetails();
        view2.printDetails();

        // Создаем контроллер и изменяем данные
        EngineController controller = new EngineController(engine);
        System.out.println("После изменения через контроллер:");
        controller.setEngineType("Дизельный");
        controller.setEnginePower(190.5);
    }
}