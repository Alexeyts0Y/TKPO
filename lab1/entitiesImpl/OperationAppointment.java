package entitiesImpl;

import entities.Appointment;
import entities.Patient;

public class OperationAppointment extends Appointment {

    private final String operationName;

    public OperationAppointment(int id, String description, Patient patient, String operationName) {
        super(id, description, patient);
        this.operationName = operationName;
    }

    @Override
    public void execute() {
        System.out.println("Операция \"" + operationName + "\" произведена пациенту " + patient.getName());
    }
    
}
