package services;

import entities.Appointment;
import entities.Patient;
import entitiesImpl.ProcedureAppointment;
import java.util.Scanner;

public class ProcedureAppointmentFactory implements AppointmentFactory{

    @Override
    public Appointment create(int id, String description, Patient patient, Scanner sc) {
        System.out.println("Введите название процедуры:");
        String procedureName = sc.nextLine();
        return new ProcedureAppointment(id, description, patient, procedureName);
    }
    
}
