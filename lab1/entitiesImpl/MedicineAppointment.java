package entitiesImpl;

import entities.Appointment;
import entities.Patient;
import java.util.*;

public class MedicineAppointment extends Appointment {

    private final List<String> medicineList;

    public MedicineAppointment(int id, String description, Patient patient, List<String> medicineList) {
        super(id, description, patient);
        this.medicineList = medicineList;
    }

    @Override
    public void execute() {
        System.out.println("Лекарства " + medicineList + " выданы пациенту " + patient.getName());
    }
    
}
