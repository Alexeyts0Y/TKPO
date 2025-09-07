package services;

import entities.*;
import java.util.*;

public class AppointmentCreator {

    private final Map<Integer, AppointmentFactory> factories = new HashMap<>();
    private Scanner scanner ;

    public AppointmentCreator() {}
    
    public AppointmentCreator(Scanner scanner) {
        this.scanner = scanner;
        factories.put(1, new ProcedureAppointmentFactory());
        factories.put(2, new MedicineAppointmentFactory());
        factories.put(3, new OperationAppointmentFactory());
    }
    
    public Appointment createAppointment(int id, Patient patient) {
        System.out.println("1. Процедуры");
        System.out.println("2. Лекарства");
        System.out.println("3. Операции");
        System.out.println("Выберите вид назначения (выберите цифру):");

        int choice = scanner.nextInt();
        scanner.nextLine();

        AppointmentFactory factory = factories.get(choice);
        if (factory == null) {
            throw new IllegalArgumentException("Некорректный вид назначения");
        }

        System.out.println("Введите описание назначения:");
        String description = scanner.nextLine();

        return factory.create(id, description, patient, scanner);
    }
}
