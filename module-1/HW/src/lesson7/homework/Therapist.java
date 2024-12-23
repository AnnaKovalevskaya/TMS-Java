package lesson7.homework;

class Therapist extends Doctor {
  @Override
  public void treat(Patient patient) {
      System.out.println("Therapist is treating the patient: " + patient.getName());
  }

  public void assignDoctor(Patient patient) {
      switch (patient.getTreatmentPlan()) {
          case "1":
              patient.setDoctor(new Surgeon());
              break;
          case "2":
              patient.setDoctor(new Dentist());
              break;
          default:
              patient.setDoctor(this);
              break;
      }
      patient.getDoctor().treat(patient);
  }
}
