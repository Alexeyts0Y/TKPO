package services;

import entities.Appointment;

public class AppointmentExecutor {
    
    public void executeAppointment(Appointment appointment) {
        appointment.execute();
    }
}
