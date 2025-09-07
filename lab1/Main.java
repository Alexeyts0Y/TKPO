import entities.*;
import entitiesImpl.Doctor;
import java.util.Scanner;
import services.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentCreator creator = new AppointmentCreator(scanner);
        AppointmentExecutor executor = new AppointmentExecutor();

        Staff doctor1 = new Doctor(1, "Иванов Иван Иванович");
        Patient patient1 = new Patient(1, "Александр", doctor1, false);

        Appointment appointment1 = creator.createAppointment(1, patient1);
        executor.executeAppointment(appointment1);
    }
}