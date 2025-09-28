package services;

import entities.Appointment;
import entities.Patient;
import entitiesImpl.MedicineAppointment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicineAppointmentFactory implements AppointmentFactory{

    @Override
    public Appointment create(int id, String description, Patient patient, Scanner scanner) {
        System.out.println("Введите кол-во назначаемых лекарств:");
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> medicineList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите название " + (i + 1) + "-го лекарства");
            String medicine = scanner.nextLine();
            medicineList.add(medicine);
        }
        return new MedicineAppointment(id, description, patient, medicineList);
    }
    
}
