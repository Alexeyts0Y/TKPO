package services;

import java.util.Scanner;

import entities.Appointment;
import entities.Patient;

public interface AppointmentFactory {
    Appointment create(int id, String description, Patient patient, Scanner sc);
}
