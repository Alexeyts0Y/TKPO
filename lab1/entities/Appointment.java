package entities;

public abstract class Appointment {
    
    protected int id;
    protected String description;
    protected Patient patient;

    public Appointment() {}

    public Appointment(int id, String descritpion, Patient patient) {
        this.id = id;
        this.description = descritpion;
        this.patient = patient;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public abstract void execute();
}
