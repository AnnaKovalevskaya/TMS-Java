package lesson7.homework;

class Dentist extends Doctor {
  @Override
  public void treat(Patient patient) {
      System.out.println("Dentist is treating the patient: " + patient.getName());
  }
}
