package entities;

public class Patient {
    
    private int id;
    private String name;
    private Staff doctor;
    private boolean isDischarged = false;

    public Patient() {}

    public Patient(int id, String name, Staff doctor, boolean isDischarged) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.isDischarged = isDischarged;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Staff getDoctor() {
        return this.doctor;
    }

    public boolean getIsDischarged() {
        return isDischarged;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctor(Staff doctor) {
        this.doctor = doctor;
    }

    public void setIsDischarged(boolean isDischarged) {
        this.isDischarged = isDischarged;
    }
}
