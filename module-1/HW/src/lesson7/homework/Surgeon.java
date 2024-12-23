package lesson7.homework;

class Surgeon extends Doctor {
  @Override
  public void treat(Patient patient) {
      System.out.println("Surgeon is treating the patient: " + patient.getName());
  }
}
