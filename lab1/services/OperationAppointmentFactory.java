package services;

import entities.Appointment;
import entities.Patient;
import entitiesImpl.OperationAppointment;
import java.util.Scanner;

public class OperationAppointmentFactory implements AppointmentFactory{

    @Override
    public Appointment create(int id, String description, Patient patient, Scanner sc) {
        System.out.println("Введите название операции");
        String operationName = sc.nextLine();
        return new OperationAppointment(id, description, patient, operationName);
    }
    
}
