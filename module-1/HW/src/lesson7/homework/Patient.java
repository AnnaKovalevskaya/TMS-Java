package lesson7.homework;

class Patient {
    private String name;
    private String treatmentPlan;
    private Doctor doctor;

    public Patient(String name, String treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }
}
