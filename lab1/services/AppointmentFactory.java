package services;

import entities.Appointment;
import entities.Patient;
import java.util.Scanner;

public interface AppointmentFactory {
    Appointment create(int id, String description, Patient patient, Scanner sc);
}
