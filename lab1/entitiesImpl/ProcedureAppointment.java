package entitiesImpl;

import entities.Appointment;
import entities.Patient;

public class ProcedureAppointment extends Appointment {
    
    private final String procedureName;

    public ProcedureAppointment(int id, String description, Patient patient, String procedureName) {
        super(id, description, patient);
        this.procedureName = procedureName;
    }

    @Override
    public void execute() {
        System.out.println("Проводим процедуру \"" + this.procedureName + "\" над пациентом " + patient.getName());
    }
}
